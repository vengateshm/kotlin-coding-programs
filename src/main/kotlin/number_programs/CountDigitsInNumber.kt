package number_programs

import kotlin.math.log10

// Loop based
fun countDigits(num: Int): Int {
    var n = num
    var count = 0
    while (n != 0) {
        count++
        n /= 10
    }
    return count
}

// Log10 based
fun countDigits1(num: Int): Int {
    if (num == 0) return 1
    // log10(1) = 0.0 10 ^ 0
    // log10(10) = 1.0 10 ^ 1
    // log10(100) = 2.0 10 ^ 2
    // log10(1000) = 3.0 10 ^ 3
    return (log10(kotlin.math.abs(num).toDouble()) + 1).toInt()
}

fun main() {
    println(countDigits(112))
    println(countDigits1(112))
}