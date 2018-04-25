var location1 = Math.floor(Math.random() * 5);
var location2 = location1 + 1;
var location3 = location2 + 1;
console.log("location1: " + location1 + ", location2: " + location2 + ", location3: " + location3);
/*
var location1 = 3;
var location2 = 4;
var location3 = 5;
*/
var guess;
var hits = 0;
var guesses = 0;

var isSunk = false;

while(isSunk == false){
	guess = prompt("Ready, aim, fire! (enter a number 0-6):");
	if(guess < 0 || guess > 6){
		alert("Please enter a valid cell number!");
	}else{
		guesses++;
			if(guess == location1 || guess == location2 || guess == location3){
				hits++;
				alert("HIT!");
				if(hits == 3){
					isSunk = true;
					alert("You sank my battleship!");
				}
			}else{
				alert("MISS");
			}
	}
}
var stats = "You took " + guesses + " guesses to sink the battleship, " +
	"which means your shooting accuracy was " + (3/guesses);
alert(stats);