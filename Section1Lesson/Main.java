package Section1Lesson;

public class Main {

	public static void main(String[] args) 
	{
	    char input = '\0';

	    System.out.println("Enter a single character followed by the enter/return key: ");


	    // First we need to get the user's input and save it in the variable "input"
	    // I'll let you guys figure that one out

	    
	    //if(/*check if its upper*/)
	    {
	    	//Only print this if the letter entered is uppercase
	    	System.out.println("You entered the uppercase letter: " + input);
	    }

	    //else if(/*check if its lower*/)
	    {
	    	System.out.println("You entered the lowercase letter: " + input);
	    }

	    // if its neither than its not an alphabetical character
	    //else
	    {
	    	//Only print this if the letter entered is lowercase
	    	System.out.println("You entered a non-alphabetical character: " + input);
	    }


	}

}
