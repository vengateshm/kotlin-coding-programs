package string_programs

fun countSubStringOccurrences(str: String, target: String): Int {
    var count = 0
    for (i in 0..<str.length - target.length + 1) {
        if (target == str.substring(i, i + target.length)) {//Shift indexes by i
            count++
        }
    }

    return count
}

fun main() {
    println(countSubStringOccurrences("Hello, Hello, World!", "Hello"))
}