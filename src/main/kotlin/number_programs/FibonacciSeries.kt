package number_programs

fun fibonacciOf(num: Int): Int {
    if (num <= 1) return num
    var n2 = 0
    var n1 = 1
    //0 0 0 1 2 3 4 5
    for (i in 2..num) {
        val current = n2 + n1
        n2 = n1
        n1 = current
    }
    return n1
}

fun fibonacciSeries(num: Int) {
    var n2 = 0
    var n1 = 1
    for (i in 1..num) {
        val current = n2 + n1
        println(current)
        n2 = n1
        n1 = current
    }
}

fun fibonacciRecursive(n: Int): Int {
    if (n <= 1) return n
    return fibonacciRecursive(n - 2) + fibonacciRecursive(n - 1)
}

fun main() {
    println(fibonacciOf(10))
    println(fibonacciRecursive(10))
    println(fibonacciSeries(10))
}