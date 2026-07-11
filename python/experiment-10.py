# Create a list of student names and access elements using indexing and slicing, Modify specific elements in the list, Append, insert, and remove items using append(), insert(), and remove().

students = ['Sai','Srinivas','Apoorva','Bindu']
print('---list indexing---')
print(students[1])
print(students[:])
print()
print('---List Methods---')
print("Append: Adding a new element at the end of the list")
students.append('Pandu')
print(students)
print("Insert: Adding a new element at the specifies index")
students.insert(2,'vardhan')
print(students)
print("remove: Removing an element from the list")
students.remove('Sai')
print(students)
