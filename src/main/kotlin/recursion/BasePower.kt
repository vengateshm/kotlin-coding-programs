package recursion

fun basePower(base: Int, power: Int): Int {
    if (power <= 0) return 1
    return base * basePower(base, power - 1)
}

fun main() {
    println(basePower(2, 3))
}