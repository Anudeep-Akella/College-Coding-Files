# Define a Student class with attributes name, roll number, marks create objects of the Student class and display details
# using methods Implement a constructor (__init__()) to initialize the object.

class Student:
    def __init__(self,name,roll_number,marks):
        self.name = name
        self.roll_number = roll_number
        self.marks = marks

    def __str__(self):
        return f"Student_details: \n Name: {self.name} \n Roll Number: {self.roll_number} \n Marks: {self.marks}"


student1 = Student("sai",24,45)
student2 = Student('Tarun',25,34)
print(student1)
print("\n",student2)
