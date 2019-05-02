package bank

open class BankAccount (val name: String, var balance: Double) {

    fun withdraw(amount: Double) {
        balance -= amount
    }

    fun deposit(amount: Double) {
        balance += amount
    }

}
