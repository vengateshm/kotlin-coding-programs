package number_programs

import kotlin.random.Random

fun randomStringBasedOnRanges(length: Int): String {
    val chars = (0..1) + ('a'..'z') + ('A'..'Z')
    println(chars::class.java)
    return (1..length).joinToString("") { chars[Random.nextInt(chars.size)].toString() }
}

fun main() {
    println(randomStringBasedOnRanges(4))
}