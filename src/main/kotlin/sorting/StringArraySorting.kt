package sorting

fun sortAscending(arr: Array<String>): Array<String> {
    for (i in arr.indices) {
        for (j in i + 1..<arr.size) {
//            if (arr[i].compareTo(arr[j]) > 0) {
            if (arr[i] > arr[j]) {
                swap(arr, i, j)
            }
        }
    }
    return arr
}

fun sortDescending(arr: Array<String>): Array<String> {
    for (i in arr.indices) {
        for (j in i + 1..<arr.size) {
//            if (arr[i].compareTo(arr[j]) < 0) {
            if (arr[i] < arr[j]) {
                swap(arr, i, j)
            }
        }
    }
    return arr
}

fun swap(arr: Array<String>, p1: Int, p2: Int) {
    val temp = arr[p1]
    arr[p1] = arr[p2]
    arr[p2] = temp
}

fun main() {
    println(sortAscending(arrayOf("Dragon Fruit", "Banana", "Apple")).contentToString())
    println(sortDescending(arrayOf("Apple", "Banana", "Dragon Fruit")).contentToString())
}
