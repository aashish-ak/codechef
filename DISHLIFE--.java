import java.io.*;
import java.util.*;
import java.util.Arrays.*;
class c{
	
    	public static void main(String args[]){
            int t,i,j,k,count=0,N,n,val,l;
            Scanner kb=new Scanner(System.in);
            t=kb.nextInt();
            while(t>0){
            	count=0;
            	N=kb.nextInt();
                  k=kb.nextInt();
                  int ing[]=new int[k+1];
                  for(i=0; i<=k ;i++)ing[i]=0;
                  int count[]=new int[N];
            	for(i=0; i<N; i++){
                        n=kb.nextInt();
                        for(j=0; j<n; j++){
                          val=kb.nextInt();
                          for(l=1; l<=k; l++){
                            if(val==l){
                              count[i]++;
                              ing[val]=1;
                            }
                          }
                      }
                  }
            	for(i=1; i<=k; i++){
                      if(ing[i] != 1){
                        System.out.println("sad");
                        break;
                      }
                  }
                  for(i=0; i<N; i++){
                    if(count[i] <= k)
                  }

            	t--;
            }
      } 
}