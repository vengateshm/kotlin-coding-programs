package collection_programs

data class Employee(val name: String, val age: Int, val salary: Double)

fun main() {
    val employees = listOf(
        Employee("Alice", 29, 5000.0),
        Employee("Bob", 25, 6000.0),
        Employee("Charlie", 35, 5500.0),
        Employee("David", 25, 2000.0),
        Employee("Eva", 30, 5500.0)
    )

    val sortedEmployees = employees.sortedWith(compareBy<Employee> { it.age }.thenBy { it.salary })

    println("Original List of Employees:")
    employees.forEach { println("Age: ${it.age}, Salary: ${it.salary}, Name: ${it.name}") }

    println("\nSorted List of Employees by Age and Salary:")
    sortedEmployees.forEach { println("Age: ${it.age}, Salary: ${it.salary}, Name: ${it.name}") }
}