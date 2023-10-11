package string_programs

fun maxOccurringCharInStringUsingOneLoop(str: String): Char? {
    if (str.isBlank()) return null
    if (str.length == 1) return str.first()
    var maxOccurringChar: Char? = null
    var count = 0
    var maxCount = 0
    for (i in 1..<str.length) {
        if (str[i] == str[i - 1]) {
            count++
            if (count > maxCount) {
                maxCount = count
                maxOccurringChar = str[i]
            }
        } else {
            count = 1
        }
    }
    return maxOccurringChar
}

fun maxOccurringCharInStringUsingOneLoop1(str: String): Char? {
    if (str.isBlank()) return null
    if (str.length == 1) return str.first()
    var prevChar: Char? = null
    var maxOccurringChar: Char? = null
    var count = 0
    var maxCount = 0
    for (curChar in str) {
        if (curChar == prevChar) {
            count++
            if (count > maxCount) {
                maxCount = count
                maxOccurringChar = curChar
            }
        } else {
            count = 1
        }
        prevChar = curChar
    }
    return maxOccurringChar
}

fun main() {
    println(maxOccurringCharInStringUsingOneLoop("l"))
    println(maxOccurringCharInStringUsingOneLoop("ll"))
    println(maxOccurringCharInStringUsingOneLoop("rook"))
    println(maxOccurringCharInStringUsingOneLoop("rookkk"))
    println(maxOccurringCharInStringUsingOneLoop1("l"))
    println(maxOccurringCharInStringUsingOneLoop1("ll"))
    println(maxOccurringCharInStringUsingOneLoop1("rookkk"))
}