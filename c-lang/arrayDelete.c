// Program for Number deletion in an array
#include<stdio.h>
int main()
{
	int pos,n,arr[20];
	printf("Enter the number of elements:");
	scanf("%d",&n);
	printf("Enter the elements:\n");
	for(int i=0; i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the position of element to be deleted:");
	scanf("%d",&pos);
	for(int i=pos;i<n;i++)
	{
		arr[i] = arr[i+1];
		
	}
	n--;
	printf("Elements in the array are:");
	for(int i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");
}
