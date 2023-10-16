package string_programs

fun countWords(str: String): Int {
    return str.split("\\s+".toRegex()).size
}

// Count words based on flag and whitespace character
fun countWords1(str: String): Int {
    var count = 1
    for (char in str) {
        if (char == ' ') {
            count++
        }
    }
    return count
}

fun countWords2(str: String): Int {
    var count = 0
    var inWord = false
    for (char in str) {
        if (char.isWhitespace()) {
            inWord = false
        } else if (!inWord) {
            count++
            inWord = true
        }
    }
    return count
}

fun main() {
    println(countWords("ICC Cricket World Cup"))
    println(countWords1("ICC Cricket World Cup"))
    println(countWords2("ICC Cricket World Cup"))
}