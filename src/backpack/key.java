package backpack;

import java.util.*;
import java.util.stream.IntStream;
import java.math.BigInteger;

class key {
	int m,n;
	int[] ClosedKey;
	int[] OpenKey;

	public void GetOpenKey() {
		Input();
		CreateOpenKey();
	}
	private void CreateOpenKey() {
		OpenKey = new int[ClosedKey.length];
		for (int i=0; i<OpenKey.length;i++){
			OpenKey[i] = ClosedKey[i] * n % m;
		}
	}
	private void Input() {
		ClosedKey = new int[8];
		int SumCloseKey = 0;
		System.out.println("enter escalating closed key");
		Scanner in = new Scanner(System.in);
		System.out.println("enter value");
		ClosedKey[0] = in.nextInt();
		SumCloseKey += ClosedKey[0];
		for (int i=1; i<ClosedKey.length;i++){
			do{	
			System.out.println("enter a value"+i+" greater " + SumCloseKey);
			ClosedKey[i] = in.nextInt();
					
			}
			while(SumCloseKey+1>ClosedKey[i]);
			SumCloseKey += ClosedKey[i];
		}	
		do{
		System.out.println("enter a value M greater " + SumCloseKey);
		m = in.nextInt();
		}
		while(m <= SumCloseKey);
		System.out.println("M = " + m);
		do{
		System.out.println("enter N mutually simple with M");
		n = in.nextInt();
		}
		while(gcdThing(m, n) != 1);
		System.out.println("N = " + n);
		in.close();

	}
	private int gcdThing(int m, int n) { //наибольший общий делитель M и N
		BigInteger v1 = BigInteger.valueOf(m);
		BigInteger v2 = BigInteger.valueOf(n);
		BigInteger gcd = v1.gcd(v2);
		return gcd.intValue();
	}

}
