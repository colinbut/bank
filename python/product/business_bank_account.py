from product.account import Account


class BusinessBankAccount(Account):

    def __init__(self, account_holder):
        Account.__init__(self, account_holder)

    def __str__(self):
        return "{" + self.__class__.__name__ + "-account_holder:" + str(self._account_holder) + "}"

