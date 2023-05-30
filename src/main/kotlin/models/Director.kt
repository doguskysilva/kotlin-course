package models

class Director(
    name: String,
    cpf: String,
    salary: Double,
    val password: String,
    val plr: Double
) : Employee (
    name = name,
    cpf = cpf,
    salary = salary
){
    override val bonus: Double get() = super.bonus + (salary * 0.3) + plr

    fun auth(password: String): Boolean {
        return this.password == password
    }
}