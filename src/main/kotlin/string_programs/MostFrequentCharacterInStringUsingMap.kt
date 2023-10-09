package string_programs

fun findMostFrequentCharacterInStringUsingMap(str: String): Char? {
    val freqMap = LinkedHashMap<Char, Int>()

    var maxFreq = 0
    var maxFreqChar: Char? = null
    for (char in str) {
        freqMap[char] = freqMap.getOrDefault(char, 0) + 1
        if (freqMap[char]!! > maxFreq) {
            maxFreq = freqMap[char]!!
            maxFreqChar = char
        }
    }
    return maxFreqChar
}

fun main() {
    println(findMostFrequentCharacterInStringUsingMap("leetcode"))
}