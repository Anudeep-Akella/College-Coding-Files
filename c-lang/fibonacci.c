#include<stdio.h>
void main()
{
	int f1=0,f2=1,f3,n,i=3;
	printf("Enter the range of the fibonacci series:");
	scanf("%d",&n);
	printf("%d %d",f1,f2);
	while(i<=n)
	{
		f3 = f1+f2;
		printf(" %d",f3);
		f1=f2;
		f2=f3;
		i = i+1;
	}
	printf("\n");
}
