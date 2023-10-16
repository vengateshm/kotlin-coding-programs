package string_frequency_array

import java.util.*

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

// Boolean array approach
fun areAnagrams1(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false
    val freqArr = BooleanArray(26) { false }

    for (char in str1) {
        freqArr[char - 'a'] = true
    }
    for (char in str2) {
        if (!freqArr[char - 'a']) return false
    }
    return true
}

// 2 IntArray array approach
fun areAnagrams2(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false
    val freqArr1 = IntArray(26) { 0 }
    val freqArr2 = IntArray(26) { 0 }

    for (char in str1) {
        freqArr1[char - 'a']++
    }
    for (char in str2) {
        freqArr2[char - 'a']++
    }
    return freqArr1.contentEquals(freqArr2)
}

// Char array sorted
fun areAnagrams3(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false
    val str1Arr = str1.toCharArray()
    val str2Arr = str2.toCharArray()

    Arrays.sort(str1Arr)
    Arrays.sort(str2Arr)

    val ss1 = String(str1Arr)
    val ss2 = String(str2Arr)
    return ss1 == ss2
}

// Char count map two loops
fun areAnagrams4(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false

    val m1 = mutableMapOf<Char, Int>()
    val m2 = mutableMapOf<Char, Int>()

    for (c in str1) {
        m1[c] = m1.getOrDefault(c, 0) + 1
    }

    for (c in str2) {
        m2[c] = m2.getOrDefault(c, 0) + 1
    }

    return m1 == m2
}

// Char count map one loop
fun areAnagrams5(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false

    val m1 = mutableMapOf<Char, Int>()
    val m2 = mutableMapOf<Char, Int>()

    for (i in str1.indices) {
        m1[str1[i]] = m1.getOrDefault(str1[i], 0) + 1
        m2[str2[i]] = m2.getOrDefault(str2[i], 0) + 1
    }

    return m1 == m2
}

fun main() {
    println(areAnagrams("listen", "silent"))
    println(areAnagrams("brain", "grain"))

    println(areAnagrams1("dog", "god"))
    println(areAnagrams1("brain", "grain"))

    println(areAnagrams2("dog", "god"))
    println(areAnagrams2("brain", "grain"))

    println(areAnagrams3("dog", "god"))
    println(areAnagrams3("brain", "grain"))

    println(areAnagrams4("dog", "god"))
    println(areAnagrams4("brain", "grain"))

    println(areAnagrams5("dog", "god"))
    println(areAnagrams5("brain", "grain"))
}