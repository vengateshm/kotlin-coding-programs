package number_programs

fun factorsOfANumber(num: Int) {
    for (i in 1..num) {
        if (num % i == 0) {
            println(i)
        }
    }
}

fun main() {
    factorsOfANumber(10)
}