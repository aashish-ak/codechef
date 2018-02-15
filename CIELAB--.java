import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class a{
	int A,B,d[]=new int[100],i=0,j,r;
	Scanner kb= new Scanner(System.in);
	void getdata(){
		A=kb.nextInt();
		B=kb.nextInt();
		r=A>B ? (A-B):(B-A);
		i=0;
		while(r!=0){
			d[i]=(r)%10;
			i++;
			r/=10;
		}
		if(d[0]==2)
			d[0]=3;
		else
			d[0]=2;
		for(j=i-1;j>=0;j--){
			System.out.print(d[j]);
		}
		System.out.println();
	}
}
class c{
	public static void main(String args[]){
		int t;
		a b= new a();
		b.getdata();

	}
}
