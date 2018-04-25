var balance = 10500;
var cameraOn = true;
function steal(balance, amount) {
	cameraOn = false;
	if (amount < balance) {
		balance = balance - amount;
		console.log("balance: " + balance);
	}
	return amount;
	cameraOn = true;
}
var amount = steal(balance, 1250);
console.log("Criminal: you stole " + amount + "!");
console.log("balance: " + balance);

var chevy = {
	make: "Chevy", 
	model: "Bel Air",
	year: 1957,
	color: "red",
	passengers: 2,
	convertible: false,
	mileage: 1021	
}

console.log("Car model: " + chevy.make);