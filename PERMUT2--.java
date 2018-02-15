import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class c{
	
	public static void main(String args[]){
		int t,N,i;
		char S[]=new char[100000];
		Scanner kb= new Scanner(System.in);
		t=1;
		while(t>0){
			N=kb.nextInt();
			if(N==0)break;
			for(i=0;i<N;i++){
				S[i]=kb.next().charAt(0);
			}
			String s1=new String(S);
			String s2=new String();
			for(i=1;i<=N;i++){
				s2+=""+(s1.indexOf((char)(i+'0'))+1);
			}
			System.out.println(s1);
			System.out.println(s2);
			if(s2.trim().equals(s1.trim())==true){
				System.out.println("ambiguous");
			}
			else
				System.out.println("not ambiguous");
		}
}
}
