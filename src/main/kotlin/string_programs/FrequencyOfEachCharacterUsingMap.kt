package string_programs

fun frequencyOfEachCharacterUsingMap(str: String): Map<Char, Int> {
    val freqMap = LinkedHashMap<Char, Int>()

    for (char in str) {
        freqMap[char] = freqMap.getOrDefault(char, 0) + 1
    }
    return freqMap
}

fun main() {
    println(frequencyOfEachCharacterUsingMap("radar"))
}