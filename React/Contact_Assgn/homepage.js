
document.addEventListener('DOMContentLoaded', function () {
  const usersList = document.getElementById('usersList')

  function displayUsers() {
    const users = JSON.parse(localStorage.getItem('users')) || [];
    usersList.innerHTML = '';
    if (users.length === 0) {
      usersList.innerHTML = '<p>No contacts</p>';
    }else{
    users.forEach((user, index) => {
      const userCard = document.createElement('div');
      userCard.className = 'card';
      userCard.innerHTML = `
        <h3>${user.firstName} ${user.lastName}</h3>
        <p>Phone: ${user.phoneNumber}</p>
        <p>Email: ${user.email}</p>
        <p>Address: ${user.address}</p>
        <button onclick="editUser(${index})">Edit</button>
        <button onclick="deleteUser(${index})">Delete</button>
      `;
      usersList.appendChild(userCard);
    });
  }
}

  window.editUser = function (index) {
    const users = JSON.parse(localStorage.getItem('users'));
    const user = users[index];
    localStorage.setItem('editUserIndex', index);
    localStorage.setItem('userToEdit', JSON.stringify(user));
    window.location.href = 'ContactPage.html';
  };

  window.deleteUser = function (index) {
    let users = JSON.parse(localStorage.getItem('users'));
    users.splice(index, 1);
    localStorage.setItem('users', JSON.stringify(users));
    displayUsers();
  };

  displayUsers();
});
