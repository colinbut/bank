from product.account_type import AccountType
from product.business_bank_account import BusinessBankAccount
from product.current_account import CurrentAccount


class Bank:

    def __init__(self):
        self.accounts = set()

    def create_bank_account(self, account_holder, account_type):
        print("Creating " + str(account_type) + " for " + str(account_holder))

        new_account = None
        if account_type == AccountType.CURRENT_ACCOUNT:
            new_account = CurrentAccount("Current Account", account_holder)
            self.accounts.add(new_account)
        elif account_type == AccountType.SAVINGS_ACCOUNT:
            pass
        elif account_type == AccountType.CASH_ISA_ACCOUNT:
            pass
        elif account_type == AccountType.CREDIT_CARD_ACCOUNT:
            pass
        elif account_type == AccountType.BUSINESS_ACCOUNT:
            new_account = BusinessBankAccount(account_holder)
            self.accounts.add(new_account)
        else:
            raise NameError

        if new_account is not None:
            print("Created " + str(account_type) + " for " + str(account_holder))
            return new_account.get_account_number()

    def get_accounts(self):
        return self.accounts

    def get_bank_account(self, account_number):
        print("Retrieving bank account: " + account_number)
        for account in self.accounts:
            if account_number == account.get_account_number(self):
                return account

    def deposit_money(self, account_number, amount):
        account = self.get_bank_account(account_number)
        account.deposit(self, amount)
