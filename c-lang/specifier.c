#include<stdio.h>
void main()
{
	char ch='B';
	printf("%c\n",ch);	//Prints character data
	
	int x = 45,y=90;	
	printf("%d\n",x);	//Prints Integer data
	printf("%d\n",y);
	
	float f =12.67;
	printf("%f\n",f);	//Prints Float data
	printf("%e\n",f);	//Prints in specific notation
	
	int a = 67;
	printf("%o\n",a);	//Prints octal format number
	printf("%x\n",a);	//Prints Hexa format number
	
	char str[] = "Hello World";
	printf("%s\n",str);
	printf("%20s\n",str);	//Prints string shifted to right
	printf("%-20s\n",str);	//Prints left align of the string
	printf("%20.5s\n",str);	//String shifted to right 20 characters and prints the 5 characters
	printf("%-20.5s\n",str);//left align and prints 5 characters
}
	
