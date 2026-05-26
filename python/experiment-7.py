#Implement user-defined functions, understand variable scope, lifetime, and return values. a. Write a function to find the
#factorial of a number. b. Implement a function that checks whether a given number is prime or not

def factorial(num):
    if num < 0:
        return "Enter a valid number"
    if num == 1:
        return 1
    return num * factorial(num-1)

user = input("Enter a number for factorial:")
try:
    number = int(user)
    print(f"Factorial of given number {number} is {factorial(number)}")
except ValueError:
    if not user:
        print("Please enter a number.")
    else:
        print("It's not a valid number.")


print()

def prime(num):
    count = 0
    for i in range(1,num+1):
        if (num % i == 0):
            count += 1

    if count == 2:
        return "a prime number."
    else:
        return "Not a prime number."

user = input('Enter the number to check wether it is a prime number: ')
try:
    number = int(user)
    print(f"The given number {number} is {prime(number)}")
except ValueError:
    if not user:
        print("Please enter a number.")
    else:
        print("It's not a valid number.")
