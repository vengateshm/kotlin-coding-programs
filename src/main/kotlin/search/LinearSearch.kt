package search

fun linearSearch(arr: IntArray, target: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == target) {
            return i
        }
    }
    return -1
}

fun main() {
    println(linearSearch(intArrayOf(1, 2, 3, 8, 4, 10), 4))
}