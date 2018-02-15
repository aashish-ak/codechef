import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;
class c{
	
	public static void main(String args[]){
		int t,N,i,m,hero=0,vill=0,flag=0;
		String s;
		Scanner kb= new Scanner(System.in);
		t=kb.nextInt();
		while(t>0){
			N=kb.nextInt();
			String S[]=new String[N];
			for(i=0;i<N;i++)S[i]=kb.next();
			for(i=0;i<N;i++){
				s=new String(S[i]);
				m=s.length();
				if(m>=3){
					if(s.charAt((m-3))=='m' && s.charAt((m-2))=='a' && s.charAt((m-1))=='n')
						hero++;
					else
						vill++;
				}
				else
					vill++;
				if((hero-vill)>=2){
					System.out.println("superheroes");
					flag=1;
					break;
				}
				else if((vill-hero)>=3){
					System.out.println("villains");
					flag=1;
					break;
				}

			}
			if(flag==0)
				System.out.println("draw");
			hero=0;
			vill=0;
			flag=0;
		t--;
		}
	}
}
