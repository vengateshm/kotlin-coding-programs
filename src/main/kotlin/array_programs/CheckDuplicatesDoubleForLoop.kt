package array_programs

fun checkDuplicatesDoubleForLoop(arr: IntArray): Boolean {
    for (i in arr.indices) {
        for (j in arr.indices) { //for (j in i+1..<arr.size)
            if (i != j && arr[i] == arr[j]) return true
        }
    }
    return false
}

fun main() {
    println(checkDuplicatesDoubleForLoop(intArrayOf(2, 3, 4, 5, 6, 2)))
    println(checkDuplicatesDoubleForLoop(intArrayOf(2, 3, 4, 5, 6)))
}