package collection_programs

// Round Robin
fun main() {
    val fruits = arrayOf("Apple", "Banana", "Orange", "Pineapple", "Pomegranate")
    val totalBaskets = 3
    val basketsWithFruits = mutableListOf<MutableList<String>>()
    repeat(totalBaskets) {
        basketsWithFruits.add(mutableListOf())
    }

    var basketIndex = 0
    for (fruit in fruits) {
        basketsWithFruits[basketIndex].add(fruit)
        basketIndex += 1
        basketIndex %= totalBaskets
    }

    for (i in 0..<totalBaskets) {
        println("Basket ${i + 1} : ${basketsWithFruits[i]}")
    }
}