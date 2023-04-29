fun main(args: Array<String>) {
    println("Hello World!")

    val customerName = "Douglas Silva"
    val accountNumber = 1234
    var amount = 0.0

    if (customerName.lowercase().contains("douglas")) {
        amount += 2.5
    }

    println("Hello, ${customerName.uppercase()}")
    println("Your account is: $accountNumber")
    println("As your name is nice, your initial amount is: $amount")
}