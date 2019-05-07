/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank

import bank.core.Money
import java.math.BigDecimal
import java.util.*
import kotlin.test.Test
import kotlin.test.assertEquals

class SavingsAccountTest {

    private val initialBalance = Money(BigDecimal.valueOf(10.00), DEFAULT_CURRENCY)

    @Test
    fun `interests payments should increase balance by interest earned amount`() {
        val savingsAccount = SavingsAccount("Savings Account", initialBalance)
        savingsAccount.payInterest()

        val newBalance = savingsAccount.balance

        assertEquals(BigDecimal.valueOf(10.03).toDouble(), newBalance.amount.toDouble())
    }

    @Test
    fun `get interest earned should return correct amount`() {
        val savingsAccount = SavingsAccount("Savings Account", initialBalance)
        val interestEarned = savingsAccount.getInterestEarned()
        assertEquals(BigDecimal.valueOf(0.03).toDouble(), interestEarned.amount.toDouble())
    }


}
