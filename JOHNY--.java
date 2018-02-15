import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
class c{
	
	public static void main(String args[]){
		int t,N,K,i,temp;
		Scanner kb= new Scanner(System.in);
		t=kb.nextInt();
		while(t>0){
			N=kb.nextInt();
			int S[]=new int[N];
			for(i=0;i<N;i++){
				S[i]=kb.nextInt();
			}
			K=kb.nextInt();
			temp=S[K-1];
			Arrays.sort(S);
			for(i=0;i<N;i++){
				if(S[i]==temp){
					temp=i;
					break;
				}
			}
			System.out.println(temp+1);
			t--;
		}
	}
}
