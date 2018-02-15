import java.io.*;
import java.util.*;
import java.util.Arrays.*;
class c{
    public static void main(String args[]){
        int t,n,i,a,b;
        Scanner kb=new Scanner(System.in);
        t=kb.nextInt();
        while(t>0){
            a=kb.nextInt();
            b=kb.nextInt();
            if(a%2==0){
            	if(b%2==0) {
            		if(b==a+2 || (b==a-2))System.out.println("YES");
            		else System.out.println("NO");
            	}
            	else{
            		if(b==a-1){
            			System.out.println("YES");
            		}
            		else System.out.println("NO");
            	}
            }
            else{
            	if(b%2 == 0){
            		if(b == (a+1)){
            			System.out.println("YES");
            		}
            		else System.out.println("NO");
            	}
            	else{
            		if( a==b+2 || a==b-2){
            			System.out.println("YES");
            		}
            		else System.out.println("NO");
            	}
            }
            t--;
        }
    }
}