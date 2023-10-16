package array_programs

fun findLargest(arr: IntArray): Int {
    var max = Int.MIN_VALUE
    for (num in arr) {
        if (num > max) {
            max = num
        }
    }
    return max
}

fun main() {
    println(findLargest(intArrayOf(1, 0, 3, 2)))
}