import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays.*;
import java.util.Comparator.*;
class c{

	public static void main(String args[]){
		int t,N,i,count=1,temp,min;
		Scanner kb= new Scanner(System.in);
		t=kb.nextInt();
		while(t>0){
			N=kb.nextInt();
			int a[]=new int[N];
			for(i=0;i<N;i++){
				a[i]=kb.nextInt();
			}
			min=a[0];
			for(i=1;i<N;i++){
				if(a[i]<=min){
					min=a[i];
					count++;
				}
			}
			System.out.println(count);
			count=1;
			t--;
		}
	}
}
