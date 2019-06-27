import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		try {
			for(int i = 0;i<26;i++)
			{
				CeasarCypher ceasar = new CeasarCypher("bsjsf ucbbo uwjs mci id bsjsf ucbbo zsh mci rckb bsjsf ucbbo fib ofcibr obr rsgsfh mci bsjsf ucbbo aoys mci qfm bsjsf ucbbo gom uccrpms bsjsf ucbbo hszz o zws obr vifh mci",(char)(65+i));
				System.out.println(i+" "+ceasar.getEncryptedText());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner k = new Scanner(System.in);
		k.nextLine();
		
		System.out.println("Enter player 1 private key");
		DiffieHellman p1 = new DiffieHellman(k.nextInt());
		System.out.println("Enter player 2 private key");
		DiffieHellman p2 = new DiffieHellman(k.nextInt());
		
		p1.calcSharedKey(p2.getPublicKey());
		p2.calcSharedKey(p1.getPublicKey());
		p1.printShared();
		p2.printShared();

		XOREncryption p1enc = new XOREncryption("The quick brown fox jumps lorem ipsum",Integer.toString(p1.getsharedKey()));
		System.out.println("Encrypted by player 1: "+p1enc.getEncryptedText());
		XOREncryption p2enc = new XOREncryption(p1enc.getEncryptedText(),Integer.toString(p2.getsharedKey()));
		System.out.println("Unencrypted by player 2: "+p2enc.getEncryptedText());
		
		
	}

}
