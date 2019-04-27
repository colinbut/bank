import random


class Account:

    def __init__(self, account_holder):
        self.balance = 0.0
        self.account_holder = account_holder

        self.account_number = random.randint(11111111, 99999999)
        self.sort_code = "80-12-34"

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        self.balance -= amount

    def __str__(self):
        pass
