package recursion

fun sumOfNNumbers(num: Int): Int {
    if (num <= 0) return 0
    return num + sumOfNNumbers(num - 1)
}

fun main() {
    println(sumOfNNumbers(10))
}