import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception
	{
		
			Scanner k = new Scanner(System.in);
			while(true)
			{
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("press enter to begin");
				k.nextLine();
				
				System.out.println("Enter player 1 private key");
				DiffieHellman p1 = new DiffieHellman(k.nextInt());
				System.out.println("Enter player 2 private key");
				DiffieHellman p2 = new DiffieHellman(k.nextInt());

				p1.calcSharedKey(p2.getPublicKey());
				p2.calcSharedKey(p1.getPublicKey());
				System.out.println("Player 1 keys: \n   Public: "+p1.getPublicKey()+" Both players know this, but so does the rest of the world");
				System.out.println("   Private: "+p1.getPrivateKey()+" Only player 1 knows this");
				System.out.print("   Shared Secret: ");
				p1.printShared();
				System.out.println("Player 2 keys: \n   Public: "+p2.getPublicKey()+" Both players know this, but so does the rest of the world");
				System.out.println("   Private: "+p2.getPrivateKey()+" Only player 2 knows this");
				System.out.print("   Shared: ");
				p2.printShared();

				System.out.println();
				System.out.println("Player 1 enter Message to encrypt with the shared secret key:");
				k.nextLine();
				String text = k.nextLine();
				CeasarCypher p1Ceasar = new CeasarCypher(text,(char)(65+p1.getsharedKey()%26));
				p1Ceasar.encrypt();
				String cypher = p1Ceasar.getEncryptedText();
				System.out.println("Player 1 message after Ceasar with shift: "+(char)(65+p1.getsharedKey()%26)+
							"\nEncrypted text: "+cypher);
				XOREncryption p1enc = new XOREncryption(cypher,Integer.toString(p1.getsharedKey()));

				System.out.println();
				System.out.println("Encrypted XOr by player 1 with key: "+
						p1.getsharedKey()+
						"\nXOr Encrypted text: "+p1enc.getEncryptedText());
					
				XOREncryption p2enc = new XOREncryption(p1enc.getEncryptedStringBuilder(),Integer.toString(p2.getsharedKey()));
				System.out.println();
				System.out.println();
				System.out.println("Player 2 press enter  to decrypt the message player 1 sent");
				k.nextLine();
				System.out.println();
				System.out.println("Unencrypted XOr by player 2:\n"+p2enc.getEncryptedText());
				System.out.println();

				CeasarCypher p2Ceasar = new CeasarCypher(p2enc.getEncryptedText(),(char)(65+p1.getsharedKey()%26));
				System.out.println("Decrypting Cesar Cypher Text with key: "+(char)(65+p1.getsharedKey()%26));
				p2Ceasar.decrypt((char)(65+p1.getsharedKey()%26));
				System.out.println("Unencrypted Ceasar Cypher: "+p2Ceasar.getText());

				System.out.println();

			}
		
	}

}
