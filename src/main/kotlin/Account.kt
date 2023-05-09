class Account {
    var customarName = ""
    var number = 0
    private var balance = 0.0

    fun getBalance(): Double {
        return this.balance
    }

    fun deposit(amount: Double) {
        this.balance += amount
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