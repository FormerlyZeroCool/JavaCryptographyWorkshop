package Lesson2;

public class Lesson2 {
	public static void main(String[] args)
	{

	    // chars are represented as integers under the hood
	    // they're encoded using the ASCII system 
	    // http://www.asciitable.com/index/asciifull.gif
	    
	    char c = 'A'; // Equivalent to 65

	    System.out.print("The letter " + c + " is equivalent to ");
	    System.out.println(Integer.toString((int)(c))); 

	    char d = 'Z'; // Equivalent to 65

	    System.out.print("The letter " + d + " is equivalent to ");
	    System.out.println(((int)c+25) + " which is essentially " + c + " + 25");


	    // lowercase letters have a different ASCII value but the principles are the same
	    
	    c = 'a';
	    d = 'z';
	    System.out.print("The letter " + c + " is equivalent to ");
	    System.out.println(Integer.toString((int)c)); 

	    System.out.print("The letter " + d + " is equivalent to ");
	    System.out.println(Integer.toString((int)c)+25 + " which is essentially " + c + " + 25");

	    // The alphabet is also an array (size 26), with A/a at index 0 and Z/z at index 25
	    // quick exercise: print the index of the character below

	    char ex = 'F';
	    System.out.println("The alphabetical index of " + ex + " is: " + "*replace this*");

	}
}
