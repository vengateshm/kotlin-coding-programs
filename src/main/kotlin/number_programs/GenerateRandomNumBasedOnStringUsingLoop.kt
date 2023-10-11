package number_programs

import kotlin.random.Random

// This code may return 0537 as 537 if converted to string
fun generateRandomNumBasedOnStringUsingLoop(length: Int): Int {
    val str = "0123456789"

    val chars = CharArray(length)
    for (i in 0..<length) {
        chars[i] = str[Random.nextInt(str.length)]
    }

    return chars.joinToString("").toInt()
}

fun main() {
    println(generateRandomNumBasedOnStringUsingLoop(4))
}