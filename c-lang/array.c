// A simple numeric array construction in c

#include<stdio.h>
int main()
{
	int N,X;
	int flag=0;
	scanf("%d %d",&N,&X);
	int a[N];
	for(int i=0;i<N;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<N;i++)
	{
		if(a[i] == X)
		{
			flag=1;
		}
	}
	if(flag == 1)
	{
		printf("YES\n");
	}
	else
	{
		printf("NO\n");
	}
}
