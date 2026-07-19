# Create and write data into a text file, read the contents of the file and display them on the screen, handle exceptions
# using try-except to prevent file errors

try:
    with open('new_file.txt',"w") as file:
        file.write("File Concepts\n")
        file.write("A file was created and contents added using python.")
    print("The file was created")

    with open('new_file.txt','r') as file:
        print('Reading the file contents')
        contents = file.read()
        print(contents)

except FileNotFoundError as e:
    print(f'File was not found: {e}')

except IOError as e:
    print(f"File can't be created: {e}")

except Exception as e:
    print(f"Unexpected error occured: {e}")
