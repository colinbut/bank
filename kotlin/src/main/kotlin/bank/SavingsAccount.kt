/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank

import java.math.BigDecimal
import java.math.RoundingMode

class SavingsAccount(name: String, balance: Double) : BankAccount(name, balance) {

    companion object {
        private const val INTEREST_RATE = 0.35
    }

    fun getInterestEarned(): BigDecimal {
        return BigDecimal.valueOf(balance * (INTEREST_RATE / 100))
                .setScale(2, RoundingMode.HALF_EVEN)
    }

    fun payInterest() {
        balance += getInterestEarned().toDouble()
    }
}
