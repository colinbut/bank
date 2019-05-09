/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank

import bank.core.MoneyBuilder
import java.math.BigDecimal
import kotlin.test.Test
import kotlin.test.assertEquals

class SavingsAccountTest {

    private val savingsAccount = SavingsAccount("Savings Account", balance = MoneyBuilder.build(1200.00))

    @Test
    fun `interests payments should increase balance by interest earned amount`() {
        savingsAccount.payInterest()

        val newBalance = savingsAccount.balance

        assertEquals(BigDecimal.valueOf(10.03).toDouble(), newBalance.amount.toDouble())
    }

    @Test
    fun `get interest earned should return correct amount after tax deducted`() {
        val interestEarned = savingsAccount.getInterestEarned()

        assertEquals(BigDecimal.valueOf(0.01).toDouble(), interestEarned.amount.toDouble())
    }

    @Test
    fun `Savings account's interest rate is 0 point 35%` () {
        assertEquals(0.35, SavingsAccount.INTEREST_RATE)
    }

    @Test
    fun `Saving's account's tax rate is 12 point 5 %` () {
        assertEquals(12.5, SavingsAccount.TAX_RATE)
    }


}
