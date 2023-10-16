package array_programs

fun removeDuplicatesInSortedArray(arr: IntArray): Int {
    if (arr.isEmpty()) return 0
    var uniqueIndex = 0
    for (i in 1..<arr.size) {
        if (arr[i] != arr[uniqueIndex]) {
            ++uniqueIndex
            arr[uniqueIndex] = arr[i]
        }
    }
    return uniqueIndex
}

fun main() {
    val arr = intArrayOf(1, 2, 2, 3, 3, 4, 5)
    val result = removeDuplicatesInSortedArray(arr)
    println(arr.copyOfRange(0, result + 1).contentToString())
}