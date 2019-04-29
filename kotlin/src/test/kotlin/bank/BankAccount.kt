package bank

class BankAccount (val name: String, var balance: Double) {

    fun withdraw(amount: Double): Double {
        balance -= amount
        return amount
    }

    fun deposit(amount: Double) {
        balance += amount
    }

}
