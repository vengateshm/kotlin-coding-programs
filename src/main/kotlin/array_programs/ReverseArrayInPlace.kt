package array_programs

fun reverse(input: IntArray): IntArray {
    if (input.size <= 1) return input
    if (input.size == 2) {
        swap(input, 0, 1)
        return input
    }
    var start = 0
    var end = input.size - 1
    while (start < end) {
        swap(input, start, end)
        start++
        end--
    }
    return input
}

fun swap(arr: IntArray, pos1: Int, pos2: Int) {
    val temp = arr[pos1]
    arr[pos1] = arr[pos2]
    arr[pos2] = temp
}

fun main() {
    println(reverse(intArrayOf()).contentToString())
    println(reverse(intArrayOf(1)).contentToString())
    println(reverse(intArrayOf(1, 2)).contentToString())
    println(reverse(intArrayOf(1, 2, 3, 4, 5)).contentToString())
}