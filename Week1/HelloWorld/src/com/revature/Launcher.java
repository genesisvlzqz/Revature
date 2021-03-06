//This is a comment - spring tools won't read it

//This is a package declaration
//must be the first line of a class besides comments
package com.revature;

//This is the class declaration - all the code in this class is contained in its curly braces
public class Launcher {
	
	
	//This is our main method - the entry point of our application 
	//I like to call the class with the main method "Launcher" because the main method launches our application
	public static void main(String[] args) {
		
		//The code inside a method is referred to as the method body
		
		//This is a print statement - it PRINTS some text to your console
		//Whatever you write within the print statement will get printed to the console
		System.out.println("Hello World! Hello Java! I'm excited to learn");
		
		//declaring a variable or two
		
		int i = 500;
		
		System.out.println(i);
		
		String words = "I am a String with some words";

		//shortcut for writing print statements: syso + ctrl + spacebar
		System.out.println(words);
		
		
		//java is strictly typed - you can't change a variable's type
		
		int a = 5;
		
		a = 10;
		
		//a = "I'm trying to change 'a' to a String";
		
		
		//calling our addNumbers method
		int sum = addNumbers(10, 15); //so now the result of this addition is stored in the "sum" variable
		
		//print out sum
		System.out.println(sum);
		
		
	} //end of the main method
	
	//This method is public - this means any other class can see/use this method
	//This method has a return type of int, so it must return an int
	//This method takes two parameters - an int called i and an int called j
	public static int addNumbers(int i, int j){
		//the funtionality (aka behavior) of this method is to add two numbers together
		return i + j; 
	}
	
}
