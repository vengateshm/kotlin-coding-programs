package string_frequency_array

fun findMostFrequentOccurringCharacter(str: String): Char? {
    val freqArray = IntArray(256) { 0 }

    var maxFrequency = 0
    var maxFreqChar: Char? = null

    for (char in str) {
        freqArray[char.code]++
        if (freqArray[char.code] > maxFrequency) {
            maxFrequency = freqArray[char.code]
            maxFreqChar = char
        }
    }

    return maxFreqChar
}

fun main() {
    println(findMostFrequentOccurringCharacter("leetcode"))
}