/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank

import bank.core.Money
import bank.core.MoneyBuilder

open class SavingsAccount(name: String, balance: Money) : BankAccount(name, balance) {

    companion object {
        const val INTEREST_RATE : Double = 0.35
        const val TAX_RATE: Double = 12.5
    }

    open fun getInterestEarned(): Money {
        val interestsEarned = balance.multiplyMoney(amount = MoneyBuilder.build(INTEREST_RATE / 100))
        val taxDeducted = balance.multiplyMoney(amount = MoneyBuilder.build(TAX_RATE / 100))
        return interestsEarned.subtractMoney(taxDeducted)
    }

    fun payInterest() {
        balance = balance.addMoney(getInterestEarned())
    }
}
