//COURTESY--Aashish Kumar
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class c{
	
	public static void main(String args[]){
		long t,c,d,l,i,count=1;
		Scanner kb= new Scanner(System.in);
		t=kb.nextLong();
		while(t>0){
			c=kb.nextLong();
			d=kb.nextLong();
			l=kb.nextLong();
			if(l%4==0 && c<=(d*2) && l<=((c+d)*4) && l>=(d*4)){
				System.out.println("yes");
			}
			else if(l%4==0 && c>(d*2) && l<=((c+d)*4) && l>=((d+(c-(d*2)))*4)){
				System.out.println("yes");
			}
			
			else System.out.println("no");
			
			t--;	
		}
	}
}
