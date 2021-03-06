package com.revature;

public class Launcher {

	//nice shortcut for creating main method: main + ctrl + space
	public static void main(String[] args) {
		
		System.out.println("==========================================(Common Primitives)");
		
		//int is the most common integer-type primitive (others are byte, short, long)
		int i = 50000000;
		
		//if you for some reason need a way bigger number, you can use the "long" type
		long l = 500000000000000000L; //just note, you have to write an "L" at the end of the number
		
		//we can use the + to concatenate (attach) strings and other values
		System.out.println("the value of my int is: " + i);
		//we can still add stuff after the concatenation
		System.out.println("the sum of my int and long is: " + (i + l));
		//we needed parenthesis so that the two numbers got added before any String concatenate. PEMDAS 
	
		
		//chars are written with 'single quotes', unless they're numbers
		//they represent a single CHARacter, so we can't have multiple characters in one char
		char c = 'c';
		//char c2 = 'ha'; //NO!!!!! chars can only hold one character
		
		char c3 = 15000; //I thought you said chars can only have one character? 
		//True, but this number represents a UNICODE VALUE
		
		System.out.println(c);
		System.out.println(c3);
		
		System.out.println(c + c3);
		
		
		//doubles are the most common floating-point number (this means they have decimals)
		double d = 2.56789;
		System.out.println("the value of my double is: " + d);
		
		double d2 = 2;
		System.out.println(d2 + " is the value of my other double");
		
		
		//the last primitive type we'll use often is boolean
		//this is the ONLY way to denote true/false
		boolean bool = true; //this will equal "true"
		
		boolean bool2 = 5 > 10; //this will equal "false"
		
		System.out.println(bool);
		System.out.println(bool2);
		
		//if else statements check for true or false, which is one place booleans are necessary
		if(bool) {
			System.out.println("My boolean is true");
			//this code runs because bool == true... think of it as "this equals that"
		} else {
			System.out.println("My boolean is false");
			//this code does not run because bool != false... think of it as "this does not equal that"
		}
		
		System.out.println("============================(Arithmetic Operators)");
		
		//creating some variables to demonstrate arithmetic operators
		int sum = 5 + 5;
		int difference = 20 - 10;
		int product = 2 * 5;
		int quotient = 20 / 2;
		int remainder = 30 % 20;
		//these should all equal ten
		
		//practical use of modulus to determine even or odd
		int testNumber = 10;
		
		if(testNumber % 2 == 0) {
			System.out.println("Your number is even");
		} else {
			System.out.println("You number is odd and Ben messsed up");
		}
		
		//you can do mathematical operations within print statements using numbers OR variables
		System.out.println(5 + 5);
		System.out.println(5 - 5 + sum);
		System.out.println(sum * difference / quotient + 5000 + (56/4));
		
		System.out.println("===================================(Incrementing/Decrementing)");
		
		//we use ++ to increase a number by 1, and we use --- to decrease a number by 1
		//very useful in loops
		
		int funnyNumber = 24;
		System.out.println("funnyNumber is equal to: " + funnyNumber);
		
		funnyNumber++; //this will increase the value of our variable by 1
		System.out.println("y'know what's funnier than 24? " + funnyNumber);
		
		funnyNumber--; //this will decrease the value of our variable by 1
		System.out.println("funnyNumber is less funny now... " + funnyNumber);
		
		
		//pre vs post increment? what's the difference?
		
		int k = 5;
		
		System.out.println(k++); //this will print out 5, and THEN increment int k.
		
		System.out.println(k); //the increment DID happen... but it happened after the line it was in
		
		//this is where pre increments can come in handy
		System.out.println(++k); //this will preform the incrment BEFORE the line completes
	}
	
}
