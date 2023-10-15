package number_programs

import kotlin.math.sqrt

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..<num) {
        if (num % i == 0) return false
    }
    return true
}

// Sqrt based
fun isPrime1(num: Int): Boolean {
    if (num < 2) return false
    val numSqrt = sqrt(num.toDouble()).toInt()
    for (i in 2..<numSqrt) {
        if (num % i == 0) return false
    }
    return true
}

// Check till num/2
fun isPrime2(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..num / 2) {
        if (num % i == 0) return false
    }
    return true
}

fun printPrimeNumberSeries(n: Int) {
    for (i in 1..n) {
        if (isPrime(i)) {
            println(i)
        }
    }
}

fun main() {
    println(isPrime(17))
    println(isPrime1(17))
    println(isPrime2(17))
    printPrimeNumberSeries(100)
}