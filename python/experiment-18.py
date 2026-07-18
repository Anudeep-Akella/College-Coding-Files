# Create a dictionary of student details and access elements, Modify an existing value in the dictionary, Delete an item
# from the dictionary using pop().

student_details = {
            "name" : "Anudeep",
            "roll No": 2,
            'marks': 35,
            'number': 2
        }

print("The student_details in a dictionary:",student_details)

student_details['name'] = "Sai"

print("\nThe student details after the modifications:",student_details)

print("\nThe removing of an element from the student details dictionary:",student_details.pop('number'))
