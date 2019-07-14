/*
 * |-------------------------------------------------
 * | Copyright © 2019 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package bank

class Bank {
    fun getBankers(): List<Banker> {
        val accountHolder1 = Banker("Colin But")
        val accountHolder2 = Banker("Peter Bloggs")
        return listOf(accountHolder1, accountHolder2)
    }

    data class Banker(val name: String)
}
