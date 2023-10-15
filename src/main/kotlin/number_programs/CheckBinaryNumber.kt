package number_programs

fun checkBinaryNumber(num: Long): Boolean {
    var n = num
    while (n != 0L) {
        if (n % 10 > 1) return false
        n /= 10
    }
    return true
}

fun main() {
    println(checkBinaryNumber(1010L))
    println(checkBinaryNumber(11212L))
}