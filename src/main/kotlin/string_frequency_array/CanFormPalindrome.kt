package string_frequency_array

fun canFormPalindrome(input: String): Boolean {
    val freqArray = IntArray(26) { 0 }

    for (char in input) {
        freqArray[char.code - 'a'.code]++
    }

    var oddCount = 0
    for (count in freqArray) {
        if (count % 2 != 0) {
            oddCount++
        }
    }

    return oddCount <= 1
}

fun main() {
    println(canFormPalindrome("radar"))
    println(canFormPalindrome("radii"))
}