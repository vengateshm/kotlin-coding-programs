package array_programs

fun groupPalindrome(arr: Array<String>): Map<Boolean, List<String>> {
    return arr.groupBy { isPalindrome1(it) }
}

fun isPalindrome1(str: String): Boolean {
    val cleanedStr = str.replace("[^a-zA-Z0-9]", "").lowercase()
    return cleanedStr == cleanedStr.reversed()
}

fun main() {
    println(groupPalindrome(arrayOf("radar", "racecar", "gun")))
}