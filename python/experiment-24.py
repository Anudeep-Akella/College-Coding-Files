# Implement operator overloading using special methods (__add__(), __sub__(), etc.)

class Time:
    def __init__(self,hours = 0,minutes = 0,seconds = 0):
        self.hours = hours
        self.minutes = minutes
        self.seconds = seconds
        self.normalize()

    def normalize(self):
        """Normalizes the time so seconds and minutes are in between 0-59"""

        if self.seconds >= 60:
            self.minutes += self.seconds // 60
            self.seconds %= 60

        if self.minutes >= 60:
            self.hours += self.minutes // 60
            self.minutes %= 60

    
    def __repr__(self):
        return f"{self.hours:02}:{self.minutes:02}:{self.seconds:02}"

    def __add__(self,other):
        h = self.hours + other.hours
        m = self.minutes + other.minutes
        s = self.seconds + other.seconds

        return Time(h,m,s)

    def __sub__(self,other):
        total1 = self.hours * 3600 + self.minutes * 60 + self.seconds
        total2 = other.hours * 3600 + other.minutes * 60 + other.seconds

        diff = abs(total1 - total2)
        h = diff // 3600
        m = (diff % 3600) // 60
        s = diff % 60

        return Time(h,m,s)

    def __eq__(self,other):
        return (self.hours == other.hours and self.minutes == other.minutes and self.seconds == other.seconds)


t1 = Time(2,45,58)
t2 = Time(3,15,25)

print("Time 1=",t1)
print("Time 2=",t2)

print("Addition of times:",t1 + t2)
print("Substraction of times:",t1-t2)
print("Equality of times:",t1 == t2)
