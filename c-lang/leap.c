#include<stdio.h>
void main()
{
	int year;
	printf("Enter the year: ");
	scanf("%d",&year);
	if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
	{
		printf("Give year %d is a leap year\n",year);
	}
	else
	{
		printf("Given year %d is not a leap year\n",year);
	}
}
