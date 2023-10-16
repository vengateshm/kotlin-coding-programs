package sliding_window

fun lengthOfLargestSubstringWithoutRepeatingCharacters(str: String): Int {
    val map = mutableMapOf<Char, Int>()

    var left = 0
    var maxLength = 0
    for (right in str.indices) {
        if (map.containsKey(str[right])) {
            left = maxOf(left, map[str[right]]!! + 1)
        }
        map[str[right]] = right
        maxLength = maxOf(maxLength, right - left + 1)
    }
    return maxLength
}

fun lengthOfLargestSubstringWithoutRepeatingCharactersFrequencyArray(str: String): Int {
    val charIndex = IntArray(256) { -1 }

    var left = 0
    var maxLength = 0
    for (right in str.indices) {
        if (charIndex[str[right].code] != -1) {
            left = maxOf(left, charIndex[str[right].code] + 1)
        }
        charIndex[str[right].code] = right
        maxLength = maxOf(maxLength, right - left + 1)
    }
    return maxLength
}

fun main() {
    println(lengthOfLargestSubstringWithoutRepeatingCharacters("abbacca"))
    println(lengthOfLargestSubstringWithoutRepeatingCharactersFrequencyArray("abbacca"))
}