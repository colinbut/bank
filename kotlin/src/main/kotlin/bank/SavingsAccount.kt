/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank

import bank.core.Money
import java.math.BigDecimal
import java.util.*

class SavingsAccount(name: String, balance: Money) : BankAccount(name, balance) {

    companion object {
        const val INTEREST_RATE = 0.35
    }

    fun getInterestEarned(): Money {
        return balance.multiplyMoney(Money(BigDecimal.valueOf(INTEREST_RATE / 100), Currency.getInstance("GBP")))
    }

    fun payInterest() {
        balance = balance.addMoney(getInterestEarned())
    }
}
