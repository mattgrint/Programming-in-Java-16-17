String userInput
int base, exponent, result
boolean running = true


int power(b, e){
	int originalBase = b

	for(i = 1 ; i < e ; i++) {
		 b = b * originalBase
	}

	return b
}

int binary2decimal(binaryString){

	for (i = 0 ; i <= binaryString.length() ; i++){
		
	}
}


void getPower(){
	println "Please enter the base: "
	userInput = System.console().readLine()
	base = Integer.parseInt(userInput)

	println "Please enter the exponent: "
	userInput = System.console().readLine()
	exponent = Integer.parseInt(userInput)

	result = power(base,exponent)

	println result
}

void getPower2(){
	println "Please enter the exponent: "
	userInput = System.console().readLine()
	exponent = Integer.parseInt(userInput)

	println power(2,exponent)
}

void getBinary2Decimal(){
	println "Please enter a binary number"
	userInput = System.console().readLine()

	println binary2decimal(userInput)
}


while(running == true){
	println ""
	println "------------------------------------------"
	println "Please enter your selection:"
	println "1) Power of two numbers"
	println "2) Power of 2 to chosen exponent"
	println "3) Convert a binary number to decimal"
	println "4) Convert a decimal number to binary"
	println "0) Exit the program"
	print ">"

	userInput = System.console().readLine()

	switch(userInput){

		case "0":
			running = false
			break;

	case "1":
			getPower()
			break;

	case "2":
			getPower2()
			break;

	case "3":
			getBinary2Decimal()
			break;

	default:
			println "Error: Lazy programmer has not yet coded this bit"
			break;


	}		

}

println "Thanks for using this program"





