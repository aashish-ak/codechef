#include <iostream>
#include <cmath>
#include <string>
using namespace std;

int main(){
	int T,N,M,i,j,flag=0;
	char a[1000][1000];
	cin>>T;
	while(T--){
		flag=0;
		cin>>N>>M;
		for(i=0;i<N;i++){
			for(j=0;j<M;j++){
				cin>>a[i][j];
			}
		}
		for(i=0;i<N;i++){
			for(j=0;j<M;j++){
				if(a[i][j]=='W' &&  ( ((j>0 && j<M-1 && i>0 && i<N-1) && (a[i][j+1]=='A' || a[i][j-1]=='A' || a[i-1][j]=='B' || a[i+1][j]=='A'))   ||  j==0 || j==M-1 || i==N-1 || ((i==0 && j>0 && j<M-1) && (a[i][j+1]=='A' || a[i][j-1]=='A' || a[i+1][j]=='A')) )){
					flag=1;
					break;
				}
				else if(a[i][j]=='A' &&  ( ((j>0 && j<M-1 && i>0 && i<=N-1) && (a[i][j+1]=='W' || a[i][j-1]=='W' || a[i-1][j]=='W' || a[i-1][j]=='B')) || ((i==0 && j>0 && j<M-1) && (a[i][j+1]=='W' || a[i][j-1]=='W')) || ((j==0 && i>0 && i<=N-1) && (a[i][j+1]=='W' || a[i-1][j]=='W' || a[i-1][j]=='B')) || ((i==0 && j==M-1) && (a[i][j-1]=='W')) || ((i==0 && j==0) && (a[i][j+1]=='W')) || ((j==M-1 && i>0 && i<=N-1) && (a[i][j-1]=='W' || a[i-1][j]=='W' || a[i-1][j]=='B')) )){
					flag=1;
					break;
				}
			}
			if(flag==1)break;
		}
		if(flag==1)cout<<"no"<<endl;
		else cout<<"yes"<<endl;
		
	}
	return 0;
}
