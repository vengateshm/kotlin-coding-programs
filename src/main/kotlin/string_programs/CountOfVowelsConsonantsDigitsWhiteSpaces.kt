package string_programs

fun countOfVowelsConsonantsDigitsWhiteSpaces(str: String) {
    var vowelsCount = 0
    var consonantsCount = 0
    var digitsCount = 0
    var whiteSpacesCount = 0

    for (char in str.lowercase()) {
        when (char) {
            'a', 'e', 'i', 'o', 'u' -> vowelsCount++
            in 'a'..'z' -> consonantsCount++
            in '0'..'9' -> digitsCount++
            ' ' -> whiteSpacesCount++
        }
    }

    println(vowelsCount)
    println(consonantsCount)
    println(digitsCount)
    println(whiteSpacesCount)
}

fun countOfVowelsConsonantsDigitsWhiteSpaces1(str: String) {
    val lStr = str.lowercase()
    val vowelsCount = lStr.count { it in "aeiouAEIOU" }
    val consonantsCount = lStr.count { it in 'a'..'z' } - vowelsCount
    val digitsCount = lStr.count { it.isDigit() }
    val whiteSpacesCount = lStr.count { it.isWhitespace() }

    println(vowelsCount)
    println(consonantsCount)
    println(digitsCount)
    println(whiteSpacesCount)
}

fun main() {
    countOfVowelsConsonantsDigitsWhiteSpaces("Hi 12")
    countOfVowelsConsonantsDigitsWhiteSpaces1("Hi 12")
}