
public class XOREncryption 
{

	private StringBuilder text,encryptedText,key;
	
	public XOREncryption (String text,String key)
	{
		this.text = new StringBuilder(text);
		this.encryptedText= new StringBuilder();
		this.key = new StringBuilder(key);
	}
	private StringBuilder xor(StringBuilder data)
	{
		StringBuilder xored = new StringBuilder();
		for(int index = 0;index < data.length();index++)
		{
			xored.append((char) (data.charAt(index) ^ key.charAt(index%key.length())));
		}
		return xored;
	}
	public void encrypt()
	{
		encryptedText = xor(text);
	}
	public String getEncryptedText()
	{
		this.encrypt();
		return this.encryptedText.toString();
	} 
	public String unencrypt()
	{
		return xor(this.encryptedText).toString();
	}
	public String getText() {
		return text.toString();
	}

	public void setText(String text) {
		this.text.setLength(0);
		this.text.append(text);
	}

	public StringBuilder getKey() {
		return key;
	}

	public void setKey(StringBuilder key) {
		this.key.setLength(0);
		this.key.append(key);
	}
}
