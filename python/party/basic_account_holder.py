from party.account_holder import AccountHolder


class BasicAccountHolder(AccountHolder):

    def __init__(self, party, account):
        AccountHolder.__init__(self, party)
        self.accounts = []
        self.accounts.append(account)

    def add_account(self, account):
        self.accounts.append(account)

    def __str__(self):
        account_str = ""
        for account in self.accounts:
            account_str += str(account)
        return "{" + AccountHolder.__str__(self) + ",accounts:" + account_str + "}"
