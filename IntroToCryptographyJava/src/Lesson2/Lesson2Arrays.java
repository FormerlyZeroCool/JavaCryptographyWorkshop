package Lesson2;

public class Lesson2Arrays {

	public static void main(String[] args)
	{
		  int fourByteInt = 2147483647;
		    char oneByteChar = 'q';
		    boolean onByteBool = false;
		    float fourByteFloat = 3.1415f;
		    double eightByteDouble = 214748364711.0;

		    // Arrays
		    int sizeFourArray[] = {1, 2, 3, 4};

		    // Strings Objects that abstract an Array of characters
		    char str[] = "This is a string".toCharArray();

		    // size can be ignored, but default to 
		    // the size of whatever was assigned to it
		    int sizeFiveArray[] = {1, 2, 3, 4, 5}; 

		    int sizeZeroArray[] = {};

		    // array access start at 0. The first element is at position 0
		    // the last element is at n-1, where n is the size of the array
		    // you cannot access outside the domain of an array

		    int sizeSevenArray[] = {1, 2, 3, 4, 5, 6, 7}; 

		    // allowed
		    System.out.println(sizeSevenArray[0]);

		    // not allowed (if you uncomment it, it will fail)
		    // System.out.println(sizeSevenArray[7]);

		    System.out.println("before: " + sizeSevenArray[4]);

		    // array elements can be updated
		    sizeSevenArray[4] = sizeFiveArray[1];

		    System.out.println("after: " + sizeSevenArray[4]);
		    
		    //in Java you can also get the size of an array by calling *arrayVarName*.length; 
		    //Try printing the length of each of the arrays to the console

	}
}
