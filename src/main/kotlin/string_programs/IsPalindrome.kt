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

// Using reversed()
fun isPalindromeUsingReversed(str: String): Boolean {
    return str == str.reversed()
}

// Using while loop with two pointers
fun isPalindromeWhileLoopTwoPointers(str: String): Boolean {
    var s = 0
    var e = str.length - 1

    while (s < e) {
        if (str[s] != str[e]) return false
        s++
        e--
    }
    return true
}

// Using for loop with only length / 2 comparison
fun isPalindromeForLoopWithNby2Comparison(str: String): Boolean {
    var count = 0
    for (i in 0..<str.length / 2) {
        if (str[i] != str[str.length - 1 - i]) return false
        count++
    }
    println(count)
    return true
}

fun isPalindromeForLoopRevStringLastToFirstIndex(str: String): Boolean {
    var revStr = ""
    for (i in str.length - 1 downTo 0) {
        revStr += str[i]
    }
    return str == revStr
}

fun isPalindromeForLoopRevStringFirstToLastIndex(str: String): Boolean {
    val revStr = buildString {
        for (i in str.indices){
            append(str[str.length - 1 -i])
        }
    }
    return revStr == str
}

fun main() {
    println(isPalindrome("radar"))
    println(isPalindrome("rack"))

    println(isPalindromeUsingReversed("radar"))
    println(isPalindromeUsingReversed("rack"))

    println(isPalindromeWhileLoopTwoPointers("radar"))
    println(isPalindromeWhileLoopTwoPointers("rack"))

    println(isPalindromeForLoopWithNby2Comparison("radar"))
    println(isPalindromeForLoopWithNby2Comparison("roar"))

    println(isPalindromeForLoopRevStringLastToFirstIndex("radar"))
    println(isPalindromeForLoopRevStringLastToFirstIndex("roar"))

    println(isPalindromeForLoopRevStringFirstToLastIndex("radar"))
    println(isPalindromeForLoopRevStringFirstToLastIndex("roar"))
}