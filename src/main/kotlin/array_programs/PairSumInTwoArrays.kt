package array_programs

fun findPairSumInTwoArrays(arr1: IntArray, arr2: IntArray, target: Int): List<Pair<Int, Int>> {
    val result = mutableListOf<Pair<Int, Int>>()
    val set1 = HashSet<Int>()
    for (num in arr1) {
        set1.add(num)
    }

    for (num in arr2) {
        val complement = target - num
        if (set1.contains(complement)) {
            result.add(Pair(complement, num))
        }
    }

    return result
}

fun main() {
    val result = findPairSumInTwoArrays(intArrayOf(2, 3, 4, 6), intArrayOf(4, 6, 8, 2), 8)
    result.forEach { println(it) }
}