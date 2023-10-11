package collection_programs

fun main() {
    (1..3).flatMap { i ->
        (1..3).map { j ->
            println(i * j)
        }
    }
}