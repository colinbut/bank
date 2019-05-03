/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank

import java.math.BigDecimal
import kotlin.test.Test
import kotlin.test.assertEquals

class SavingsAccountTest {

    @Test
    fun `interests payments should increase balance by interest earned amount`() {
        val savingsAccount = SavingsAccount("Savings Account", 10.00)
        savingsAccount.payInterest()

        val newBalance = savingsAccount.balance

        assertEquals(BigDecimal.valueOf(10.03).toDouble(), newBalance)
    }

    @Test
    fun `get interest earned should return correct amount`() {
        val savingsAccount = SavingsAccount("Savings Account", 10.00)
        val interestEarned = savingsAccount.getInterestEarned()
        assertEquals(BigDecimal.valueOf(0.03), interestEarned)
    }


}
