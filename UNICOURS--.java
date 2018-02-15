import java.io.*;
import java.util.*;
import java.util.Arrays.*;

class c{
	public static void main(String args[]){
		int i,j,count;
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t>0){
			int n=kb.nextInt();
			int a[]=new int[n];
			count = n;
			for(i=0; i<n; i++)a[i]=kb.nextInt();
			for(i=1; i<=n; i++){
				for(j=0; j<n; j++){
					if(a[j]==i){
						count--;
						break;
					}
				}
			}
			System.out.println(count);
			t--;
		}
	}
}