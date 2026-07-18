# Find the index of a given element in a tuple, Count the occurrences of an element in a tuple, Create and access
# elements in a nested tuple. 

my_tuple = (12,34,45,32,45)
print("Index of the element 32 in the tuple is:",my_tuple.index(32))

print("Number of occurences of 45 in a tuple is:",my_tuple.count(45))

my_tuple = ((12,34),(34,45))
print("The tuple before modification:",my_tuple)
my_list = list(my_tuple)
new_list = []
for i in my_list:
    change = list(i)
    change[0] = 23

    new_list.append(change)

print("The tuple after modification:",tuple(new_list))



