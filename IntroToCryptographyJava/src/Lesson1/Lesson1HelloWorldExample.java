package Lesson1;

import java.util.Scanner;

public class Lesson1HelloWorldExample 
{
	public static void main(String[] argsv)
	{

	    // Stores a single character
	    char c;

	    // Strings store a sequence of characters
	    String s;
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("Enter something: ");

	    // keyboard.nextChar() reads input from the console (until return is hit) and 
	    // the extraction operation ">>" extracts the input based on the
	    // target variable, in this case, s. 
	    s = keyboard.nextLine();//reads in a string from the console

	    System.out.println("You entered " +s);
	}
}
