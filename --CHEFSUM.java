import java.io.*;
import java.util.*;
class c{
	public static void main(String args[]){
		int i,j,k,count,sum=0,flag,max,diff,min,min_idx,N;
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t>0){
			sum=0;
			N=kb.nextInt();
			int a[]=new int[N];
			for(i=0; i<N; i++){
				a[i]=kb.nextInt();
				sum+=a[i];
			}
			min=sum+a[0];
			min_idx=0;
			for(i=1; i<=N; i++){
				if(sum+a[i-1] < min){
					min=sum+a[i-1];
					min_idx=i-1;
				}
			}
			System.out.println(min_idx+1);
			t--;
		}
	}
}