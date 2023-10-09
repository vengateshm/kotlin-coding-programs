package number_programs

fun findFirstSecondLargestNumber(arr: IntArray): Pair<Int, Int> {
    var firstLargest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (num in arr) {
        if (num > firstLargest) {
            secondLargest = firstLargest
            firstLargest = num
        } else if (secondLargest > num) {
            secondLargest = num
        }
    }

    return Pair(firstLargest, secondLargest)
}

fun main() {
    val result = findFirstSecondLargestNumber(intArrayOf(1, 4, 6, 7, 2, 8, 9))
    println("${result.first}, ${result.second}")
}