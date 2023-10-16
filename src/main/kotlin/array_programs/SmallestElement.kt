package array_programs

fun findSmallest(arr: IntArray): Int {
    var min = Int.MAX_VALUE
    for (num in arr) {
        if (num < min) {
            min = num
        }
    }
    return min
}

fun main() {
    println(findSmallest(intArrayOf(1, 0, 2, 3)))
}