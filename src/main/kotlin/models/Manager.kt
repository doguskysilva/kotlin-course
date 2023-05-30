package models

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: String
) : Employee (
    name = name,
    cpf = cpf,
    salary = salary
){
    override val bonus: Double get() = super.bonus + (salary * 0.2)
    fun auth(password: String): Boolean {
        return this.password == password
    }
}