import java.io.*;
import java.util.*;
import java.util.Arrays.*;

class c{

    public static void main(String args[]){
      int t,i,flag=0,n,k,data,idx=0,temp=0,time=0;;
      Scanner kb=new Scanner(System.in);
      t=kb.nextInt();
      while(t>0){
      	idx=0;
      	data=0;
           n=kb.nextInt();
           k=kb.nextInt();
           temp=k;
           int a[][]=new int[n][2];
           for(i=0;i<n;i++){
            	a[i][0]=kb.nextInt();
            	a[i][1]=kb.nextInt();
           }
           for(i=0;i<n;i++)data+=a[i][0]*a[i][1];
           if(k>0 && n>1){
           		i=0;
           		while(temp>0 && i<n ){
           		temp-=a[i][0];
           		i++;
           		}
           		idx=i-1;
           		if(temp<0){
           			data-=(temp+k)*a[idx][1];
           			for(i=idx-1;i>=0;i--){
           				data-=a[i][0]*a[i][1];
           			}
         		}	
      		else if(temp==0){
         			for(i=idx;i>=0;i--){
           				data-=a[i][0]*a[i][1];
           			}
         		}
         	}
         	else if(k>0 && n==1){
         		data=(a[0][0]-k)*a[0][1];
         	}
           System.out.println(data);
           t--;
      }

    }
}