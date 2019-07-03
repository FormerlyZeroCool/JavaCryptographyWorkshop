import java.math.BigInteger;

public class DiffieHellman 
{
	//The magic in Diffie-Hellman is modulo maths
	//(base^a % p)^b % p = base^(ab) % p
	//(base^b % p)^a % p = base^(ba) % p
	//where base, and p are prime numbers that both parties know
	//and b and a are secret, and only are known by the party they belong to
	private int privateKey,partnerPublicKey,sharedSecretKey,base=199;
	public BigInteger mod = new BigInteger(Integer.toString(4099));
	public DiffieHellman(int privateKey)
	{
		this.privateKey = privateKey;
	}
	public int getPublicKey()
	{
		return pow(base, privateKey).mod(mod).intValue();
	}
	public void calcSharedKey(int partPubKey)
	{
		this.partnerPublicKey = partPubKey;
		this.sharedSecretKey = pow(partnerPublicKey,privateKey).mod(mod).intValue()/*323579*/;
	}
	private BigInteger pow(int pBase,int exponent)
	{	//fast solution utilizing native library
		return new BigInteger(""+pBase).pow(exponent);
		//Very Slow solution
		/*Biginteger product = BigInteger("1");
		for(int i = 0;i<exponent;i++)
		{
			product = product.multiply(base);
		}
		
		return product;
		*/
	}
	public int getsharedKey()
	{
		return this.sharedSecretKey;
	}
	public void printShared()
	{
		System.out.println(sharedSecretKey+" Only the players know this, but no one else");
	}
	public int getPrivateKey() {
		// TODO Auto-generated method stub
		return privateKey;
	}
}
