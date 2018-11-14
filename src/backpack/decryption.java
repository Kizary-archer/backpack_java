package backpack;

 class decryption {
 int[] DecMessage;

		public void Getdecryption(int n, int m,int[]ClosedKey,int[] EncMessage) {

			Decryption(GetBackN(n,m), m, EncMessage);
			

		}
		public int GetBackN(int n,int m)
		{
		int i = 0;
		while((n*i)%m != 1)
			i++;
			return i;
		}
		public void Decryption(int BackN,int m,int[] EncMessage)
		{

		}
	}