package backpack;

 class decryption {
 int[] DecMessage;

		public String[] Getdecryption(int n, int m,int[]ClosedKey,int[] EncMessage) {

			return DecryptionStr(Decryption(GetBackN(n,m), m, EncMessage),ClosedKey);

		}
		private int GetBackN(int n,int m)
		{
		int i = 0;
		while((n*i)%m != 1)
			i++;
			return i;
		}
		private int[] Decryption(int BackN,int m,int[] EncMessage)
		{
			int[] Decrypt = new int[EncMessage.length];
			for(int i = 0;i<EncMessage.length;i++)
			{
				Decrypt[i] = EncMessage[i] *BackN % m;
				//System.out.print(Decrypt[i]);
			}
			return Decrypt;
		}
		private String[] DecryptionStr(int[] Decryption,int[] ClosedKey)
		{
			String[] DecryptStr = new String[Decryption.length];
			int res;
			int j = 0 ;
			for (int val : Decryption) {
			 res = 0;
				for(int i = ClosedKey.length-1;i>=0;i--) {
					if(val>=ClosedKey[i])
					{
					res = res | (int)Math.pow(2,i);
					val -= ClosedKey[i];
					}
				}
				System.out.println(res);
				DecryptStr[j] = res + "";
				j++;
		}
		return DecryptStr;
	}
}