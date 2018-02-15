    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.*;
    import java.util.Arrays.*;
    import java.util.Comparator.*;
    class c{
    	static boolean vowel(char a){
    		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')return true;
    		else return false;
    	}
     
    	public static void main(String args[]){
    		int i,j,count=0,count2=0;
    		Scanner kb= new Scanner(System.in);
    		String s=kb.next();
    		char a;
    		for(i=0;i<s.length();i++){
    			a=s.charAt(i);
    			if(vowel(a))count++;
    			else{
    			    count2=Math.max(count,count2);
    			    count=0;
    			}
    		}
    		count2=Math.max(count,count2);
    		System.out.println(count2);
    	}
    }