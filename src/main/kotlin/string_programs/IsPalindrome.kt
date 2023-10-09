package string_programs

/**
 * Approach
 * Check characters from both ends and they must be same
 * */
fun isPalindrome(input: String): Boolean {
    for (i in input.indices) {
        if (input[i] != input[input.length - i - 1]) {
            return false
        }
    }
    return true
}

fun main() {
    println(isPalindrome("radar"))
    println(isPalindrome("rack"))
}