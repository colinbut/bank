from current_account import CurrentAccount
from party.basic_account_holder import BasicAccountHolder
from party.party import Party
from savings_account import SavingsAccount
from cash_isa_account import CashIsaAccount

print("=======Bank=========")
print("Welcome to Bank of Colin")

# Create Accounts for Colin
current_account = CurrentAccount("Current Bank Account")
savings_account = SavingsAccount(1.00)
cash_isa_account = CashIsaAccount()

# Create the Banker(s)
colin = BasicAccountHolder(Party("Colin", "But", "Address"), current_account)
colin.add_account(savings_account)
colin.add_account(cash_isa_account)

amy_s_current_account = CurrentAccount("Current Bank Account")
amy_s_savings_account = SavingsAccount(10.00)
amy = BasicAccountHolder(Party("Amy", "Man", "Address"), amy_s_current_account)
amy.add_account(amy_s_savings_account)
amy_s_savings_account.deposit(2500.00)

# Do some bank transactions..
current_account.deposit(10.00)
current_account.deposit(200.00)
current_account.withdraw(50.00)

account_holders = {colin, amy}

colin_bank_accounts = (current_account, savings_account, cash_isa_account)


def print_colin_bank_accounts():
    for account in colin_bank_accounts:
        print(account)
    else:
        print("The above are all bank accounts belonging to Colin")


def print_account_details():
    print(current_account)
    print(savings_account)
    print(cash_isa_account)


print_colin_bank_accounts()


"""
    Below are suppose to be...
"""

for account_holder in account_holders:
    print(account_holder)
