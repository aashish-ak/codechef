import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class c{
	
	public static void main(String args[]){
		int B=0,u=0,l=0,b=0,a=0,s=0,r=0,i,count=0,min;
		
		Scanner kb= new Scanner(System.in);
		String q=kb.next();
		for(i=0;i<q.length();i++){
				switch(q.charAt(i)){
					case 'B':B++;
					break;
					case 'u':u++;
					break;
					case 'l':l++;
					break;
					case 'b':b++;
					break;
					case 'a':a++;
					break;
					case 's':s++;
					break;
					case 'r':r++;
					break;
					default: break;
				}
		}
		int[] p={B,u,l,b,a,s,r};
		
		min=p[0];
		for(i=0;i<6;i++){
			if(p[i]<min)min=p[i];
		}

		if(B>=min && b>=min && u>=2*min && l>=min && a>=2*min && s>=min && r>=min)
			count=min;


		System.out.println(count);
	}
}
