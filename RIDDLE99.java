import java.io.*;
import java.util.*;

class c{
	public static void main(String args[]){
		long j,k,count,sum,flag,max,diff,a,b,m;
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t>0){
			a=kb.nextLong();
			b=kb.nextLong();
			k=kb.nextLong();
			long first_div=(a%k == 0) ? a : a+(k-a%k);
			long last_div=(b%k == 0) ? b : b-(b%k);
			System.out.println((last_div-first_div)/k+1);
			t--;
		}
	}
}