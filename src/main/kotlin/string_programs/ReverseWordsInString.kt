package string_programs

fun reverseWordsInString(str: String): String {
    val words = str.split("\\s+".toRegex())
    val sb = StringBuilder()
    for (word in words) {
        sb.append(reverse(word))
        sb.append(" ")
    }
    return sb.toString().trim()
}

fun reverse(str: String): String {
    val sb = StringBuilder()
    for (i in str.lastIndex downTo 0) {
        sb.append(str[i])
    }
    return sb.toString()
}

fun main() {
    println(reverseWordsInString("Hello Jetpack Compose"))
}