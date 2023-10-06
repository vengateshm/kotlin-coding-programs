package basic_programs

fun main() {
    var a = 10
    var b = 20

    println("Before swap")
    println("a $a")
    println("b $b")

    a += b
    b = a - b
    a -= b

    println("After swap")
    println("a $a")
    println("b $b")
}