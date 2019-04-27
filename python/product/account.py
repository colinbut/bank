class Account:

    __account_number_counter = 0
    __sort_code_counter = 0

    def __init__(self, account_holder):
        self.balance = 0.0
        self._account_holder = account_holder

        Account.__account_number_counter += 1
        self.__account_number = Account.__account_number_counter

        Account.__sort_code_counter += 1
        self.__sort_code = Account.__sort_code_counter

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        self.balance -= amount

    def get_sort_code(self):
        return self.__account_number

    def get_account_number(self):
        return self.__sort_code

    @staticmethod
    def get_account_number_counter():
        return Account.__account_number_counter

    @classmethod
    def get_sort_code_counter(cls):
        return Account.__sort_code_counter

    def __str__(self):
        pass
