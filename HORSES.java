import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class c{
	
	public static void main(String args[]){
		int t,N,S[]=new int[5000],i,j,min;
		Scanner kb= new Scanner(System.in);
		t=kb.nextInt();
		while(t>0){
			N=kb.nextInt();
			for(i=0;i<N;i++){
				S[i]=kb.nextInt();
			}
			min=Math.abs(S[0]-S[1]);
			for(i=0;i<N;i++){
				for(j=0;j<N;j++){
					if(j!=i && Math.abs(S[i]-S[j])<min)
						min=Math.abs(S[i]-S[j]);
				}
			}
			System.out.println(min);
			t--;
		}	

	}
}
