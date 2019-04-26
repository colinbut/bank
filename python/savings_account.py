from account import Account


class SavingsAccount(Account):

    def __init__(self, initial_deposit, account_holder):
        Account.__init__(self, account_holder)

        print("Opening bank account: " + self.__class__.__name__)

        # Saving Accounts need an initial pay in amount
        self.balance += initial_deposit

        # 0.35%
        self.interest_rate = 0.35
        self.tax_rate = 0.17  # 0.17%

        print("Opened bank account: " + self.__class__.__name__)

    # def get_interest_rate(self):
    #     return self.interest_rate

    def calculate_interest_rate(self):
        interest_earned = self.balance * self.interest_rate
        return interest_earned - (self.tax_rate / 100)

    def apply_interest_rate(self):
        self.balance += self.calculate_interest_rate()

    def deposit(self, amount):
        str_amount = str(amount)

        print("Depositing " + str_amount + " to " + self.__class__.__name__)
        Account.deposit(self, amount)
        print("Deposited " + str_amount + " to " + self.__class__.__name__)

    def withdraw(self, amount):
        print("Withdrawing" + str(amount) + " from " + self.__class__.__name__)
        Account.withdraw(self, amount)
        print("Withdrew" + str(amount) + " from " + self.__class__.__name__)

    def __str__(self):
        return "[" + self.__class__.__name__ + ":balance=" \
               + str(self.balance) + ",interest-rate:" + str(self.interest_rate) +\
                ",tax-rate:" + str(self.tax_rate) + ", account_holder:" + str(self.account_holder) + "]"
