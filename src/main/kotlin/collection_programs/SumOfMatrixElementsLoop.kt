package collection_programs

fun sumOfMatrixElementsLoop(matrix: List<List<Int>>): Int {
    var sum = 0
    for (row in matrix) {
        for (col in row) {
            sum += col
        }
    }
    return sum
}

fun main() {
    val matrix = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )
    println(sumOfMatrixElementsLoop(matrix))
}