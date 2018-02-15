    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.*;
    import java.util.Arrays.*;
    import java.util.Comparator.*;
    class c{

    public static void main(String args[]){
    	int t,i,j,n,m,count=0;
    	Scanner kb= new Scanner(System.in);
    	t=kb.nextInt();
    	while(t>0){
    		count=0;
    		n=kb.nextInt();
    		m=kb.nextInt();
    		int a[]=new int[n];
    		int b[]=new int[m];
    		for(i=0;i<n;i++)a[i]=kb.nextInt();
    		for(i=0;i<m;i++)b[i]=kb.nextInt();
    		Arrays.sort(b);
    		for(i=0;i<n;i++){
    			if(Arrays.binarySearch(b,a[i])>=0)count++;
    		}
    		System.out.println(count);
    		t--;
    	}
    }
}