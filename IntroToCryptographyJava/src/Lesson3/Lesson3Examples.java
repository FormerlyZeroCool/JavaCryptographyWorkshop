package Lesson3;

import java.util.Scanner;

public class Lesson3Examples {
	
	public static void main(String[] args)
	{
	    // we can do things based on if something is true or not
	    // we use if statements to do this
	    int x;

	    if(true){

	        System.out.println("This will print to console");
	    }

	    if(false){

	    	System.out.println("This wont");
	    }

	    // we can chain multiple if statements using else if

	    if (false){
	    	System.out.println("first case");
	    }

	    else if (false){
	    	System.out.println("second case");
	    }
	    else if (true){
	    	System.out.println("Third case");
	    }
	    
	    // if all the if statements are false, else is evaluated.
	    // this of it as a default
	    else {
	    	System.out.println("default case");
	    }

	    // we typically use boolean expressions along with if statements to
	    // control how our code runs
	    if (3 <5){
	    	System.out.println("This will always print because it's always true");
	    }
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("enter a number between 1-10 and hit enter: ");
	    keyboard.nextLine();
	    x = keyboard.nextInt();


	    // whatever is printed depends on what was entered
	    if (x == 5){
	    	System.out.println("You picked the magic number");
	    }
	    else {
	    	System.out.println("You picked the wrong number :/");
	    }
	}
}
