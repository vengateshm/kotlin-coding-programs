package sorting

fun sortAscending(arr: IntArray): IntArray {
    for (i in arr.indices) {
        for (j in i + 1..<arr.size) {
            if (arr[i] > arr[j]) swap(arr, i, j)
        }
    }
    return arr
}

fun sortDescending(arr: IntArray): IntArray {
    for (i in arr.indices) {
        for (j in i + 1..<arr.size) {
            if (arr[i] < arr[j]) swap(arr, i, j)
        }
    }
    return arr
}

fun swap(arr: IntArray, p1: Int, p2: Int) {
    val temp = arr[p1]
    arr[p1] = arr[p2]
    arr[p2] = temp
}

fun main() {
    println(sortAscending(intArrayOf(5, 4, 3, 2, 1)).contentToString())
    println(sortDescending(intArrayOf(1, 2, 3, 4, 5)).contentToString())
}