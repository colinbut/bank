from account import Account


class CashIsaAccount(Account):

    def __init__(self):
        Account.__init__(self)

        print("Opening bank account: " + self.__class__.__name__)
        self.interest_rate = 0.65
        print("Opened bank account: " + self.__class__.__name__)

    def calculate_interest_rate(self):
        # Cash ISA's are tax free!
        return self.interest_rate * self.balance

    def __str__(self):
        return "[" + self.__class__.__name__ + ":balance=" \
               + str(self.balance) + ",interest-rate:" + str(self.interest_rate) + "]"
