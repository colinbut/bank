class Account:

    def __init__(self):
        self.balance = 0.0

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        self.balance -= amount

    # def get_balance(self):
    #     return self.balance
