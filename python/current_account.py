from account import Account


class CurrentAccount(Account):

    def __init__(self, description):
        Account.__init__(self)
        self.description = description
