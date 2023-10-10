package string_pattern_programs

fun leftTrianglePattern(str: String) {
    for (i in str.indices) {
        for (j in 0..i) {
            print(str[j])
        }
        println()
    }
}

fun main() {
    leftTrianglePattern("BLOOM")
}