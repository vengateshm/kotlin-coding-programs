package array_programs

fun rotateArray(arr: IntArray, rotations: Int): IntArray {
    repeat(rotations) {
        val last = arr.last()
        for (i in arr.lastIndex downTo 1) {
            arr[i] = arr[i - 1]
        }
        arr[0] = last
    }
    return arr
}

fun main() {
    println(rotateArray(intArrayOf(1, 2, 3, 4, 5), 8).contentToString())
}