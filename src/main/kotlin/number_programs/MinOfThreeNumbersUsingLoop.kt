package number_programs

fun main() {
    var a = 11
    var b = 8
    var c = 3

    var count = 0
    while (a != 0 && b != 0 && c != 0) {
        count++
        a--
        b--
        c--
    }

    println(count)
}