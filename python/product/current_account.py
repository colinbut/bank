from product.account import Account


class CurrentAccount(Account):

    def __init__(self, description, account_holder):
        Account.__init__(self, account_holder)
        print("Opening bank account: " + self.__class__.__name__)
        self.description = description
        print("Opened bank account: " + self.__class__.__name__)

    def __str__(self):
        return "[" + self.__class__.__name__ + ":balance=" \
               + str(self.balance) + ",description=" + self.description + ",account_holder:" + str(self._account_holder) \
               + "]"
