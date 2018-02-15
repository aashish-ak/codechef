import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays.*;
import java.util.Comparator.*;
class c{

	public static void main(String args[]){
		int t,i,j,temp=-1,count=0,len;
		Scanner kb= new Scanner(System.in);
		t=kb.nextInt();
		while(t>0){
			String s=kb.next();
			len=s.length();
			if(len%2==0){
				for(i=0;i<len/2;i++){
					for(j=(len/2)+1;j<len;j++){
						if(s.charAt(i)==s.charAt(j) && j!=temp){
							temp=j;
							count++;
						}
					} 
				}
				if(count==len/2)System.out.println("YES");
				else System.out.println("NO");
			}
			else{
				for(i=0;i<len/2;i++){
					for(j=(len/2)+2;j<len;j++){
						if(s.charAt(i)==s.charAt(j) && j!=temp){
							temp=j;
							count++;
						}
					}
				}
				if(count==len/2)System.out.println("YES");
				else System.out.println("NO");
			}
			count=0;
			temp=-1;
			t--;
		}
	}
}
