package string_programs

// HashMap
fun firstNonRepeatingCharacter(str: String): Char? {
    val map = LinkedHashMap<Char, Int>()
    for (char in str) {
        map[char] = map.getOrDefault(char, 0) + 1
    }
    for ((char, count) in map) {
        if (count == 1) {
            return char
        }
    }
    return null
}

// HashMap concise
fun firstNonRepeatingCharacter1(str: String): Char? {
    val map = LinkedHashMap<Char, Int>()
    for (char in str) {
        map[char] = map.getOrDefault(char, 0) + 1
    }

    return map.entries.firstOrNull { it.value == 1 }?.key
}

// HashMap more concise
fun firstNonRepeatingCharacter2(str: String): Char? {
    return str.groupingBy { it }.eachCount().entries.firstOrNull { it.value == 1 }?.key
}

fun main() {
    println(firstNonRepeatingCharacter("oogloom"))
    println(firstNonRepeatingCharacter1("gloom"))
    println(firstNonRepeatingCharacter2("gloom"))
}