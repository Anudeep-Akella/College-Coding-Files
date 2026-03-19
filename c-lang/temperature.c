#include<stdio.h>
void main()
{
	float temp;
	int ch;
	printf("1.To convert Celcius to Farenheit");
	printf("\n2.To convert Farenheit to Celcius");
	printf("\nEnter your choice: ");
	scanf("%d",&ch);
	if(ch == 1)
	{
		printf("Enter Celcius Degree temperature: ");
		scanf("%f",&temp);
		printf("The converted temperature is:%f F\n",1.8*temp+32);
	}
	else
	{
		printf("Enter Farenhiet temperature: ");
		scanf("%f",&temp);
		printf("The Converted temperature is:%f C\n",(temp-32)/1.8);
	}
}
