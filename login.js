const usernameinput = document.getElementById("username");
const passwordinput = document.getElementById("password");
const loginButton = document.getElementById("loginBtn");
const message = document.getElementById("message");
// add an event listener for the login button
loginButton.addEventListener("click", checkLogin);

// fuction that runs onclick of the button
function checkLogin(){
    const username = usernameinput.value;
    const password = passwordinput.value;

    // check for empty fields
    if (username == "" || password === ""){
        message.textContent = "Please fill all fields";
        return;
    }

    // success message
    message.style.color = "green";
    message.textContent = "Login successful!";
}
