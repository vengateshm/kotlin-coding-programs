package array_programs

fun findMostFrequentElement(arr: IntArray): Int {
    val max = arr.max()
    val countArr = IntArray(max) { 0 }
    var maxFreq = -1
    for (num in arr) {
        countArr[num - 1]++
        if (countArr[num - 1] > maxFreq) {
            maxFreq = num
        }
    }
    println(countArr.contentToString())
    return maxFreq
}

fun main() {
    println(findMostFrequentElement(intArrayOf(1, 3, 3, 10, 4, 4, 4, 4)))
}