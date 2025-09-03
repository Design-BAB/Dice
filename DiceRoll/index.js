//name of site
document.getElementById("myH1").textContent = 'Roll the Die!';

//the function of the rolling of the die
function roll() {
    //first the variables
    let die;
    let img;
    //we gotta have atleast 1 die
    die = Math.floor(Math.random() * 6);
    die++;
    img = '<img src="' + die + 'Die.bmp" alt="' + die + '">';
    //Now we add the extra dice.
    for (let i = 1; i < 2; i++) {
        die = Math.floor(Math.random() * 6);
        die++;
        img = img + '<img src="' + die + 'Die.bmp" alt="' + die + '">';
    }
    return img;
}


document.getElementById("rollIt").onclick = function(){
	//console.log(roll());
	document.getElementById("result").innerHTML = roll();
	}
