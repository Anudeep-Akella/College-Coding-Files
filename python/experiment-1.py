# Write a program that demonstrates the use of variables, data types, input operations, and type conversion and perform
# explicit and implicit type conversion.

print('Hello World')
name = input('Enter your name ')
print("Hello",name+'\n')

print('---Implicit type conversion---')
num1 = 10
num2 = 34.56
print('Implicitly sum of two numbers is always float')
print(f'Sum of {num1} and {num2} = {num1 + num2}\n')

print('---Explicit type conversion---')
print("The number:",num2)
print('After explicitly converting into integer: ',int(num2))
