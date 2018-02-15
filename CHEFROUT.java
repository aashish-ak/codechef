import java.io.*;
import java.util.*;
import java.util.Arrays.*;
class c{
	
    	public static void main(String args[]){
            int t,i,j,k,count=0,flag=0,flag2;
            Scanner kb=new Scanner(System.in);
            t= kb.nextInt();
            while(t>0){
            	flag = count = flag2 =0;
            	String s=kb.next();
          		for(i=0; i<s.length(); i++){
                      if(flag2==1 && s.charAt(i)!='S'){
                        flag=1;
                        break;
                      }
          			if(s.charAt(i) == 'E'){
                            count=1;
          			}
                       else if(s.charAt(i) == 'C' && count==1){
                            flag=1;
                            break;
                      }
          			else if(s.charAt(i) == 'S'){       
          				flag2=1;
          				
                      }         		
                 }
          		if(flag==1)System.out.println("no");
           		else System.out.println("yes");
            	t--;
            }
      }
} 