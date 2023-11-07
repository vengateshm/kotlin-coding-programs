package array_programs

fun findSecondSmallestAndLargest(array: IntArray) {
    if (array.size < 2) {
        println("Array should have at least 2 elements.")
        return
    }

    var firstLargest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE
    var firstSmallest = Int.MAX_VALUE
    var secondSmallest = Int.MAX_VALUE

    for (num in array) {
        if (num > firstLargest) {
            secondLargest = firstLargest
            firstLargest = num
        } else if (num > secondLargest && num != firstLargest) {
            secondLargest = num
        }

        if (num < firstSmallest) {
            secondSmallest = firstSmallest
            firstSmallest = num
        } else if (num < secondSmallest && num != firstSmallest) {
            secondSmallest = num
        }
    }

    if (secondSmallest == Int.MAX_VALUE || secondLargest == Int.MIN_VALUE) {
        println("No distinct second smallest or second largest element found.")
    } else {
        println("Second smallest element: $secondSmallest")
        println("Second largest element: $secondLargest")
    }
}

fun main() {
    val array = intArrayOf(12, 45, 1, 78, 23, 56, 89, 5)
    findSecondSmallestAndLargest(array)
}
