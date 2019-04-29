/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank

import kotlin.test.Test
import kotlin.test.assertTrue

class BankTest {

    @Test
    fun `Bank account have name`() {
        val bankAccount = BankAccount("Current Account")
        assertTrue { "Current Account" == bankAccount.name }
    }
}
