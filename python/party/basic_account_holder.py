from party.account_holder import AccountHolder


class BasicAccountHolder(AccountHolder):

    def __init__(self, party, account, account_holder_type):
        AccountHolder.__init__(self, party)
        self.accounts = []
        self.accounts.append(account)
        self.account_holder_type = account_holder_type

    def add_account(self, account):
        self.accounts.append(account)

    def __str__(self):
        account_str = ""
        for account in self.accounts:
            account_str += str(account)
        return "{" + AccountHolder.__str__(self) + ",account_holder_type:" + str(self.account_holder_type)  \
               + ",accounts:" + account_str + "}"
