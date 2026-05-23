#Demonstrate the use of nested loops to generate different patterns. a. Print an inverted pyramid pattern. b. Print the
#iFloyd’s Triangle pattern using nested loops.

num = int(input('Enter the number of rows of pyramid you want: '))
for i in range(num,0,-1):
    print(' '*(num-i)+'*'*(2 * i - 1))


num = int(input('Enter the number of rows for the floyd\'s triangle: '))
place = 1
for i in range(1,num+1):
    for j in range(1,i+1):
        print(place,end=' ')
        place += 1
    print()
