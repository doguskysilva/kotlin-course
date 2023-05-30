package models

open class Employee(
    val name: String,
    val cpf: String,
    val salary: Double,
) {
    open val bonus: Double get() = salary * 0.1
}