class BasicAccountHolder:

    def __init__(self, party, account_holder_type):
        self.party = party
        self.account_holder_type = account_holder_type

    def __str__(self):
        return "{party:" + str(self.party) + ", account_holder_type:" + str(self.account_holder_type) + "}"
