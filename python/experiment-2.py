# Demonstrate the use of different arithmetic, relational, logical, bitwise, and assignment operators in Python. a. Write a
# program that accepts two numbers and performs all arithmetic operations. b. Implement a simple logical condition (e.g.,
# check if a number is positive and even). c. Use bitwise operators to swap two numbers without a temporary variable.

num = int(input('Enter the first number:'))
num2 = int(input('Enter the second number:'))
print()
print('---Arthemetic Operations---')
print('Addition:',num + num2)
print('Substraction:',num-num2)
print('Multiplication:',num * num2)
print('Division:',num / num2)
print('Integer Division:',num//num2)
print('Exponential:',num ** num2)
print('Modulo:',num % num2)
print()
number = int(input('Enter the number for checking positive and even:'))
if(number > 0 and number % 2 == 0):
    print('Number is positive and even')
else:
    print('Number is not positive')

print()
print('---Swapping of two numbers---')
a =int(input('Enter the first number:'))
b = int(input('Enter the second number:'))
print('Before Swapping numbers are:')
print(a,' ',b)
print('After Swapping numbers are:')
a = a ^ b
b = a ^ b
a = a ^ b
print(a,' ' ,b)
