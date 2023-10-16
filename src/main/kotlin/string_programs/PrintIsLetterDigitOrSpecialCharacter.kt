package string_programs

fun printIsLetterDigitOrSpecialCharacter(c: Char) {
    when {
        c.isDigit() -> println("Is a digit")
        c.isLetter() -> println("Is a letter")
        else -> println("Is a special character")
    }
}

fun main() {
    printIsLetterDigitOrSpecialCharacter('1')
    printIsLetterDigitOrSpecialCharacter('a')
    printIsLetterDigitOrSpecialCharacter('^')
}