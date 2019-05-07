/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank

import bank.core.MoneyBuilder
import kotlin.test.Test
import kotlin.test.assertTrue

class BankTest {

    @Test
    fun `get Bank account get name should return the name`() {
        val initialBalance = MoneyBuilder.build(0.0)
        val bankAccount = BankAccount("Current Account", initialBalance)
        assertTrue { "Current Account" == bankAccount.name }
    }

    @Test
    fun `get Bank account balance should return the balance` () {
        val initialBalance = MoneyBuilder.build(200.00)
        val bankAccount = BankAccount("Current Account", initialBalance)
        assertTrue { 200.00 == bankAccount.balance.amount.toDouble() }
    }

    @Test
    fun `withdraw money should return subtract amount from balance` () {
        val initialBalance = MoneyBuilder.build(150.0)
        val bankAccount = BankAccount("Current Account", initialBalance)

        bankAccount.withdraw(amount = MoneyBuilder.build(50.0))

        assertTrue {  100.00 == bankAccount.balance.amount.toDouble() }
    }

    @Test
    fun `deposit money should increase balance by amount` () {
        val initialBalance = MoneyBuilder.build(150.0)
        val bankAccount = BankAccount("Current Account", initialBalance)

        bankAccount.deposit(amount = MoneyBuilder.build(30.0))

        assertTrue {  180.00 == bankAccount.balance.amount.toDouble() }
    }
}
