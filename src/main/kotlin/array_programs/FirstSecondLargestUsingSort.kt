package array_programs

fun firstSecondLargestUsingSort(arr: IntArray) {
    if (arr.size < 2) {
        println("Array must contain at least two elements")
        return
    }
    arr.sort()
    println("First largest ${arr[arr.size - 1]}")
    println("Second largest ${arr[arr.size - 2]}")
}

fun main() {
    firstSecondLargestUsingSort(intArrayOf(1, 5, 3, 2, 4))
}