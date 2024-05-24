const express = require('express');
const cookieParser = require('cookie-parser');

const app = express();
const PORT = process.env.PORT || 3000;

const todos = require('./todos');
const sessions = require('./sessions');
const users = require('./users');

app.use(cookieParser());
app.use(express.static('../frontend/dist')); 
app.use(express.json());


app.get('/api/session', (req, res) => {
  const sid = req.cookies.sid;
  const username = sid ? sessions.getSessionUser(sid) : '';
  if(!sid || !users.isValid(username)) {
    res.status(401).json({ error: 'auth-missing' });
    return;
  }
  res.json({ username });
});

//这个是用来创建一个session的，如果用户名不存在，就返回400，如果用户名是dog，就返回403，否则就创建一个session，然后返回用户的todo
app.post('/api/session', (req, res) => {
  const { username } = req.body;

  if(!users.isValid(username)) {
    res.status(400).json({ error: 'required-username' });
    return;
  }
  if(username === 'dog') {
    res.status(403).json({ error: 'auth-insufficient' });
    return;
  }
  const sid = sessions.addSession(username);
  const existingUserData = users.getUserData(username);

  if(!existingUserData) {
    users.addUserData(username, todos.makeTodoList());
  }
  res.cookie('sid', sid);
  //这里返回的是一个对象，对象的key是todos，value是用户的todo，不需要{}包裹整个返回值，因为返回的是一个对象
  res.json(users.getUserData(username).getTodos());
});

//这个是用来删除session的，如果session存在，就删除session，然后返回用户名，如果session不存在，就返回空
app.delete('/api/session', (req, res) => {
  const sid = req.cookies.sid;
  const username = sid ? sessions.getSessionUser(sid) : '';
  if(sid) {
    res.clearCookie('sid');
  }
  if(username) {
    // Delete the session, but not the user data
    sessions.deleteSession(sid);
  }

  //为什么要{}包裹username，因为这样返回的是一个对象，而不是一个字符串
  res.json({ username });
});



// Todos，这个是用来处理用户的todo的，这个函数是用来获取所有的todo
app.get('/api/todos', (req, res) => {
  const sid = req.cookies.sid;
  const username = sid ? sessions.getSessionUser(sid) : '';
  if(!sid || !users.isValid(username)) {
    res.status(401).json({ error: 'auth-missing' });
    return;
  }
  res.json(users.getUserData(username).getTodos());
});

//这个是用来添加一个todo的，如果没有task，就返回400，否则就添加一个todo，然后返回这个todo
app.post('/api/todos', (req, res) => {
  const sid = req.cookies.sid;
  const username = sid ? sessions.getSessionUser(sid) : '';
  if(!sid || !users.isValid(username)) {
    res.status(401).json({ error: 'auth-missing' });
    return;
  }
  const { task } = req.body;
  if(!task) {
    res.status(400).json({ error: 'required-task' });
    return;
  }
  const todoList = users.getUserData(username);
  const id = todoList.addTodo(task);
  res.json(todoList.getTodo(id));
});

//这个是用来获取某个id的todo的，如果没有这个id的todo，就返回404，否则就返回这个todo
app.get('/api/todos/:id', (req, res) => {
  const sid = req.cookies.sid;
  const username = sid ? sessions.getSessionUser(sid) : '';
  if(!sid || !users.isValid(username)) {
    res.status(401).json({ error: 'auth-missing' });
    return;
  }
  const todoList = users.getUserData(username);
  const { id } = req.params;
  if(!todoList.contains(id)) {
    res.status(404).json({ error: `noSuchId`, message: `No todo with id ${id}` });
    return;
  }
  res.json(todoList.getTodo(id));
});

//这个是用来更新某个id的todo的，如果没有task，就返回400，如果没有这个id的todo，就返回404，否则就更新这个todo，然后返回这个todo
app.put('/api/todos/:id', (req, res) => {
  const sid = req.cookies.sid;
  const username = sid ? sessions.getSessionUser(sid) : '';
  if(!sid || !users.isValid(username)) {
    res.status(401).json({ error: 'auth-missing' });
    return;
  }
  const todoList = users.getUserData(username);
  const { id } = req.params;
  const { task } = req.body;
  // Full Replacement required for a PUT
  if(!task) {
    res.status(400).json({ error: 'required-task' });
    return;
  }
  if(!todoList.contains(id)) {
    res.status(404).json({ error: `noSuchId`, message: `No todo with id ${id}` });
    return;
  }
  todoList.updateTodo(id, task);
  res.json(todoList.getTodo(id));
});

//这个是用来更新某个id的todo的，如果没有这个id的todo，就返回404，否则就更新这个todo，然后返回这个todo
app.patch('/api/todos/:id', (req, res) => {
  const sid = req.cookies.sid;
  const username = sid ? sessions.getSessionUser(sid) : '';
  if(!sid || !users.isValid(username)) {
    res.status(401).json({ error: 'auth-missing' });
    return;
  }
  const { id } = req.params;
  const { task } = req.body;
  const todoList = users.getUserData(username);
  if(!todoList.contains(id)) {
    res.status(404).json({ error: `noSuchId`, message: `No todo with id ${id}` });
    return;
  }
  todoList.updateTodo(id, task);
  res.json(todoList.getTodo(id));
});

//这个是用来更新某个id的todo的状态的，如果没有这个id的todo，就返回404，否则就更新这个todo的状态，然后返回这个todo
app.put('/api/todos/:id/status', (req, res) => {
  const sid = req.cookies.sid;
  const username = sid ? sessions.getSessionUser(sid) : '';
  if (!sid || !users.isValid(username)) {
    res.status(401).json({ error: 'auth-missing' });
    return;
  }
  const { id } = req.params;
  const todoList = users.getUserData(username);
  if (!todoList.contains(id)) {
    res.status(404).json({ error: `noSuchId`, message: `No todo with id ${id}` });
    return;
  }
  // Assuming the new status is sent in the request body
  const newStatus = todoList.getTodo(id).done ? false : true;
  todoList.updateTodo(id, { done: newStatus });
  res.json(todoList.getTodo(id));
});

//这个是用来删除某个id的todo的，如果存在这个id的todo，就删除这个todo，然后返回删除成功，否则就返回这个todo不存在
app.delete('/api/todos/:id', (req, res) => {
  const sid = req.cookies.sid;
  const username = sid ? sessions.getSessionUser(sid) : '';
  if (!sid || !users.isValid(username)) {
    res.status(401).json({ error: 'auth-missing' });
    return;
  }
  const { id } = req.params;
  const todoList = users.getUserData(username);
  const exists = todoList.contains(id);
  if (exists) {
    todoList.deleteTodo(id);
  }
  res.json({ message: exists ? `todo ${id} deleted` : `todo ${id} did not exist` });
});
app.listen(PORT, () => console.log(`http://localhost:${PORT}`));

