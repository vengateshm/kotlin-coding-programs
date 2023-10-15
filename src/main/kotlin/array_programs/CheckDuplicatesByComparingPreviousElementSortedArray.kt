package array_programs

fun checkDuplicatesByComparingPreviousElementSortedArray(arr: IntArray): Boolean {
    if (arr.size == 1) return false
    for (i in 1..<arr.size) {
        if (arr[i] == arr[i - 1]) return true
    }
    return false
}

fun main() {
    println(checkDuplicatesByComparingPreviousElementSortedArray(intArrayOf(2, 2, 3, 4, 5, 6)))
    println(checkDuplicatesByComparingPreviousElementSortedArray(intArrayOf(2, 3, 4, 5, 6)))
}