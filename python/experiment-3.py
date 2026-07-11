#Implement decision-making statements for different conditions. a. Write a Python program to check whether a number is
#positive, negative, or zero. b. Develop a grade calculator that takes a student’s marks and prints their grade using
#if-elif-else. c. Implement a program to check if a year is a leap year.

num = int(input("Enter a number: "))
if(num < 0):
    print("Number is negative")
elif(num > 0):
    print("Number is positive")
else:
    print("Number is zero!")


marks = int(input('Enter the marks of the student: '))
if marks >= 75:
    print("A grade")
elif marks >= 50:
    print('B grade')
else:
    print('C grade')



year = int(input('Enter a year '))
if((year % 4 == 0 and year %100 != 0) or year % 400 == 0):
    print('It is a leap year')
else:
    print('Not a leap year')
