package backpack;

import java.util.Scanner;

class main {
	
	public static void main(String[] args) {
		key Keys = new key(); 
		Keys.GetOpenKey();
		encryption enc = new encryption();
		System.out.print("enter message");
		Scanner in = new Scanner(System.in);
		enc.GetEncryption(Keys.OpenKey,in.nextLine());
		in.close();
		decryption dec = new decryption();
		System.out.println(dec.Getdecryption(Keys.n,Keys.m,Keys.ClosedKey,enc.EncMessage));

	}

}
