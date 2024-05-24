//里面的形式是一个对象，对象的key是用户名，value是用户数据，数据是一个todo
const users = {

  // 'username': {
  //   todos: [
  //     {
  //       id: 1,
  //       title: 'todo 1',
  //       completed: false,
  //     },


};

function isValid(username) {
  let isValid = true;
  isValid = !!username && username.trim();
  isValid = isValid && username.match(/^[A-Za-z0-9_]+$/);
  return isValid;
}

function getUserData(username) {
  return users[username];
}

function addUserData(username, userData) {
  users[username] = userData;
}

module.exports = {
  isValid,
  getUserData,
  addUserData,
};
