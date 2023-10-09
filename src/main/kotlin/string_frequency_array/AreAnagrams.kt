package string_frequency_array

fun areAnagrams(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false
    val freqArr = IntArray(26) { 0 }

    for (i in str1.indices) {
        freqArr[str1[i].code - 'a'.code]++
        freqArr[str2[i].code - 'a'.code]--
    }

    for (count in freqArr) {
        if (count != 0)
            return false
    }
    return true
}

fun main() {
    println(areAnagrams("listen", "silent"))
    println(areAnagrams("brain", "grain"))
}