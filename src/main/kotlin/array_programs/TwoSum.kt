package array_programs

fun twoSum(arr: IntArray, target: Int): Pair<Int, Int>? {
    val complementSet = HashSet<Int>()

    for (num in arr) {
        val complement = target - num
        if (complement in complementSet) {
            return Pair(complement, num)
        }
        complementSet.add(num)
    }

    return null
}

// Using map
fun twoSum1(arr: IntArray, target: Int): Pair<Int, Int>? {
    val map = HashMap<Int, Int>()

    for (i in arr.indices) {
        val complement = target - arr[i]
        if (map.containsKey(complement)) {
            return Pair(complement, arr[i])
        }
    }

    return null
}

fun main() {
    val result = twoSum(intArrayOf(1, 5, 8, 3), 9)
    println("${result?.first}, ${result?.second}")
    val result1 = twoSum(intArrayOf(1, 5, 8, 3), 9)
    println("${result1?.first}, ${result1?.second}")
}