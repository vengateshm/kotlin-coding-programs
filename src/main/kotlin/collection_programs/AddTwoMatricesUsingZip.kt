package collection_programs

fun main() {
    val m1 = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9),
    )
    val m2 = listOf(
        listOf(9, 8, 7),
        listOf(6, 5, 4),
        listOf(3, 2, 1),
    )

    val result = m1.zip(m2) { r1, r2 ->
        r1.zip(r2) { c1, c2 ->
            c1 + c2
        }
    }

    result.forEach {
        println(it)
    }
}