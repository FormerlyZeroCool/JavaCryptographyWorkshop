
public class CeasarCypher 
{
	private StringBuilder text,encryptedText;
	private char key;
	public CeasarCypher(String text,char key) throws Exception
	{
		this.text = new StringBuilder(text);
		this.key = key;
		this.encryptedText = new StringBuilder();
		if(!Character.isAlphabetic(key))
		{
			throw new Exception("Used non Alpha key for Ceasar Cyper");
		}
		
	}
	public char shift(char data, int shift)
	{
		char shiftedData = data;
		if(Character.isAlphabetic(data))
		{
			if(data>96)
			{
				data-=97;
				if((shift+data)<0)
					shiftedData = (char) (97+26+(shift+data)%26);
					else
						shiftedData = (char) (97+(shift+data)%26);
			}
			else
			{
				data-=65;
				if((shift+data)<0)
					shiftedData = (char) (65+26+(shift+data)%26);
					else
						shiftedData = (char) (65+(shift+data)%26);
			}
			System.out.print((char)(data+65)+"->"+shiftedData+' ');
		}

			return shiftedData;
	}
	public StringBuilder shift(String data,int shift)
	{
		StringBuilder input = new StringBuilder(data);

		StringBuilder output = new StringBuilder("");
		
		for(int i = 0;i<input.length();i++)
		{
			output.append(shift(input.charAt(i),shift));
		}
		System.out.println();
		
		return output;
	}
	public void decrypt(char key)
	{
		if(key>96)
		{
			key-=97;
		}
		else
		{
			key-=65;
		}
		this.text = shift(this.text.toString(),(int)key*-1);
		encrypt();
	}
	public void encrypt()
	{
		if(key>0)
		if(key>96)//Lowercase to zero indexed char code
			key -= 97;
		else if(key>65)
			key-=65;//Uppercase to zero indexed char code
		this.encryptedText = shift(this.text.toString(),(int) key);
	}
	public String getEncryptedText()
	{
		this.encrypt();
		return this.encryptedText.toString();
	} 
	public String getText() {
		return this.text.toString();
	}

	public void setText(String text) {
		this.text.setLength(0);
		this.text.append(text);
	}

	public char getKey() {
		return this.key;
	}

	public void setKey(char key) {
		this.key = key;
	}
}
