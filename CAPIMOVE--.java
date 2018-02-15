import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class c{
	static int q=0;
	static int[] arr(int D[],int n,int p){
		q=0;
		int i=0;
		int a[]=new int[n];
		for(i=0;i<(n-1)*2;i++){
			if(D[i]==p){
				if(i%2==0){
					a[q]=D[i+1];
					q++;
				}
				else{
					a[q]=D[i-1];
					q++;
				}
			}
		}
		
		return a;
	}

	static boolean search(int a[],int n,int p){
		int i;
		for(i=0;i<n;i++){
			if(a[i]==p)return true;
		}
		return false;
	}

	public static void main(String args[]){
		int t,N,i,idx,r,p,max;
		Scanner kb= new Scanner(System.in);
		t=kb.nextInt();
		while(t>0){
			N=kb.nextInt();
			int P[]=new int [N];
			for(i=0;i<N;i++)
			P[i]=kb.nextInt();
			int D[]=new int[(N-1)*2];
			for(i=0;i<2*(N-1);i++){
				D[i]=kb.nextInt()-1;
			}
			for(p=0;p<N;p++){
				int a[]=arr(D,N,p);
				int b[][]=new int[N-q][2];
				r=0;
				if(q!=(N-1)){
					for(i=0;i<N;i++){
						if(search(a,q,i)==false && i!=p){
							b[r][0]=P[i];
							b[r][1]=i;
							r++;
						}
					}
					max=b[0][0];
					idx=0;
					for(i=0;i<r;i++){
						if(b[i][0]>max){
							max=b[i][0];
							idx=i;
						}
					}
					
					System.out.print((b[idx][1]+1)+" ");
				}
				else System.out.print(0+" ");

			}
			System.out.println();
			t--;
		}
	}
}
