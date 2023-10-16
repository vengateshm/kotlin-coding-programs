package array_programs

fun findLargestAndSmallest(arr: IntArray): Pair<Int, Int> {
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    for (num in arr) {
        if (num > max) {
            max = num
        }
        if (num < min) {
            min = num
        }
    }
    return Pair(min, max)
}

fun main() {
    println(findLargestAndSmallest(intArrayOf(1, 0, 2, 3)))
}