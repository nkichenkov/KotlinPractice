fun main() {
    println("Please enter your name and surname dividing by \" \"")
    val input = readln()
    val name = input.substringBefore(" ")//берем все, что находится до " "
    val surname = input.substringAfter(" ")//берем все, что находится после " "
    println(name)
    println(surname)
}
