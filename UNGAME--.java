import java.util.*;
import java.io.*;
import java.util.Collections.*;
import java.util.Arrays.*;
import java.lang.*;

class c{
	
   	public static void main(String args[]){
    	
   	   	int t,i,n,m,pos,turn;
      	boolean flag;
     		Scanner kb=new Scanner(System.in);
      	t=kb.nextInt();
      	while(t>0){
                  n=kb.nextInt();
	          	m=kb.nextInt();
	          	int a[]=new int[m+1];
	          	for(i=1;i<=m;i++)a[i]=kb.nextInt();
	          	for(i=1;i<=m;i++){
	          		pos=a[i];
	          		turn=0;
	          		while(pos<=n && pos>=1){
	          			turn++;
	          			if(pos+turn>n)pos-=turn;
	          			else pos+=turn;
	          		}
	          		if(turn==0)System.out.print(2+" ");
	          		else if(turn%2==0)System.out.print(1+" ");
	          		else System.out.print(2+" ");
	          	}
	          	System.out.println();
                  t--;
           	}
      }
}
