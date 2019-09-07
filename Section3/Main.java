package Section3;

public class Main {

	//
	public static char[] encryptString(char data[],char key)
	{
		for(int i = 0; i < data.length; i++)
		{
			data[i] = encodeChar(data[i],key);
		}
		return data;
	}
	public static void main(String[] args) throws Exception
	{

			char expectedOutput1[] = "Eptle Divs Fvezs Glevpmi".toCharArray();
			char expectedOutput2[] = "Xlmw AeW Jyr, rs?".toCharArray();
		   char originalString1[] = "Alpha Zero Bravo Charlie".toCharArray();
		    char originalString2[] = "This WaS Fun, no?".toCharArray();

		    char encodedString[];
		    char cipherKey = 'e';
		    


		    // Below this line are the test cases. You don't need to worry about the code here.
		    // You shouldn't change it either

		    encodedString = encryptString(originalString1, cipherKey);


		    checkAssertion(compStr(encodedString,expectedOutput1),
		    		"Test #1 Failed! Expected encodedString and expectedOutput to be the identical, \n"+
		    				"but they're not. expectedOutput looks like this: Eptle Divs Fvezs Glevpmi\n"+
		    				"Instead it output: "+charArrayToString(encodedString),
		    				"Test #1 success");
		    		


		    encodedString = encryptString(originalString2, cipherKey);


		    checkAssertion(compStr(encodedString,expectedOutput2),
		    		"Test #2 Failed! Expected encodedString and expectedOutput to be the identical, \n"+
		    				"but they're not. expectedOutput looks like this: Xlmw AeW Jyr, rs?\n"+
		    				"Instead it output: "+charArrayToString(encodedString),
		    				"Test #2 success");
		    
	}
	//Step 1.2
	//This is the function from the previous step you have already created
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
	//Step 1.1
	//This is the function from a previous step you have already created
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
	//this section is for unit testing, and not related to the workshop
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
	public static boolean compStr(char d1[],char d2[])
	{
		boolean equal = true;
		if(d1.length != d2.length)
		{
			equal = false;
		}
		else
		{
			for(int i = 0;i < d1.length && equal; i++)
			{
				if(d1[i] != d2[i])
					equal = false;
			}
		}
		return equal;
	}
	public static String charArrayToString(char data[])
	{
		StringBuilder stringData = new StringBuilder();
		for(int i = 0;i < data.length; i++)
		{
			stringData.append(data[i]);
		}
		return stringData.toString();
	}

}
