# Create a tuple containing student details (name, roll number, age, marks). Access and modify tuple elements
# (demonstrate immutability). Iterate over tuple elements using a loop.

my_tuple = ("Ram",12,22,34)
print("Student Details before modification:",my_tuple)
student_details = list(my_tuple)
student_details[2] = 25
print("Student details after modification:",tuple(student_details))
try:
    my_tuple[0] = "shyam"
except TypeError as e:
    print("Error:",e)



for i in my_tuple:
    print(i,end=' ')

print()
