package array_programs

fun pairSumInTwoArraysSortApproach(arr1: IntArray, arr2: IntArray, target: Int): List<Pair<Int, Int>> {
    arr1.sort()
    arr2.sort()

    var i = 0
    var j = arr2.size - 1

    val result = mutableListOf<Pair<Int, Int>>()

    while (i < arr1.size && j >= 0) {
        val sum = arr1[i] + arr2[j]
        when {
            sum == target -> {
                result.add(Pair(arr1[i++], arr2[j--]))
            }

            sum < target -> i++
            else -> j--
        }
    }

    return result
}

fun main() {
    pairSumInTwoArraysSortApproach(intArrayOf(8, 5, 3, 2, 1), intArrayOf(7, 6, 4), 10).forEach(::println)
}