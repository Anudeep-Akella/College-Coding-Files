from collections import deque

queue = deque()

while True:
    print("------Menu------")
    print("\n 1. Inserion")
    print("2. Deletion")
    print("3. Viewing the elements")
    print("4. Exit")

    choice = int(input('Enter your choice: '))

    match choice:
        case 1:
            ele = input('Enter the element to store: ')
            queue.append(ele)
        case 2:
            print('Removing the element from the left as queue follows (FIFO)')
            print(queue.popleft())
        case 3:
            print(queue)
        case 4:
            break

