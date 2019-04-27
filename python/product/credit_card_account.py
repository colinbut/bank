from product.account import Account


class CreditCardAccount(Account):

    def __init__(self, account_holder, credit_limit):
        print("Opening Credit Card Account")
        Account.__init__(self, account_holder)
        self.credit_limit = credit_limit
        print("Opened Credit Card Account with credit limit: " + str(credit_limit))

    def __str__(self):
        return "[" + self.__class__.__name__ + "-credit_limit:" + str(self.credit_limit) + "]"
