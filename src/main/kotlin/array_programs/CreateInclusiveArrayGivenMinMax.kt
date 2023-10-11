package array_programs

fun createInclusiveArrayGivenMinMax(min: Int, max: Int): IntArray {
    val totElements = max - min + 1
    return IntArray(totElements) { i -> min + i }
}

fun main() {
    println(createInclusiveArrayGivenMinMax(1, 7).contentToString())
}