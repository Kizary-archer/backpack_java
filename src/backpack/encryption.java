package backpack;

final class encryption {
 int[] EncMessage;

		public void GetEncryption(int[] Key,String str) {
			char[] CharArray = str.toCharArray();
			EncMessage = new int[CharArray.length];
			int res;
			int j = 0 ;
			for (int valChar : CharArray) {
				 System.out.println(Integer.toBinaryString(valChar));
				 System.out.println(valChar);
				 res = 0;
			int i = Key.length-1;
			for (int valKey : Key) {
				 if((valChar & (int)Math.pow(2,i))>0)
				  res += valKey;
				  i--;
			}
			System.out.println(res);
			EncMessage[j] = res;
			j++;
				}
	}
}