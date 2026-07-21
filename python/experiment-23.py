# Create a Person class with basic attributes, extend it to a Student class with an additional attribute, override the display()
# method, and demonstrate multiple inheritance using a SportsPerson class.

class Person:
    def __init__(self,name,gender):
        self.name = name
        self.gender = gender

    def display(self):
        return f"Name: {self.name} \n Gender: {self.gender}"

class Student(Person):
    def __init__(self,name,gender,student_id):
        super().__init__(name,gender)
        self.student = student_id

    def display(self):
        return f"Name: {self.name} \n Gender: {self.gender} \n Student ID: {self.student}"


class SportsPerson(Student,Person):
    def __init__(self,name,gender,student_id,sport):
        super().__init__(name,gender,student_id)
        self.sport = sport

    def display(self):
        return f"Name: {self.name} \n Gender: {self.gender} \n Student ID: {self.student} \n Sport Enrolled: {self.sport}"


print('---Object of Person Class---')
person = Person('Raj','Male')
print(person.display())
print('\n---Object of Student Class---')
student = Student('Sai','Male',20264)
print(student.display())
print('\n---Object of Sports Person Class---')
sports_person = SportsPerson('Rohit','Male',20152,'Boxing')
print(sports_person.display())
