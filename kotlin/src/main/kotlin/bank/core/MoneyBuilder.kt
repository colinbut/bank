/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank.core

import bank.DEFAULT_CURRENCY
import java.math.BigDecimal

object MoneyBuilder {
    fun build(value: Double) : Money {
        return Money(BigDecimal.valueOf(value), DEFAULT_CURRENCY)
    }
}
