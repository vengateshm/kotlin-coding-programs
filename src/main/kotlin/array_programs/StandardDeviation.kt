package array_programs

import kotlin.math.pow
import kotlin.math.sqrt

fun calculateSD(arr: DoubleArray): Double {
    val mean = arr.average()
    var sum = 0.0
    for (num in arr) {
        sum += (num - mean).pow(2.0)
    }
    val variance = sum / arr.size
    return sqrt(variance)
}

fun main() {
    println(calculateSD(doubleArrayOf(10.0, 12.0, 14.0, 16.0, 18.0)))
}