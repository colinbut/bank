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
    fun `get Bank account get name should return the name`() {
        val bankAccount = BankAccount("Current Account", 0.0)
        assertTrue { "Current Account" == bankAccount.name }
    }

    @Test
    fun `get Bank account balance should return the balance` () {
        val bankAccount = BankAccount("Current Account", 200.00)
        assertTrue { 200.00 == bankAccount.balance }
    }

    @Test
    fun `withdraw money should return subtract amount from balance` () {
        val bankAccount = BankAccount("Current Account", 150.00)

        bankAccount.withdraw(50.00)

        assertTrue {  100.00 == bankAccount.balance }
    }

    @Test
    fun `deposit money should increase balance by amount` () {
        val bankAccount = BankAccount("Current Account", 150.00)

        bankAccount.deposit(30.00)

        assertTrue {  180.00 == bankAccount.balance }
    }
}
