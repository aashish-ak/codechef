import java.io.*;
import java.util.*;

class c{
	public static void main(String args[]){
		int i,j,count,sum,flag,flag2;
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t>0){
			int n=kb.nextInt();
			String s=kb.next();
			count=flag2=0;
			for(i=0; i<n; i++){
				if(count!=0 && count !=1){
					flag2=1;
					break;
				}
				if(s.charAt(i) == 'H'){
					
					count++;
				}
				else if(s.charAt(i) == 'T'){
					count--;
				}
			}
			if(flag2==1 || count==1)
				System.out.println("Invalid");
			else	System.out.println("Valid");
			t--;
		}
	}
}