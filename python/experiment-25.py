# Implement exception handling in Python by handling division by zero, using multiple except blocks to catch different
# types of errors, and raising custom exceptions for invalid inputs.

class InvalidInputError(Exception):
    def __init__(self,message = 'Invalid Input provided!'):
        self.message = message
        super().__init__(self,message)

def division(a,b):
    try:
        if not isinstance(a,(int,float)) or not isinstance(b,(int,float)):
            raise InvalidInputError('Both inputs must be numbers')

        result = a/b

    except ZeroDivisionError:
        print("Error: Division by zero.")
        result = None

    except TypeError:
        print('Error: Unsupported type during division.')
        result = None

    except InvalidInputError as e:
        print(f"Custom Error: {e}")
        result = None

    except Exception as e:
        print("An unexpected error occured")
        result = None

    else:
        print("Divison was successfull")

    finally:
        print("Execution of Division completed")
        return result

print("Result of Normal Division:",division(10,2))
print("Result of Division by zero:",division(10,0))
