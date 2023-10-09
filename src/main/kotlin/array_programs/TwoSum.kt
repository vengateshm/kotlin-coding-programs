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

fun main() {
    val result = twoSum(intArrayOf(1, 5, 8, 3), 9)
    println("${result?.first}, ${result?.second}")
}