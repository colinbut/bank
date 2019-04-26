from current_account import CurrentAccount
from party.account_holder_type import AccountHolderType
from party.basic_account_holder import BasicAccountHolder
from party.party import Party
from savings_account import SavingsAccount
from cash_isa_account import CashIsaAccount

print("=======Bank=========")
print("Welcome to Bank of Colin")


# Create the Banker(s)
colin = BasicAccountHolder(Party("Colin", "But", "Address"), AccountHolderType.ADVANCE_CUSTOMER)
# Create Accounts for Colin
current_account = CurrentAccount("Current Bank Account", colin)
savings_account = SavingsAccount(1.00, colin)
cash_isa_account = CashIsaAccount(colin)

amy = BasicAccountHolder(Party("Amy", "Man", "Address"), AccountHolderType.BASIC_CUSTOMER)
amy_s_current_account = CurrentAccount("Current Bank Account", amy)
amy_s_savings_account = SavingsAccount(10.00, amy)
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
