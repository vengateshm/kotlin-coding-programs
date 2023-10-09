package array_programs

fun shiftZeroesToRightTwoLoops(arr: IntArray): IntArray {
    var k = 0
    for (num in arr) {
        if (num != 0) {
            arr[k++] = num
        }
    }

    for (i in k..<arr.size) {
        arr[i] = 0
    }

    return arr
}

fun main() {
    println(shiftZeroesToRightTwoLoops(intArrayOf(0, 0, 3, 1, 0, 0, 4)).contentToString())
}