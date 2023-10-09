package number_programs

fun printDigitsEndToStart(num: Int) {
    var n = num
    while (n != 0) {
        val rem = n % 10
        println(rem)
        n /= 10
    }
}

fun printDigitsStartToEnd(num: Int) {
    val digitList = mutableListOf<Int>()
    var n = num
    while (n != 0) {
        val rem = n % 10
        digitList.add(rem)
        n /= 10
    }
    digitList.reverse()
    digitList.forEach(::println)
}

fun printDigitsByStringConversion(num: Int) {
    num.toString().forEach { println(it) }
}

fun printDigitsByRecursionEndToStart(num: Int) {
    if (num == 0) return
    val rem = num % 10
    println(rem)
    printDigitsByRecursionEndToStart(num / 10)
}

fun printDigitsByRecursionStartToEnd(num: Int) {
    if (num == 0) return
    val rem = num % 10
    printDigitsByRecursionStartToEnd(num / 10)
    println(rem)
}

fun main() {
    println("From end to start")
    printDigitsEndToStart(123)
    println("From start to end")
    printDigitsStartToEnd(123)
    println("By String Conversion :")
    printDigitsByStringConversion(112)
    println("By Recursion end to start")
    printDigitsByRecursionEndToStart(345)
    println("By Recursion start to end")
    printDigitsByRecursionStartToEnd(456)
}