package number_programs

fun factorialFor(num: Long): Long {
    var f = 1L
    for (i in 1..num) {
        f *= i
    }
    return f
}

fun factorialWhile(num: Long): Long {
    var f = 1L
    var i = 1
    while (i <= num) {
        f *= i
        i++
    }
    return f
}

fun factorialRecursive(num: Long): Long {
    if (num == 0L) return 1L
    return num * factorialRecursive(num - 1L)
}

fun main() {
    println(factorialFor(5))
    println(factorialWhile(5))
    println(factorialRecursive(5))
}