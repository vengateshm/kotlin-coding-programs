package array_programs

fun productExceptItself(arr: IntArray): IntArray {
    val result = IntArray(arr.size)
    for (i in arr.indices) {
        result[i] = 1
        for (j in arr.indices) {
            if (i != j) {
                result[i] *= arr[j]
            }
        }
    }
    return result
}

fun productExceptItself1(arr: IntArray): IntArray {
    val result = IntArray(arr.size)
    var i = 0
    while (i < arr.size) {
        var j = 0
        var prod = 1
        while (j < arr.size) {
            if (i != j) {
                prod *= arr[j]
            }
            j++
        }
        result[i] = prod
        i++
    }
    return result
}

fun productExceptItself2(arr: IntArray): IntArray {
    val result = IntArray(arr.size) { 1 }
    var leftProduct = 1
    for (i in arr.indices) {
        result[i] = leftProduct
        leftProduct *= arr[i]
    }

    var rightProduct = 1
    for (i in arr.size - 1 downTo 0) {
        result[i] *= rightProduct
        rightProduct *= arr[i]
    }
    return result
}

fun main() {
    println(productExceptItself(intArrayOf(1, 2, 3, 4, 5)).contentToString())
    println(productExceptItself1(intArrayOf(1, 2, 3, 4, 5)).contentToString())
    println(productExceptItself2(intArrayOf(1, 2, 3, 4, 5)).contentToString())
}