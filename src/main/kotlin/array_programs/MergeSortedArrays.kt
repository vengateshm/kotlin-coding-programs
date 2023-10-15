package array_programs

fun mergeSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    val outArr = IntArray(arr1.size + arr2.size)
    var i = 0
    var j = 0
    var k = 0
    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] < arr2[j]) {
            outArr[k++] = arr1[i++]
        } else {
            outArr[k++] = arr2[j++]
        }
    }

    // If unequal size arrays then append at last
    while (i < arr1.size) {
        outArr[k++] = arr1[i++]
    }
    while (j < arr2.size) {
        outArr[k++] = arr2[j++]
    }
    return outArr
}

fun main() {
    println(mergeSortedArrays(intArrayOf(1, 2, 3, 5, 6), intArrayOf(4, 7, 8)).contentToString())
    println(mergeSortedArrays(intArrayOf(1, 2, 3, 5, 6), intArrayOf(4, 7, 8, 9, 10)).contentToString())
}