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
import kotlin.test.assertTrue

class BankTest {

    private val currency : Currency = Currency.getInstance("GBP")

    @Test
    fun `get Bank account get name should return the name`() {
        val initialBalance = Money(BigDecimal.valueOf(0.00), currency)
        val bankAccount = BankAccount("Current Account", initialBalance)
        assertTrue { "Current Account" == bankAccount.name }
    }

    @Test
    fun `get Bank account balance should return the balance` () {
        val initialBalance = Money(BigDecimal.valueOf(200.00), currency)
        val bankAccount = BankAccount("Current Account", initialBalance)
        assertTrue { 200.00 == bankAccount.balance.amount.toDouble() }
    }

    @Test
    fun `withdraw money should return subtract amount from balance` () {
        val initialBalance = Money(BigDecimal.valueOf(150.00), currency)
        val bankAccount = BankAccount("Current Account", initialBalance)

        bankAccount.withdraw(Money(BigDecimal.valueOf(50.00), currency))

        assertTrue {  100.00 == bankAccount.balance.amount.toDouble() }
    }

    @Test
    fun `deposit money should increase balance by amount` () {
        val initialBalance = Money(BigDecimal.valueOf(150.00), currency)
        val bankAccount = BankAccount("Current Account", initialBalance)

        bankAccount.deposit(Money(BigDecimal.valueOf(30.00), currency))

        assertTrue {  180.00 == bankAccount.balance.amount.toDouble() }
    }
}
