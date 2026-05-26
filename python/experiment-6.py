#Demonstrate the use of break, continue, and pass in loops. a. Write a program to print numbers from 1 to 10, but skip
#multiples of 3 using continue. b. Use break to stop execution when a number reaches 7. c. Implement a pass statement
#inside a loop and explain its effect.

print("Continue statement skips the loop to next iteration when a condition is met")
for i in range(11):
    if i % 3 == 0:
        continue
    print(i,end=' ')

print()
print("Break statement stops the execution of the loop after the break statement executed")
for i in range(10):
    if i == 7:
        break
    print(i,end=' ')

print()
print('Pass statement is used for temporary place holder for the future code.')
for i in range(10):
    pass
