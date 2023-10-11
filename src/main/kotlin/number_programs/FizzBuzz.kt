package number_programs

fun fizzBuzz(n: Int) {
    for (i in 1..n) {
        val isDivisibleByThree = i % 3 == 0
        val isDivisibleByFive = i % 5 == 0
        when {
            isDivisibleByThree && isDivisibleByFive -> println("FizzBuzz")
            isDivisibleByThree -> println("Fizz")
            isDivisibleByFive -> println("Buzz")
        }
    }
}

fun main() {
    fizzBuzz(100)
}