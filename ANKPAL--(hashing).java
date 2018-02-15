import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class c{
	
	public static void main(String args[]){
		int T,N,i,j,k,l;
		Scanner kb= new Scanner(System.in);
		String S=kb.next();
		T=kb.nextInt();
		while(T>0){
			i=kb.nextInt()-1;
			j=kb.nextInt()-1;
			k=kb.nextInt()-1;
			l=kb.nextInt()-1;
			String s=new String(S);
			String m=s.substring(i,j+1);
			m=new StringBuffer(m).reverse().toString();
			s=new StringBuffer(s).delete(i,j+1).toString();
			s=new StringBuffer(s).insert(i,m).toString();
			m=s.substring(k,l+1);
			String p=new StringBuffer(m).reverse().toString();
			if(p.equals(m))System.out.println("Yes");
			else System.out.println("No");
			T--;
		}
	}
}
