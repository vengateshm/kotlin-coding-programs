package search

fun binarySearch(arr: IntArray, target: Int): Boolean {
    arr.sort()
    var s = 0
    var e = arr.size - 1
    while (s <= e) {
        val mid = s + (e - s) / 2
        when {
            arr[mid] == target -> return true
            arr[mid] < target -> s = mid + 1
            arr[mid] > target -> e = mid - 1
        }
    }
    return false
}

fun main() {
    println(binarySearch(intArrayOf(1, 2, 4, 10, 8), 10))
}