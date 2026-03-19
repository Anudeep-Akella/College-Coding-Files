#include<stdio.h>
void main()
{
	int i,n;
	printf("Enter the number: ");
	scanf("%d",&n);
	for(i=2;i<n;i++)
	{
		if(n%i==0)
		{
			printf("\n%d is not a prime number\n",n);
			break;
		}
	}
	if(n == i)
	{
		printf("\n%d is a prime number \n",n);
	}
}
