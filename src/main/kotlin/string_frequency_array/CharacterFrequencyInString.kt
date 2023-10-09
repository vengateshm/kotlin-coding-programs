package string_frequency_array

fun charFrequencyOfString(input: String) {
    // Assume all are alphabets and lower case
    val freqArray = IntArray(26) { 0 }

    for (char in input) {
        freqArray[char.code - 'a'.code]++
    }
    println(freqArray.contentToString())
}

fun main() {
    charFrequencyOfString("cab")
}