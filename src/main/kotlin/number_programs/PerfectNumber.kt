package number_programs

import kotlin.math.sqrt

// A number is perfect number if its sqrt does
// not have decimal places

fun isPerfectNumber(num: Int): Boolean {
    if (num < 0) return false // Negative numbers are not perfect squares
    val sqrt = sqrt(num.toDouble())
    return sqrt == sqrt.toInt().toDouble()
    // Can use Math.floor() instead toInt().toDouble()
}

fun main() {
    println(isPerfectNumber(25))
    println(isPerfectNumber(43))
}