fun main() {
    println("Please enter your name and surname dividing by \" \"")
    val input = readln()
    val name = input.substringBefore(" ")
    val surname = input.substringAfter(" ")
    println(name)
    println(surname)
}
