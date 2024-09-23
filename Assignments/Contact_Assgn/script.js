function toggleAddressField() {
  const addressField = document.getElementById('addressField');
  addressField.style.display = 'block';
}

document.addEventListener('DOMContentLoaded', function () {
  const form = document.getElementById("contactInfo");
  const submitBtn = document.getElementById('sub-btn');
  const inputs = form.querySelectorAll('input[required]');
  const phone = document.getElementById('phoneNumber');
  const email = document.getElementById("email");
  const addressField = document.getElementById('addressField');
  const addressInput = document.getElementById('address');


  function validateEmail(email) {
    return email.includes('@')
  }

  function validateNumber(num) {
    const phoneReg = /^\d{10}$/;
    return phoneReg.test(String(num).trim());
  }

  function checkInputs() {
    const emailValid = validateEmail(email.value);
    const numberValid = validateNumber(phone.value);
    const allFilled = Array.from(inputs).every(input => input.value.trim() !== '');
    const addressValid = (addressField.style.display === 'block') && (addressInput.value.trim() !== '');
    

    if (emailValid && numberValid && allFilled && addressValid) {
      submitBtn.disabled = false;
    } else {
      submitBtn.disabled = true;
    }
  }

  function populateForm(data) {
    document.getElementById('firstName').value = data.firstName;
    document.getElementById('lastName').value = data.lastName;
    document.getElementById('phoneNumber').value = data.phoneNumber;
    document.getElementById('email').value = data.email;
    document.querySelector(`input[name="addressType"][value="${data.addressType}"]`).checked = true;
    toggleAddressField();
    document.getElementById('address').value = data.address;
  }

  const editUserIndex = localStorage.getItem('editUserIndex');
  if (editUserIndex !== null) {
    const userToEdit = JSON.parse(localStorage.getItem('userToEdit'));
    populateForm(userToEdit);

    form.addEventListener('submit', function (e) {
      e.preventDefault();
      const formData = {
        firstName: document.getElementById('firstName').value,
        lastName: document.getElementById('lastName').value,
        phoneNumber: phone.value,
        email: email.value,
        addressType: form.querySelector('input[name="addressType"]:checked').value,
        address: addressInput.value
      };

      let users = JSON.parse(localStorage.getItem('users'));
      users[editUserIndex] = formData;
      localStorage.setItem('users', JSON.stringify(users));

      localStorage.removeItem('editUserIndex');
      localStorage.removeItem('userToEdit');

      window.location.href = 'homepage.html';
    });
  } else { 
    form.reset();
    form.addEventListener('submit', function (e) {
    e.preventDefault();
    const formData = {
      firstName: document.getElementById('firstName').value,
      lastName: document.getElementById('lastName').value,
      phoneNumber: phone.value,
      email: email.value,
      addressType: form.querySelector('input[name="addressType"]:checked').value,
      address: addressInput.value
    };

    let users = JSON.parse(localStorage.getItem('users')) || [];
    users.push(formData);
    localStorage.setItem('users', JSON.stringify(users));

    window.location.href = 'Homepage.html';
  });
}

  inputs.forEach(input => input.addEventListener('input', checkInputs));
  email.addEventListener('input', checkInputs);
  phone.addEventListener('input', checkInputs);
  addressInput.addEventListener('input', checkInputs);
});
  