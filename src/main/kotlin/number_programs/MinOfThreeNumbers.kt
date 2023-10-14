package number_programs

fun minOfThreeNumbers(a: Int, b: Int, c: Int): Int {
    return if (a <= b && a <= c) a
    else if (b <= a && b <= c) b
    else c
}

fun main() {
    println(minOfThreeNumbers(2, 2, 1))
}