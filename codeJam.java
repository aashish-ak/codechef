import java.io.*;
import java.util.*;
import java.util.Arrays.*;
class c{
	static boolean listCheck(String s){
		for(int i=0; i<s.length(); i++){
			if(s.charAt((int)i) != '+') return false;
		}
		return true;
	}
	static String replace(String str, int index, char replace){     
    		char[] chars = str.toCharArray();
    		chars[index] = replace;
    		return String.valueOf(chars);       
	}
    	public static void main(String args[]){
        int t,i,j,k,count=0,no=1;
        Scanner kb=new Scanner(System.in);
        t=kb.nextInt();
        while(t>0){
        	count=0;
            	String s=kb.next();
            	k=kb.nextInt()-1;
            	for(i=0; i<s.length(); i++){
            		if( s.charAt((int)i) == '-' ){
            			count++;
            			for(j=i; j<=k; j++){
            				if(s.charAt((int)j) == '-'){
            					s = replace(s, j ,'+');
            				}
            				else s = replace(s, j ,'-');
            			}
            			i=k;
            		}
            	}
            	if( listCheck(s) == true){
            		System.out.println("Case #"+no+": "+count);
            	}
            	else System.out.println("Case #"+no+": IMPOSSIBLE");
            	no++;
            t--;
        }
    }
}