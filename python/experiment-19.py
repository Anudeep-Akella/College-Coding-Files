# Iterate through a dictionary using for loop (keys, values, items), Sort the dictionary based on keys and values.

student_details = {
            'name':'Anudeep',
            'roll no': 22,
            'marks':35
        }

print("Looping through the dictionary using the keys() function")
print("The keys were printed:")
for i in student_details.keys():
    print(i)

print("\nLooping through the dictionary values using values() function")
print("The values printed are:")

for i in student_details.values():
    print(i)

print("\nLooping through the entire dictionary showing both keys and values using items()")
print("The dictionary contents are:")
for i,j in student_details.items():
    print(i,j)
