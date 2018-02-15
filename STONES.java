import java.util.*;
import java.io.*;
import java.util.Collections.*;
import java.util.Arrays.*;

class c{
	
    	static boolean search(String a,char b){
    		for(int i=0;i<a.length();i++){
    			if(a.charAt(i)==b)return true;
    		}
    		return false;
    	}
   	public static void main(String args[]){
    	
   	   	int t,i,j,count=0;
      	boolean flag;
     		Scanner kb=new Scanner(System.in);
      	t=kb.nextInt();
      	while(t>0){
       		count=0;
	        String s1=kb.next();
        	String s2=kb.next();
        		for(i=0;i<s2.length();i++){
        			if(search(s1,s2.charAt(i))){
        				count++;
        			}
           	}
           	System.out.println(count);
            t--;
        }
    }
  }
