import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
class c{

	public static void main(String args[]){
		int t,N,i,count=1;
		Scanner kb= new Scanner(System.in);
		N=kb.nextInt();
		int S[]=new int[N];
		for(i=0;i<N;i++){
			S[i]=kb.nextInt();
		}
		for(i=1;i<N-1;i++){
			if((S[i-1]>S[i] && S[i+1]>S[i]) || (S[i-1]<S[i] && S[i+1]<S[i]))
				count++;
		}
		System.out.println(count);
	}
}
