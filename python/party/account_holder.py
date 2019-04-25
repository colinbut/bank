class AccountHolder:

    def __init__(self, party):
        self.party = party

    def __str__(self):
        return "{" + str(self.party) + "}"
