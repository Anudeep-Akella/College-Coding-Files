#include<stdio.h>
int main()
{
	int n,pos,num,arr[20];
	printf("Enter the number of elements in the array:");
	scanf("%d",&n);
	printf("Enter the array Elements:\n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the number to be inserted:");
	scanf("%d",&num);
	printf("Enter the position at which it needs to be inserted:");
	scanf("%d",&pos);
	if(pos < 0 || pos > n)
	{
		printf("Inserting is not possible");
	}
	else{

	for(int i= n ;i > pos;i--)
	{
		arr[i] = arr[i-1];
	}
	arr[pos] = num;
	n++;
	}
	printf("Array elements after insertion:");
	for(int i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");
}
