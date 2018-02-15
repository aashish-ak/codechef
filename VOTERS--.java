import java.io.*;
import java.util.*;
import java.util.Arrays.*;

class c{
    public static boolean search(int a[],int b){
        int i;
        if(Arrays.binarySearch(a,b)>=0)return true;
        else return false;
    }
    public static boolean search1(ArrayList<Integer> a,int b){
        if(Collections.binarySearch(a,b)>=0)return true;
        else{
            Collections.sort(a);
            return false;
        }
    }

    public static void main(String args[]){
        int t,n1,n2,n3,i,count;
        Scanner kb=new Scanner(System.in);
        n1=kb.nextInt();
        n2=kb.nextInt();
        n3=kb.nextInt();
        int a[]=new int[n1];
        int b[]=new int[n2];
        int c[]=new int[n3];
        ArrayList<Integer> d=new ArrayList<Integer>();
        for(i=0;i<n1;i++)a[i]=kb.nextInt();
        for(i=0;i<n2;i++)b[i]=kb.nextInt();
        for(i=0;i<n3;i++)c[i]=kb.nextInt();
        for(i=0;i<n1;i++){
            if((search(b,a[i])==true || search(c,a[i])==true) && search1(d,a[i])==false){
                d.add(a[i]);
               
            }
        }
        for(i=0;i<n2;i++){
            if((search(a,b[i])==true || search(c,b[i])==true) && search1(d,b[i])==false){
                d.add(b[i]);
                
            }
        }
        for(i=0;i<n3;i++){
            if((search(b,c[i])==true || search(a,c[i])==true) && search1(d,c[i])==false){
                d.add(c[i]);
                
            }
        }
        System.out.println(d.size());
        for(int j:d)System.out.println(j);

    }
}