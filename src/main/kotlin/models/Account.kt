package models

import isPositive

class Account(
    private val customerName: String,
    private val number: Int
) {
    var balance = 0.0
        private set

    val identifier = "${this.customerName} - ${this.number}"

    fun deposit(amount: Double) {
        if (isPositive(amount)) this.balance += amount
    }

    fun withdraw(amount: Double) {
        if (canWithdraw(amount)) {
            this.balance -= amount
        }
    }

    fun canWithdraw(amount: Double): Boolean {
        return this.balance >= amount
    }
}
