package bank

import bank.core.Money
import bank.core.MoneyBuilder

class CashISASavingsAccount(name: String, balance: Money) : SavingsAccount(name, balance) {

    companion object {
        const val INTEREST_RATE : Double = 0.60
    }

    override fun getInterestEarned(): Money {
        return balance.multiplyMoney(MoneyBuilder.build(INTEREST_RATE / 100))
    }

}
