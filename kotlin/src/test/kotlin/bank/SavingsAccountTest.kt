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
    fun `incue interests should increase balance by interest incued amount`() {

    }

    @Test
    fun `get interest earned should return correct amount`() {
        val savingsAccount = SavingsAccount("Savings Account", 10.00)

        val interestEarned = savingsAccount.getInterestEarned()

        assertEquals(BigDecimal.valueOf(0.03), interestEarned)
    }


}
