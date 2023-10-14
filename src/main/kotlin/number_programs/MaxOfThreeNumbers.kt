package number_programs

fun maxOfThreeNumbers(a: Int, b: Int, c: Int): Int {
    return if (a > b && a > c) a
    else if (b > a && b > c) b
    else c
}

fun main() {
    println(maxOfThreeNumbers(1, 8, 6))
}