package array_programs

fun findMissingNumberInArrayOf1ToN(arr: IntArray): Int {
    val sum = arr.sum()
    val max = arr.max()
    val sumOfN = max * (max + 1) / 2
    return sumOfN - sum
}

fun main() {
    println(findMissingNumberInArrayOf1ToN(intArrayOf(1, 2, 3, 4, 5, 7)))
}