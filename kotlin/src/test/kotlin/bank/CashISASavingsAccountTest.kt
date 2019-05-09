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

class CashISASavingsAccountTest {

    private val cashISASavingsAccount : CashISASavingsAccount
            = CashISASavingsAccount("Cash ISA Savings Account", MoneyBuilder.build(1200.00))

    @Test
    fun `test get interest earned return correct amount which is tax free` () {
        val interestEarned = cashISASavingsAccount.getInterestEarned()

        assertEquals(BigDecimal.valueOf(7.2).toDouble(), interestEarned.amount.toDouble())
    }
}
