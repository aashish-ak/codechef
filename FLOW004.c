#include <stdio.h>
int main(){
	int t,digits[10],N,i;
	scanf("%d",&t);
	while(t--){
		scanf("%d",&N);
		i=0;
		while(N!=0){
			digits[i]=N%10;
			N/=10;
			i++;
		}
		printf("%d\n",(digits[0]+digits[i-1]));
	}
	return 0;
}