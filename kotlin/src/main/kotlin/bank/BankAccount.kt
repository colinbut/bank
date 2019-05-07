package bank

import bank.core.Money

open class BankAccount (val name: String, var balance: Money) {

    fun withdraw(amount: Money) {
        balance = balance.subtractMoney(amount)
    }

    fun deposit(amount: Money) {
        balance = balance.addMoney(amount)
    }

}
