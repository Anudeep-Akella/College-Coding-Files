#Demonstrate the use of for loops, while loops, and range-based iterations. a. Write a program to print the first ‘n’
#Fibonacci numbers using a while loop. b. Write a program to calculate the sum of all numbers from 1 to ‘n’ using a for
#loop. c. Implement a program to find the factorial of a number using a while loop.

n1,n2 = 0,1
number = int(input('Enter th range of fibonnaci numbers: '))
print(n1,n2,end=' ')
i = 2
while i != number:
    n3 = n1 + n2
    print(n3,end = ' ')
    n1,n2 = n2,n3
    i += 1

print()
number = int(input('Enter a number to find the sum: '))
add = 0
for i in range(number+1):
    add += i
print('Sum =',add)

number = int(input('Enter the for which fafctorial needs to be found: '))
product = 1
while number != 0:
    product *= number
    number -= 1

print('Factorial is',product)
