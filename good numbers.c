#include<stdio.h>
int div(int n)
{
    int i,k=0;
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
            k++;
    }
    return k;
}
int check(int n)
{
    int i,k=0;
    for(i=1;i<n;i++)
    {
        if(div(i)<div(n))
            k++;
    }
    if(k==n-1)
        return 0;
    else
        return 1;
}
int main()
{
    int i,T,L,R,no=0,j;
    scanf("%d",&T);
    for(i=0;i<T;i++)
    {
        no=0;
        scanf("%d %d",&L,&R);
        for(j=L;j<=R;j++)
        {
            if(check(j)==0)
                no++;
        }
        printf("%d\n",no);
    }
    return 0;
}
