package string_frequency_array

fun lastNonRepeatingCharInString(str: String): Char? {
    val freqArr = IntArray(26) { 0 }
    for (char in str) {
        freqArr[char.code - 'a'.code]++
    }

    for (i in str.lastIndex downTo 0) {
        if (freqArr[str[i].code - 'a'.code] == 1) {
            return str[i]
        }
    }

    return null
}

fun main() {
    println(lastNonRepeatingCharInString("leetcode"))
}