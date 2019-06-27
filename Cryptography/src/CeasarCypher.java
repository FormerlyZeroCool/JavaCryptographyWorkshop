
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
			throw new Exception("Error please enter a alpha character");
		}
		
	}
	public char shift(char data, int shift)
	{
		if(data>96)
			data-=32;
		data-=65;
		return (char) (65+(shift+data)%26);
	}
	public StringBuilder shift(String data,int shift)
	{
		StringBuilder input = new StringBuilder(data);

		StringBuilder output = new StringBuilder("");
		for(int i = 0;i<input.length();i++)
		{
			output.append(shift(input.charAt(i),shift));
		}
		return output;
	}
	public void encrypt()
	{
		if(key>96)//Lowercase to zero indexed char code
			key -= 97;
		else
			key-=65;//Uppercase to zero indexed char code
		this.encryptedText = shift(this.text.toString(),(int) key);
	}
	public String getEncryptedText()
	{
		this.encrypt();
		return this.encryptedText.toString();
	} 
	public String unencrypt()
	{
		return shift(this.encryptedText.toString(),((int) key)).toString();
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
