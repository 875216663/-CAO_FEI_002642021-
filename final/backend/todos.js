const uuid = require('uuid').v4;

function makeTodoList() {
  const id1 = uuid();
  const id2 = uuid();
  const id3 = uuid();


  const todoList = {};
  const todos = {
    [id1]: {
      id: id1,
      name: '6210 Homework',
      done: false,
      startTime: '2024-01-06T11:39',
      endTime: '2024-01-06T11:39',
    },
    [id2]: {
      id: id2,
      name: '6250 Project',
      done: true,
      startTime: '2021-01-06T11:39',
      endTime: '2022-01-06T11:39',
    },
    [id3]: {
      id: id3,
      name: 'Ielts',
      done: false,
      startTime: '2022-01-06T11:39',
      endTime: '2023-01-06T11:39',
    },
  };

  //这个函数是用来判断是否存在某个id的todo
  todoList.contains = function contains(id) {
    return !!todos[id];
  };

  //这个函数是用来获取所有的todo
  todoList.getTodos = function getTodos() {
    //返回一个排序后的todo数组
    return Object.values(todos).sort((a, b) => a.startTime.localeCompare(b.startTime));
  };
  //这个函数是用来添加一个todo
  todoList.addTodo = function addTodo(task) {
    const useid = uuid();
    todos[useid] = {
      id: useid,
      name: task.name || 'Default Task Name', // Default name if none provided
      done: false,
      startTime: task.startTime,
      endTime: task.endTime,
    };
    return useid; // Return the new todo's ID
  };
  

  //这个函数是用来获取某个id的todo
  todoList.getTodo = function getTodo(id) {
    return todos[id];
  };

  //这个函数是用来更新某个id的todo
  todoList.updateTodo = function updateTodo(id, task) {
    todos[id].done = task.done ?? todos[id].done;
    todos[id].name = task.name || todos[id].name;
    todos[id].startTime = task.startTime || todos[id].startTime;
    todos[id].endTime = task.endTime || todos[id].endTime;
  };

  //这个函数是用来删除某个id的todo
  todoList.deleteTodo = function deleteTodo(id) {
    delete todos[id];
  };

  return todoList;
};

module.exports = {
  makeTodoList,
};
