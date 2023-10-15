package number_programs

fun sumOfAllDigitsUsingLoop(num: Long): Long {
    var n = num
    var sum = 0L
    while (n != 0L) {
        val rem = n % 10
        sum += rem
        n /= 10
    }
    return sum
}

fun main() {
    println(sumOfAllDigitsUsingLoop(123))
}