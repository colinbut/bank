from product.account import Account


class CashIsaAccount(Account):

    interest_rate = 0.65

    def __init__(self, account_holder):
        print("Opening bank account: " + self.__class__.__name__)
        Account.__init__(self, account_holder)
        print("Opened bank account: " + self.__class__.__name__)

    def calculate_interest_rate(self):
        # Cash ISA's are tax free!
        return CashIsaAccount.interest_rate * self.balance

    def __str__(self):
        return "[" + self.__class__.__name__ + ":balance=" \
               + str(self.balance) + ",interest-rate:" + str(CashIsaAccount.interest_rate) + \
               ", account-holder:" + str(self._account_holder) + "]"
