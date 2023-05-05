fun main(args: Array<String>) {
    println("Hello World, Welcome to ByteBank!")

    val customerName = "Douglas Silva"
    val accountNumber = 1234
    var amount = 0.0

    if (customerName.lowercase().contains("douglas")) amount += 2.5

    println("Hello, ${customerName.uppercase()}")
    println("Your account is: $accountNumber")
    println("As your name is nice, your initial amount is: $amount")

    // conditionalTest(amount)
}

fun conditionalTest(amount: Double) {
    when {
        amount > 10000.0 -> println("Que tal investir seu dinheiro?")
        amount > 1000.0 -> println("Com nossas caixinhas você pode guardar uma quantia todo mês")
        else -> println("Nossa poupança render até 1% ao mês")
    }
}
