package string_programs

// Based on hash set
fun hasUniqueCharacter(str: String): Boolean {
    return str.toSet().size == str.length
}

// ASCII boolean array
fun hasUniqueCharacter1(str: String): Boolean {
    val arr = BooleanArray(256) { false }
    for (char in str) {
        if (arr[char.code]) {
            return false
        }
        arr[char.code] = true
    }
    return true
}

// Sort characters in string and check
fun hasUniqueCharacter2(str: String): Boolean {
    val sorted = str.toCharArray().sorted()
    for (i in 0..<sorted.size - 1) {
        if (sorted[i] == sorted[i + 1]) return false
    }
    return true
}

fun main() {
    println(hasUniqueCharacter("Book"))
    println(hasUniqueCharacter("Denmark"))

    println(hasUniqueCharacter1("Book"))
    println(hasUniqueCharacter1("Denmark"))

    println(hasUniqueCharacter2("Book"))
    println(hasUniqueCharacter2("Denmark"))
}