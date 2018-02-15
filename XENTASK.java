import java.io.*;
import java.util.*;
import java.util.Arrays.*;

class c{

    public static void main(String args[]){
      int t,n;
      Scanner kb=new Scanner(System.in);
      t=kb.nextInt();
      while(t>0){
      	n=kb.nextInt();
      	int x[]=new int[n];
      	int y[]=new int[n];
      	for(int i=0;i<n;i++)x[i]=kb.nextInt();
      	for(int i=0;i<n;i++)y[i]=kb.nextInt();
      	int sum1=0,sum2=0;
      	for(int i=0;i<n;i++){
      		if(i%2==0){
      			sum1+=x[i];
      			continue;
      		}
      		sum1+=y[i];
      	}
      	for(int i=0;i<n;i++){
      		if(i%2==0){
      			sum2+=y[i];
      			continue;
      		}
      		sum2+=x[i];
      	}
      	if(sum1<sum2)System.out.println(sum1);
      	else System.out.println(sum2);
         t--;
      }

    }
}