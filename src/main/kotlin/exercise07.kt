fun main() {
    val input = readln()
    val asteriks = "*".repeat(input.length - 2)
    val lastPart = input.substring(input.length - 2)
    println(asteriks + lastPart)
}