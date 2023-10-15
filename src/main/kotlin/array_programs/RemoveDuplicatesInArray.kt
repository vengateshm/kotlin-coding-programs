package array_programs

fun main() {
    val arr = arrayOf(1, 2, 2, 3, 4, 4, 5)
    println(arr.contentToString())

    println(arr.distinct().toTypedArray().contentToString())

    println(arr.toSet().toTypedArray().contentToString())

    println(HashSet<Int>(arr.toList()).toTypedArray().contentToString())

    println(arr.toMutableList().distinct().toTypedArray().contentToString())

    val distinctList = mutableListOf<Int>()
    for (num in arr) {
        if (!distinctList.contains(num)) {
            distinctList.add(num)
        }
    }
    println(distinctList.toTypedArray().contentToString())
}