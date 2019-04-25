from account import Account


class CurrentAccount(Account):

    def __init__(self, description):
        Account.__init__(self)
        print("Opening bank account: " + self.__class__.__name__)
        self.description = description
        print("Opened bank account: " + self.__class__.__name__)

    def __str__(self):
        return "[" + self.__class__.__name__ + ":balance=" \
               + str(self.balance) + ",description=" + self.description + "] "
