package string_frequency_array

fun firstNonRepeatingCharInString(str: String): Char? {
    val freqArr = IntArray(26) { 0 }

    for (char in str) {
        freqArr[char.code - 'a'.code]++
    }

    for (char in str) {
        if (freqArr[char.code - 'a'.code] == 1) {
            return char
        }
    }
    return null
}

fun main() {
    println(firstNonRepeatingCharInString("leetcode"))
}