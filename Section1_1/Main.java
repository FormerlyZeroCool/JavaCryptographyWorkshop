package Section1_1;

public class Main {

	//Please complete the function so that it passes all tests without exception
	public static int characterToAlphabeticalIndex(char c)
	{
		 /*
	     * Given an alphabetical character, return the alphabetical index
	     * of that character, else return -1
	     *
	     * Note: We already handled the "return -1" part for you. Just focus
	     * on the logic that returns the alphabetical index :)
	     * */
		int data = (int) c;
		if(Character.isAlphabetic(data))
		{
			//Your Code Here
			System.out.println(data);
			if(data >= 'a')
				data-='a';
			else
				data-='A';
		}
		else
			data =-1;
		System.out.println(data);
		
		return data;
	}
	//Main is just for testing do not change code 
	public static void main(String argsv[]) throws Exception
	{
			//Test 1
			checkAssertion(characterToAlphabeticalIndex('A') == 0 ,
				"Test #1 Failed! Expected characterToAlphabeticalIndex('A') to return 0, but it returned: "+
				  characterToAlphabeticalIndex('A'),
					"Test #1 Passed!");
				

			//Test 2
			checkAssertion(characterToAlphabeticalIndex('L') == 11 ,
					"Test #2 Failed! Expected characterToAlphabeticalIndex('L') to return 11, but it returned: "+
					  characterToAlphabeticalIndex('L'),
					  "Test #2 Passed!");

			//Test 3
			checkAssertion(characterToAlphabeticalIndex('e') == 4 ,
					"Test #3 Failed! Expected characterToAlphabeticalIndex('e') to return 4, but it returned: "+
					  characterToAlphabeticalIndex('e'),
					  "Test #3 Passed!");

			//Test 4
			checkAssertion(characterToAlphabeticalIndex('z') == 25,
					"Test #4 Failed! Expected characterToAlphabeticalIndex('z') to return 25, but it returned: "+
					  characterToAlphabeticalIndex('z'),
					  "Test #4 Passed!");


			//Test 5
			checkAssertion(characterToAlphabeticalIndex('%') == -1 ,
					"Test #5 Failed! Expected characterToAlphabeticalIndex('%') to return -1, but it returned: "+
					  characterToAlphabeticalIndex('%'),
					  "Test #5 Passed!");


	
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
