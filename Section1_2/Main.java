package Section1_2;

public class Main {


	//Please complete the function so that it passes all tests without exception
	public static char encodeChar(char letter, char key)
	{
		//Variable to store the shift
		int offSet = characterToAlphabeticalIndex(key);
		//Variable to store index of letter in alphabet
		int letterIndex = characterToAlphabeticalIndex(letter);
		//if non alphabetic character is used as the key do not shift
		if(offSet == -1)
			offSet = 0;
		//If non Alphabetic character is used as letter do not shift
		if(letterIndex == -1)
			letterIndex = letter;
		else//shift
		{
			letterIndex += offSet;
			letterIndex %= 26;
			//if statement to preserve case of original letter
			if(letter>'Z')
				letterIndex += 'a';
			else
				letterIndex += 'A';
			
		}
		return (char) (letterIndex);
	}
	
	//This is the function from the previous step you have already created
	public static int characterToAlphabeticalIndex(char c)
	{
		int data = (int) c;
		if(Character.isAlphabetic(data))
		{
			//Your Code Here
			if(data >= 'a')
				data-='a';
			else
				data-='A';
		}
		else
			data =-1;
		
		return data;
	}

	//Main is just for testing do not change code 
	public static void main(String[] args) throws Exception {

	    //Test 1
	    checkAssertion(encodeChar('A', 'B') == 'B',
	    		"Test #1 Failed! Expected encodeChar('A', 'B') to return 'B', but it returned: "+
	    				encodeChar('A', 'B'),
	    				"Test #1 Passed!"
	    		);
	    
	    //Test 2
	    checkAssertion(encodeChar('e', 'C') == 'g',
	    		"Test #2 Failed! Expected encodeChar('e', 'C') to return 'g', but it returned: "+
	    				encodeChar('e', 'C'),
	    				"Test #2 Passed!"
	    		);



	    //Test 3
	    //problem in C++ project
	    checkAssertion(encodeChar('f', 'f') == 'k',
	    		"Test #3 Failed! Expected encodeChar('f', 'f') to return 'k', but it returned: "+
	    				encodeChar('f', 'f'),
	    				"Test #3 Passed!"
	    		);


	    //Test 4 
	    //problem in C++ project
	    checkAssertion(encodeChar('F', 'f') == 'K',
	    		"Test #4 Failed! Expected encodeChar('F', 'f') to return 'K', but it returned: "+
	    				encodeChar('F', 'f'),
	    				"Test #4 Passed!"
	    		);

	    //Test 5
	    checkAssertion(encodeChar('V', 'k') == 'F',
	    		"Test #5 Failed! Expected encodeChar('V', 'k') to return 'F', but it returned: "+
	    				encodeChar('V', 'k'),
	    				"Test #5 Passed!"
	    		);

	    //Test 6
	    checkAssertion(encodeChar('V', '%') == 'V',
	    		"Test #6 Failed! Expected encodeChar('V', '%') to return 'V', but it returned: "+
	    				encodeChar('V', '%'),
	    				"Test #6 Passed!"
	    		);
	    
	    //Test 7
	    checkAssertion(encodeChar('@', 'e') == '@',
	    		"Test #7 Failed! Expected encodeChar('@', 'e') to return '@', but it returned: "+
	    				encodeChar('@', 'e'),
	    				"Test #7 Passed!"
	    		);



	}


	//this function is for unit testing, and not related to the workshop
	public static void checkAssertion(boolean val, String onFail,String onSuccess) throws Exception
	{
		System.out.println("");
		if(val)
		{
			System.out.println(onSuccess);
		}
		else 
		{
			throw new Exception("\n"+onFail);
		}

		System.out.println("");
	}
}
