import java.io.*;
import java.util.*;

class c{
	public static void main(String args[]){
		int i,j,k,count,sum,flag,max;
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t>0){
			int n=kb.nextInt();
			int q=kb.nextInt();
			int a[]=new int[n];
			int b[]=new int[q];
			ArrayList <Integer> c=new ArrayList <Integer>();
			for(i=0; i<n; i++)a[i]=kb.nextInt();
			for(i=0; i<q; i++)b[i]=kb.nextInt();
			Arrays.sort(a);
			flag=0;
			for(i=0; i<q; i++){
				c=new ArrayList <Integer>();
				for(j=n-1; j>-1; j--){
					if(a[j]<b[i]){
						c.add(a[j]);
						flag=1;
					}
				}
				if(flag==0){
					System.out.println(n);
					break;
				}
				int LiveS=n-c.size();
				while(c.size() != 0){
					int reqS=b[i]-c.get(0);
					if(reqS>c.size()-1){
						System.out.println(LiveS);
						break;
					}
					for(k=0; k<reqS; k++){
						c.remove(c.size()-1);
						c.set(0, c.get(0)+1);
					}
					LiveS++;
					c.remove(0);
				}
			}
			
			t--;
		}
	}
}