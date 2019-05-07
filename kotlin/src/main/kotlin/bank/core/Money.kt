/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank.core

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

data class Money(var amount: BigDecimal, val currency: Currency) {

    fun addMoney(amount: Money) : Money {
        this.amount = this.amount.add(amount.amount).setScale(2, RoundingMode.HALF_EVEN)
        return this
    }

    fun subtractMoney(amount: Money) : Money {
        this.amount = this.amount.subtract(amount.amount).setScale(2, RoundingMode.HALF_EVEN)
        return this
    }

    fun multiplyMoney(amount: Money) : Money {
        return Money(this.amount.multiply(amount.amount).setScale(2, RoundingMode.HALF_EVEN), currency)
    }
}
