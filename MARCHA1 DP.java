import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class c{
	static boolean subSet(int set[],int n,int sum){
		if(sum==0)return true;
		else if(n==0 && sum!=0)return false;
		else if(set[n-1]>sum)return subSet(set,n-1,sum);
		else return (subSet(set,n-1,sum-set[n-1]) || subSet(set,n-1,sum));
	}

	public static void main(String args[]){
		int t,n,m,i,count=1;
		Scanner kb= new Scanner(System.in);
		t=kb.nextInt();
		while(t>0){
			n=kb.nextInt();
			m=kb.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++){
				a[i]=kb.nextInt();
			}
			if(subSet(a,n,m)==true)System.out.println("Yes");
			else System.out.println("No");
			t--;
		}
		
	}
}
