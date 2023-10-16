package string_programs

fun main() {
    isVowelOrConsonant('e')
    isVowelOrConsonant('h')
}

private fun isVowelOrConsonant(c: Char) {
    when (c) {
        'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> println("Is a vowel")
        else -> println("Is a consonant")
    }
}