package string_programs

fun mostFreqOccurringCharacterConcise(str: String): Char? {
    return str.groupingBy { it }.eachCount().maxByOrNull { it.value }?.key
}

fun mostFreqOccurringCharacterConcise1(str: String): Char? {
    val countArr = IntArray(256) { 0 }
    str.forEach { countArr[it.code]++ }
    return countArr.withIndex().maxByOrNull { it.value }?.index?.toChar()
}

fun main() {
    println(mostFreqOccurringCharacterConcise("leetcode"))
    println(mostFreqOccurringCharacterConcise1("leetcode"))
}