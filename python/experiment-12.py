import sys
my_list = []

while True:
    print("Enter a number 1(push) 2(pop) 3(list elements) 4(exit):",end=' ')
    n = int(input())
    if n == 1:
        num = input("Enter the element to push into the list: ")
        my_list.append(num)
    elif n == 2:
        num = int(input("Enter the element to remove from the list: "))
        my_list.pop(num)
    elif n == 3:
        print(my_list)
    elif n == 4:
        sys.exit()
