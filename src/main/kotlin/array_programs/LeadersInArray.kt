package array_programs

fun leadersInArray(arr: IntArray) {
    val lastElement = arr.last()
    println("Leaders in array")
    println(lastElement)

    var leader = lastElement
    for (i in arr.lastIndex - 1 downTo 0) {
        if (arr[i] > leader) {
            leader = arr[i]
            println(arr[i])
        }
    }
}

fun main() {
    leadersInArray(intArrayOf(16, 17, 1, 6, 5, 2))
}