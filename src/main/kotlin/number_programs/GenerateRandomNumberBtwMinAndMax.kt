package number_programs

fun generateRandomNumberBtwMinAndMax(max: Int, min: Int): Int {
    // Ex:
    // max = 9999, min = 1000
    // range = 9999-1000 = 8999 + 1 = 9000 elements
    // + min to shift
    return (Math.random() * (max - min + 1) + min).toInt()
}

fun main() {
    println(generateRandomNumberBtwMinAndMax(9999, 1000))
}