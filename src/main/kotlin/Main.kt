import models.Director
import models.Employee
import models.Manager

fun line() {
    println("-----------------------------")
}

fun main() {
    println("Hello World, Welcome to ByteBank!")
    line()

    val employee = Employee(
        name = "Douglas",
        cpf = "00000000033",
        salary = 1250.0
    )

    println("Name: ${employee.name}")
    println("Salary: ${employee.salary}")
    println("Extra Bonus: ${employee.bonus}")
    line()

    val manager = Manager(
        name = "Doug",
        cpf = "0221334445533",
        salary = 3000.0,
        password = "12345"
    )

    println("Name: ${manager.name}")
    println("Salary: ${manager.salary}")
    println("Extra Bonus: ${manager.bonus}")
    println("Can open the system: ${manager.auth("123456")}")
    line()

    val director = Director(
        name = "Doug",
        cpf = "0221334445533",
        salary = 3000.0,
        password = "12345",
        plr = 1000.0
    )

    println("Name: ${director.name}")
    println("Salary: ${director.salary}")
    println("Extra Bonus: ${director.bonus}")
    println("Can open the system: ${director.auth("12345")}")
}

