//name of site
document.getElementById("myH1").textContent = 'Roll the Die!';

//need to get the selector
const select = document.getElementById("mySelect");


//the function of the rolling of the die
function roll() {
    //first the variables
    let die;
    let img;
    //we gotta have atleast 1 die
    die = Math.floor(Math.random() * 6);
    die++;
    img = '</br></br><img src="' + die + 'Die.bmp" alt="' + die + '">';
    //After adding 1 die, see what kindof dice user wants
    let value = parseInt(select.value) - 1;
    //Now we add the extra dice.
    for (let i = 0; i < value; i++) {
        die = Math.floor(Math.random() * 6);
        die++;
        img = img + '<img src="' + die + 'Die.bmp" alt="' + die + '"> ';
    }
    //return image
    return img;
}

//set function for the button
document.getElementById("rollIt").onclick = function(){
    //we roll the dice then we are replacing the innrHTML
	document.getElementById("result").innerHTML = roll();
	}
