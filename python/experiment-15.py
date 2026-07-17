# Demonstrate the use of map(), filter(), and reduce() functions.

# map() used to apply single function on every element of the iterable

numbers = list(map(lambda x: x ** 2,[1,23,34]))
print("Example of map function:",numbers)

# filter() function that applies a certain filter on every element in an iterable and shows only the elements that satisfy the filtered condition

numberFilter = list(filter(lambda x: x % 2 == 0,[1,23,45,23,46,68,70]))
print("Example of filter function:",numberFilter)

# reduce() reduces the entire iterable into a single unit or value not a buit-in function

from functools import reduce

numberreduce = reduce(lambda x,y: x * y,[1,45,23])
print('Example of the reduce function:',numberreduce)
