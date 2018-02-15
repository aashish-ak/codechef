import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class c{
	
	public static void main(String args[]){
		int t,N,A,K,i,count=1;
		Scanner kb= new Scanner(System.in);
		A=kb.nextInt();
		N=kb.nextInt();
		K=kb.nextInt();
		int a[]=new int[K];
		for(i=0;i<K;i++)a[i]=0;
		if(A<=N)a[0]=A;
		else{
			a[0]=N;
			a[1]=1;
		}
		for(i=1;i<K-1;i++){
			if(a[i]>N){
				a[i]=N;
				a[i+1]=1;
			}
		}
		for(i=0;i<K;i++)System.out.print(a[i]+" ");
		System.out.println();
	}
}
