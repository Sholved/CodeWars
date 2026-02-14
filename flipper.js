const colors = [
    "red",
    "blue",
    "green",
    "yellow",
    "purple",
    "orange",
    "pink",
    "cyan",
    "lime",
    "violet"
]
//event listeners
const label = document.getElementById("colorlabel");
const button = document.getElementById("flipbutton");

// function to pick random colors
function flipcolor(){
    // pick a random position from the array
    const randomindex = Math.floor(Math.random() * colors.length);
    // get the value at that position
    const color = colors[randomindex];
    // change background
    document.body.style.backgroundColor = color;
    // change text label
    label.textContent = "Current color: " + color;

}
button.addEventListener("click", flipcolor);