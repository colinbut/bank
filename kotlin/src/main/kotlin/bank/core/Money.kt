/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank.core

import java.math.BigDecimal
import java.util.*

data class Money(val amount: BigDecimal, val currency: Currency) {

    fun addMoney(amount: Money) : Money {
        this.amount.add(amount.amount)
        return this
    }

    fun subtractMoney(amount: Money) : Money {
        this.amount.subtract(amount.amount)
        return this
    }

    fun multiplyMoney(amount: Money) : Money {
        this.amount.multiply(amount.amount)
        return this
    }
}
