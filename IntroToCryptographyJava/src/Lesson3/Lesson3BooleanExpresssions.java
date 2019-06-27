package Lesson3;

public class Lesson3BooleanExpresssions {
	public static void main(String[] args)
	{
		   // Expressions are statements that yield a value
	    //3 + 4; // This is an expression that yields 7
	    //'c'; // this is an expression that yields the character 'c'

	    // Expressions can also yield Boolean values, and boolean expressions can be created from boolean operators 
		//like && and ||
		if(false && true)//What will print, true or false?
    		System.out.println(true);
		else
    		System.out.println(false);
		
		if(false || true)//What will print, true or false?
    		System.out.println(true);
		else
    		System.out.println(false);

	    
	    // The below expression yields the answer to the question 
	    // 'is 3 greater than 4?' or false
	    if(3 > 4)
    		System.out.println(true);
	    else
    		System.out.println(false);

	    // You can also check for equalty and other relational questions
	    if(3 == 3) // asks 'is 3 equal to 3?'
	    		System.out.println(true);
	    else
	    		System.out.println(false);
	    // Boolean expressions can be combined or modified with logical operators

	    // asks 'is 3 equal to 3 AND 5 greater than 4?' 
	    // Both must be true for this expression to yield true
	    if(3 == 3 && 5>4)
	    		System.out.println(true);
	    else
	    		System.out.println(false);

	    // asks 'is 3 equal to 3 OR 5 greater than 4?' 
	    // At least one must be true for this expression to yield true
	    if(3 == 3 || 5<4)
    		System.out.println(true);
	    else
    		System.out.println(false);

	    // The NOT operator '!' returns the opposite of the value yielded by the 
	    // expression its attached to

	    if(0 == 3) // asks 'what is the opposite of 3 equal to 3?'
    		System.out.println(true);
	    else
    		System.out.println(false);
	}

}
