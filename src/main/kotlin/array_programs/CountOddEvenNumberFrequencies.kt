package array_programs

fun countOddEvenNumberFrequencies(arr: IntArray) {
    var oddCount = 0
    var evenCount = 0
    for (num in arr) {
        if (num % 2 == 0) {
            evenCount++
        } else {
            oddCount++
        }
    }
    println(oddCount)
    println(evenCount)
}

fun countOddEvenNumberFrequencies1(arr: IntArray) {
    println(arr.count { it % 2 != 0 })
    println(arr.count { it % 2 == 0 })
}

fun main() {
    countOddEvenNumberFrequencies(intArrayOf(1, 2, 3, 4, 5, 6))
    countOddEvenNumberFrequencies1(intArrayOf(1, 2, 3, 4, 5, 6))
}