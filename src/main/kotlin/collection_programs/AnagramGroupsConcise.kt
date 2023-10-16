package collection_programs

fun groupAnagrams(arr: Array<String>): Map<String, List<String>> {
    val result = HashMap<String, MutableList<String>>()
    for (str in arr) {
        val sorted = str.toCharArray().sorted().joinToString("")
        result.computeIfAbsent(sorted) { mutableListOf() }.add(str)
    }
    return result
}

fun main() {
    println(groupAnagrams(arrayOf("listen", "silent", "brainy", "binary", "book")))
}