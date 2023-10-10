package string_pattern_programs

fun rightTrianglePattern(str: String) {
    var k = str.length - 1
    for (i in str.indices) {
        for (space in 0..<k)
            print(" ")
        for (j in 0..i)
            print(str[j])
        k--
        println()
    }
}

fun main() {
    rightTrianglePattern("BLOOM")
    rightTrianglePattern("BLOOMS")
}