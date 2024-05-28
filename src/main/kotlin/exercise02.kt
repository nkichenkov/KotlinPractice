fun main() {
    println("Enter name")
    val name = readln()
    println("Enter surname")
    val surname = readln()

    val nameFirstSymbol = name.first()// Берем первый символ "name"
    val surnameFirstSymbol = surname[0]// Берем первый символ "surname"

    val initials = nameFirstSymbol + "." + surnameFirstSymbol + "."
    println(initials)
}
/* // иное решение
println("Enter name: ")
val name = readln()
println("Enter surname: ")
val surname = readln()
println(name.first() + "." + surname.first() + ".")
 */