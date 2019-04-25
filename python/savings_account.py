from account import Account


class SavingsAccount(Account):

    def __init__(self):
        Account.__init__(self)

        # 0.35%
        self.interest_rate = 0.35

    def get_interest_rate(self):
        return self.interest_rate

    def calculate_interest_rate(self):
        return self.balance * self.interest_rate

    def apply_interest_rate(self):
        self.balance += self.calculate_interest_rate()
