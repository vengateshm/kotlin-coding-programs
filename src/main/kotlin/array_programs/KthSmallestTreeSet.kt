package array_programs

import java.util.*

fun kthSmallestTreeSet(arr: IntArray, k: Int): Int {
    val set1 = TreeSet<Int>()

    for (num in arr) {
        set1.add(num)
    }

    var count = 0
    for (num in set1) {
        count++
        if (count == k) {
            return num
        }
    }
    return -1
}

fun main() {
    println(kthSmallestTreeSet(intArrayOf(1, 3, 2, 4, 5, 6), 2))
}