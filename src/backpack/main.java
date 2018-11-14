package backpack;

class main {
	
	public static void main(String[] args) {
		/*key OpenKey = new key(); 
		OpenKey.GetOpenKey();
		encryption enc = new encryption();
		enc.GetEncryption();*/
		decryption dec = new decryption();
		int[] ClosedKey = {1,2,3,4,5,6};
		dec.Getdecryption(31, 105,ClosedKey);

	}

}
