package collection_programs

fun main() {
    // Factorial
    val n = 5
    val factorial = (1..n).reduce { a, b -> a * b }
    println(factorial)

    // Sum
    val sum = (1..n).reduce { acc, i -> acc + i }
    println(sum)

    // Largest
    val numbers = listOf(12, 45, 67, 23, 9, 56)
    val largest = numbers.reduce { acc, i -> if (acc > i) acc else i }
    println(largest)

    // Smallest
    val smallest = numbers.reduce { acc, i -> if (acc < i) acc else i }
    println(smallest)

    // Concatenate words
    val words = listOf("Hello", " ", "World", "!")
    val concatenated = words.reduce { acc, s -> acc + s }
    println(concatenated)

    // Word with the largest length
    val fruits = listOf("apple", "banana", "cherry", "papaya", "date", "fig")
    val largestLengthFruit = fruits.reduce { acc, s -> if (acc.length > s.length) acc else s }
    println(largestLengthFruit)

    // Word with the smallest length
    val shortestLengthFruit = fruits.reduce { acc, s -> if (acc.length < s.length) acc else s }
    println(shortestLengthFruit)
}