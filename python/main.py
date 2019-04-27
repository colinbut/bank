from product.credit_card_account import CreditCardAccount
from product.current_account import CurrentAccount
from party.account_holder_type import AccountHolderType
from party.basic_account_holder import BasicAccountHolder
from party.party import Party
from product.savings_account import SavingsAccount
from product.cash_isa_account import CashIsaAccount

print("=======Bank=========")
print("Welcome to Bank of Colin")


# Create the Banker(s)
colin = BasicAccountHolder(Party("Colin", "But", "Address"), AccountHolderType.ADVANCE_CUSTOMER)
# Create Accounts for Colin
colin_current_account = CurrentAccount("Current Bank Account", colin)
colin_savings_account = SavingsAccount(1.00, colin)
colin_cash_isa_account = CashIsaAccount(colin)

amy = BasicAccountHolder(Party("Amy", "Man", "Address"), AccountHolderType.BASIC_CUSTOMER)
amy_s_current_account = CurrentAccount("Current Bank Account", amy)
amy_s_savings_account = SavingsAccount(10.00, amy)
amy_s_savings_account.deposit(2500.00)

# Do some bank transactions..
colin_current_account.deposit(10.00)
colin_current_account.deposit(200.00)
colin_current_account.withdraw(50.00)

colin_credit_card_account = CreditCardAccount(colin, 5000.00)

account_holders = {colin, amy}

colin_bank_accounts = (colin_current_account, colin_savings_account, colin_cash_isa_account, colin_credit_card_account)


def print_colin_bank_accounts():
    for account in colin_bank_accounts:
        print(account)
    else:
        print("The above are all bank accounts belonging to Colin")


print_colin_bank_accounts()

for account_holder in account_holders:
    print(account_holder)
