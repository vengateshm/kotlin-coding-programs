package array_programs

fun reverseIntArrayWithExtraArray(arr:IntArray):IntArray{
    val output = IntArray(arr.size){0}
    for (i in arr.indices){
        output[i] = arr[arr.size - i - 1]
    }
    return output
}

fun main(){
    println(reverseIntArrayWithExtraArray(intArrayOf(1,2,3,4,5,)).contentToString())
}