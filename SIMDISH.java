import java.io.*;
import java.util.*;
import java.util.Arrays.*;
class c{
	
    	public static void main(String args[]){
            int t,i,j,k,count=0,no=1;
            Scanner kb=new Scanner(System.in);
            String a[]=new String[4];
            String b[]=new String[4];
            t=kb.nextInt();
            while(t>0){
            	count=0;
            	for(i=0; i<4; i++){
            		a[i]=kb.next();
            	}
            	for(i=0; i<4; i++){
            		b[i]=kb.next();
            	}
            	for(i=0; i<4; i++){
            		for(j=0; j<4; j++){
            			if(a[i].equals(b[j]))count++;
            		}
            	}
            	if(count >= 2)System.out.println("similar");
            	else System.out.println("dissimilar");
            	t--;
            }
        
    } 
}