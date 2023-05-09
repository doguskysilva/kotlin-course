
fun main() {
    println("Hello World, Welcome to ByteBank!")

    val account1 = Account("Douglas", number = 3456)
    account1.deposit(30.0)
    account1.deposit(-30.0)

    val account2 = Account(customerName = "Maysa", 7890)
    account2.deposit(10.0)

    val bankOperations = Operations()

    val operationTransfer = bankOperations.transfer(account1, account2, 10.0)
    if (operationTransfer) {
        println("New amount to ${account2.identifier}: ${account2.balance}")
        println("New amount to ${account1.identifier}: ${account1.balance}")
    } else {
        println("Unavailable amount in ${account1.identifier} account to transfer")
    }

    println("\n")
    loopTest(1)
}

fun loopTest(totalAccounts: Int) {
    for (i in 1..totalAccounts) {
        val customerName = "Douglas Silva $i"
        val accountNumber = 1234 + i
        var amount = 0.0

        if (customerName.lowercase().contains("douglas")) amount += 2.5

        println("Hello, ${customerName.uppercase()}")
        println("Your account is: $accountNumber")
        println("As your name is nice, your initial amount is: $amount")

        conditionalTest(amount)
    }
}

fun conditionalTest(amount: Double) {
    when {
        amount > 10000.0 -> println("Que tal investir seu dinheiro?")
        amount > 1000.0 -> println("Com nossas caixinhas você pode guardar uma quantia todo mês")
        else -> println("Nossa poupança render até 1% ao mês")
    }
}
