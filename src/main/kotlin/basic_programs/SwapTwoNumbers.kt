package basic_programs

fun main() {
    var a = 10
    var b = 20

    println("After swap")
    println("a $a")
    println("b $b")

    val temp = a
    a = b
    b = temp

    println("After swap")
    println("a $a")
    println("b $b")
}