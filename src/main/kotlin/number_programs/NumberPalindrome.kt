package number_programs

fun isNumberPalindrome(num: Int): Boolean {
    var n = num
    var revNum = 0
    while (n != 0) {
        val rem = n % 10
        revNum = revNum * 10 + rem
        n /= 10
    }
    return revNum == num
}

fun main() {
    println(isNumberPalindrome(121))
    println(isNumberPalindrome(12))
}