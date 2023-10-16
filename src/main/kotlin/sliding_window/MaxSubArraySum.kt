package sliding_window

fun maxSubArraySum(arr: IntArray, windowSize: Int): Int {
    var maxSum = 0
    var sum = 0
    var windowStart = 0
    for (windowEnd in arr.indices) {
        sum += arr[windowEnd]
        if (windowEnd >= windowSize - 1) {
            maxSum = maxOf(maxSum, sum)
            sum -= arr[windowStart]
            windowStart++
        }
    }
    return maxSum
}

fun main() {
    val arr = intArrayOf(2, 1, 5, 1, 3, 2)
    val windowSize = 3
    println(maxSubArraySum(arr, windowSize))
}