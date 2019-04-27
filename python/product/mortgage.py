from product.account import Account


class Mortgage(Account):

    def __init__(self, account_holder):
        Account.__init__(self, account_holder)
