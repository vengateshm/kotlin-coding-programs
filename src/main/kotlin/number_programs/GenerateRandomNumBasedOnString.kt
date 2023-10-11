package number_programs

import kotlin.random.Random

// This code may return 0537 as 537 if converted to string
fun generateRandomNumBasedOnString(length: Int): Int {
    val str = "0123456789"
    val result = buildString {
        repeat(length) {
            append(Random.nextInt(str.length))
        }
    }
    return result.toInt()
}

fun main() {
    println(generateRandomNumBasedOnString(4))
}