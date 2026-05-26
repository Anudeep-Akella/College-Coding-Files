#Write a lambda function to calculate the square of a number.

square = lambda x: x ** 2
user = input("Number to be squared: ")
try:
    number = int(user)
    print(f'The square of {number} is {square(number)}')
except ValueError:
    try:
        number = float(user)
        print(f'The square of {number} is {square(number)}')
    except ValueError:
        print("Error: Please enter a valid number")
