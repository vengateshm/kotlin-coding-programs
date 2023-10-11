package array_programs

fun findPalindromeGroups(strs: Array<String>): Map<Boolean, List<String>> {
    val map = HashMap<Boolean,MutableList<String>>()
    for (str in strs){
        val isPalindrome = isPalindrome(str)
        map[isPalindrome] = map.getOrDefault(isPalindrome, mutableListOf()).apply {
            add(str)
        }
    }

    return map
}

fun isPalindrome(str: String): Boolean {
    for (i in 0..str.length / 2) {
        if (str[i] != str[str.length - 1 - i]) {
            return false
        }
    }
    return true
}

fun main() {
    val result = findPalindromeGroups(arrayOf("radar", "racecar", "door"))
    result.forEach { entry ->
        println(entry.value)
    }
}
