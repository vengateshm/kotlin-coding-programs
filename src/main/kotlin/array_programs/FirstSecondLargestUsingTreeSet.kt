package array_programs

import java.util.TreeSet

fun firstSecondLargestUsingTreeSet(arr: IntArray) {
    val treeSet = TreeSet<Int>()
    for (num in arr) {
        treeSet.add(num)
        if (treeSet.size > 2) {
            treeSet.pollFirst()
        }
    }
    println("First largest ${treeSet.pollLast()}")
    println("Second largest ${treeSet.pollLast()}")
}

fun main() {
    firstSecondLargestUsingTreeSet(intArrayOf(1, 5, 3, 2, 4))
}