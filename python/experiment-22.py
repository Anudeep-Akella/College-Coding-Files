# Define a BankAccount class with public and private attributes (account_no, _balance) implement methods to deposit and
# withdraw money with access restrictions and demonstrate the use of getter and setter methods for accessing private data.

class BankAccount:
    def __init__(self,account_no,balance):
        self.account = account_no
        self._balance = balance

    def deposit(self,amount):
        if amount > 0:
            self._balance += amount
            print(f"Amount deposited to the account {self.account} and the balance is {self._balance}.")
        else:
            print('Amount entered must be positive.')

    def withdraw(self,amount):
        if amount > 0:
            if amount <= self._balance:
                self._balance -= amount
                print("Amount was withdrawn")
            else:
                print("Insufficent funds!")
        else:
            print('Amount entered must be positive.')

    @property
    def balance(self):
        return self._balance

    @balance.setter
    def balance(self,new_balance):
        print(f"Balance is updated!")
        self._balance = new_balance

    def __str__(self):
        return f"Account Details: \n Account Number: {self.account} \n Balance: {self._balance}"
        

person1 = BankAccount(25624, 12000) 
person1.deposit(199)
person1.deposit(-200)
person1.withdraw(29)
person1.withdraw(-289)
person1.withdraw(13000)
print(person1.balance)
person1.balance = 15000
print(person1)
