import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class c{

	public static void main(String args[]){
		int t,n,m,i,j,sum=0,flag=0;
		Scanner kb= new Scanner(System.in);
		t=kb.nextInt();
		while(t>0){
			n=kb.nextInt();
			m=kb.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++){
				a[i]=kb.nextInt();
			}
			for(i=0;i<(int)Math.pow(2,n);i++){
				flag=0;
				sum=0;
				String s=Integer.toBinaryString(i);
				String s2=new StringBuffer(s).reverse().toString();

				for(j=0;j<s.length();j++){
					if(s2.charAt(j)=='1')
					sum+=a[j];
				}
				if(sum==m){
					flag=1;
					break;
				}
				
			}
			if(flag==1)System.out.println("Yes");
			else System.out.println("No");
			flag=0;
			sum=0;
			t--;
		}
		
	}
}
