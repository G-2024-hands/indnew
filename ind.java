document.getElementById('login-form').addEventListener('submit', function(e) {
    e.preventDefault();
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // Simplified example of login
    if(username === 'user' && password === 'password') {
        document.querySelector('.login-container').classList.add('hidden');
        document.getElementById('profile').classList.remove('hidden');
        document.getElementById('username-display').innerText = `Welcome, ${username}`;
        document.getElementById('earnings').innerText = `Earnings: $1000`;
        // Simulated profile picture
        document.getElementById('profile-pic').src = 'profile-pic.jpg';
    } else {
        alert('Incorrect username or password');
    }
});

document.getElementById('logout').addEventListener('click', function() {
    document.getElementById('profile').classList.add('hidden');
    document.querySelector('.login-container').classList.remove('hidden');
});
