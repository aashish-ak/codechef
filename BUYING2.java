import java.util.*;
import java.io.*;
import java.util.Collections.*;
import java.util.Arrays.*;

class c{
    public static void main(String args[]){
        int t,i,n,x,sum,ans;
        boolean flag;
        Scanner kb=new Scanner(System.in);
        t=kb.nextInt();
        while(t>0){
            sum=0;
            flag=false;
            n=kb.nextInt();
            x=kb.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)a[i]=kb.nextInt();
            for(int j:a)sum+=j;
            Arrays.sort(a);
            ans=sum/x;
            if((sum%x)>=a[0])flag=true;
            if(flag)ans=-1;
            System.out.println(ans);
            t--;
        }
    }
}