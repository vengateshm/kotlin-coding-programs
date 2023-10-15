package recursion

fun sumOfAllDigits(num: Long): Long {
    if (num == 0L) return 0L
    val rem = num % 10
    return rem + sumOfAllDigits(num / 10)
}

fun main() {
    println(sumOfAllDigits(123))
}