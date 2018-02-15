import java.io.*;
import java.util.*;
import java.util.Arrays.*;
class c{
    public static void main(String args[]){
        int t,n,i;
        Scanner kb=new Scanner(System.in);
        t=kb.nextInt();
        while(t>0){
            n=kb.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)a[i]=kb.nextInt();
            Arrays.sort(a);
            if(a[0]!=a[1]-1)System.out.println(a[0]);
            else if(a[n-1]!=a[n-2]+1)System.out.println(a[n-1]);
            else{
                for(i=1;i<n-2;i++){
                    if(a[i]==a[i+1]){
                        System.out.println(a[i]);
                        break;
                    }
                }
            }
            t--;
        }
    }
}