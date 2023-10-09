package array_programs

fun shiftZeroesToRight(arr: IntArray): IntArray {
    var nonZerIndex = 0
    for (i in arr.indices) {
        if (arr[i] != 0) {
            val temp = arr[i]
            arr[i] = arr[nonZerIndex]
            arr[nonZerIndex] = temp
            nonZerIndex++
        }
    }
    return arr
}

fun main() {
    println(shiftZeroesToRight(intArrayOf(0, 0, 3, 1, 0, 0, 4)).contentToString())
}