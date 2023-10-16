package string_programs

fun main() {
    var s1 = "Hello"
    var s2 = "Kotlin"

    s1 += s2
    s2 = s1.substring(0, s1.length - s2.length)
    s1 = s1.substring(s2.length)
    println(s1)
    println(s2)
}