#include<stdio.h>
#include<math.h>
void main()
{
	int a,b,c,d;
	float x1,x2;
	printf("Enter values of a,b,c:");
	scanf("%d %d %d",&a,&b,&c);
	d = b*b - 4*a*c;
	if(d==0)
	{
		x1 = -b/(2*a);
		printf("Roots are real and equal");
		printf("\n Root1 and Root2 are same:%.2f",x1);
	}
	else if(d>0)
	{
		x1 = -b + sqrt(d)/ (2*a);
		x2 = -b - sqrt(d) / (2*a);
		printf("Roots are real and not equal");
		printf("\n root1 = %.2f and root2 = %.2f",x1,x2);
	}
	else
	{
		printf("Roots are imaginary");
	}
}
