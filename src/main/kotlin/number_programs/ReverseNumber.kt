package number_programs

fun reverseNumber(num: Int): Int {
    var n = num
    var rev = 0
    while (n != 0) {
        val rem = n % 10
        rev = rev * 10 + rem
        n /= 10
    }
    return rev
}

fun reverseNumberRecursive(num: Int):Int {
    return rev(0, num)
}

fun rev(rev: Int, num: Int): Int {
    if (num == 0) return rev
    val rem = num % 10
    val reversed = rev * 10 + rem
    return rev(reversed, num / 10)
}

fun main() {
    println(reverseNumber(123))
    println(reverseNumberRecursive(123))
}