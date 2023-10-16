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
        map[arr[i]] = arr[i]
    }

    return null
}

// Using sorted array approach
fun twoSum2(arr: IntArray, target: Int): Pair<Int, Int>? {
    arr.sort()
    val arrWithIndex = arr.withIndex().toList()
    val arrWithIndexSorted = arrWithIndex.sortedBy { it.value }
    var s = 0
    var e = arrWithIndexSorted.lastIndex
    while (s < e) {
        val sum = arrWithIndexSorted[s].value + arrWithIndexSorted[e].value
        if (sum == target) {
            return Pair(arrWithIndexSorted[s].value, arrWithIndexSorted[e].value)
        } else if (sum < target) {
            s++
        } else {
            e--
        }
    }

    return null
}

fun main() {
    val result = twoSum(intArrayOf(1, 5, 8, 3), 9)
    println("${result?.first}, ${result?.second}")
    val result1 = twoSum1(intArrayOf(1, 5, 8, 3), 9)
    println("${result1?.first}, ${result1?.second}")
    val result2 = twoSum2(intArrayOf(1, 5, 8, 3), 9)
    println("${result2?.first}, ${result2?.second}")
}