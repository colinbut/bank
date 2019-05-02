/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank

import java.math.BigDecimal
import java.math.RoundingMode

class SavingsAccount(name: String, balance: Double) : BankAccount(name, balance) {

    fun getInterestEarned(): BigDecimal {
        val interestRate = 0.35

        return BigDecimal.valueOf(balance * (interestRate / 100))
                .setScale(2, RoundingMode.HALF_EVEN)
    }
}
