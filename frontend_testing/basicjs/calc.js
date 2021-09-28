// addition of two numbers
	function add(a, b) {
		console.log("Adding "+ a + " and "+ b);
		return a + b;
	}

	// Multiply two numbers
	function mul(a, b) {
		console.log("Multiplying "+ a + " and "+ b);
		return a * b;
	}

	// Division of two numbers
	function div(a, b) {
		console.log("Dividing "+ a + " by "+ b);
		return a / b;
	}
	
	//Return a prime number
	function primeNumber(){
		console.log("returning 5 as a prime number");
		return 5;
	}
	

 module.exports = {add, mul, div, primeNumber}
