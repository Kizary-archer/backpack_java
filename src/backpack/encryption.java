package backpack;

class encryption {
		public static void GetEncryption(String[] args) {
	int val = 100;
	int res = 0,p;
	int[] Key = {1,2,3,4,5,6,7,8};
	int i = Key.length-1;
	for (int var : Key) {
	   p =  val & (int)Math.pow(2,i);
		if(p>0)
		 res += var;
		 i--;
	}
	System.out.print(res);
		}
	}