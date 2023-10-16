package number_programs

import kotlin.math.pow

// String based length check
fun isArmstrongNumber(num: Int): Boolean {
    val length = num.toString().length

    var n = num
    var newNum = 0
    while (n != 0) {
        val rem = n % 10
        newNum += rem.toDouble().pow(length.toDouble()).toInt()
        n /= 10
    }

    return num == newNum
}

fun printArmstrongNumberForGivenRange(n: Int) {
    for (i in 1..n) {
        if (isArmstrongNumber(i)) println(i)
    }
}

fun main() {
    println(isArmstrongNumber(153))
    println(printArmstrongNumberForGivenRange(10000))
}