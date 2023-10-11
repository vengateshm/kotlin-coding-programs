package array_programs

fun rotateArrayByReverse(arr: IntArray, rotations: Int): IntArray {
    val k = rotations % arr.size
    reverseArr(arr, 0, arr.lastIndex)
    reverseArr(arr, 0, k - 1)
    reverseArr(arr, k, arr.lastIndex)
    return arr
}

fun reverseArr(arr: IntArray, p1: Int, p2: Int) {
    var start = p1
    var end = p2
    while (start < end) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start++
        end--
    }
}

fun main() {
    println(rotateArray(intArrayOf(1, 2, 3, 4, 5), 17).contentToString())
}