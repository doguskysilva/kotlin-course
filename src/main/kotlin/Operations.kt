object Operations {
    fun transfer(from: Account, to: Account, amount: Double): Boolean {
        return if (from.canWithdraw(amount)) {
            from.withdraw(amount)
            to.deposit(amount)

            true
        } else false
    }
}
