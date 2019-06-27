import java.math.BigInteger;

public class DiffieHellman 
{
	//The magic in Diffie-Hellman is modulo maths
	//(base^a % p)^b % p = base^(ab) % p
	//(base^b % p)^a % p = base^(ba) % p
	//where base, and p are prime numbers that both parties know
	//and b and a are secret, and only are known by the party they belong to
	private int privateKey,partnerPublicKey,sharedSecretKey,base=7;
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
		this.sharedSecretKey = pow(partnerPublicKey,privateKey).mod(mod).intValue();
	}
	private BigInteger pow(int pBase,int exponent)
	{
		BigInteger solution = new BigInteger(""+1);
		BigInteger base = new BigInteger(""+pBase);
		
		for(int i = 0;i<exponent;i++)
		{
			solution = solution.multiply(base);
		}
		return solution;
	}
	public int getsharedKey()
	{
		return this.sharedSecretKey;
	}
	public void printShared()
	{
		System.out.println(sharedSecretKey);
	}
}
