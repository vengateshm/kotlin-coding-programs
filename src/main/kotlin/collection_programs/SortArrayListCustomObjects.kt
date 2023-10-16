package collection_programs

data class Employee(val name: String, val age: Int, val salary: Double)

fun main() {
    val employees = listOf(
        Employee("Alice", 30, 50000.0),
        Employee("Bob", 25, 60000.0),
        Employee("Charlie", 35, 55000.0),
        Employee("David", 25, 20000.0),
        Employee("Eva", 30, 55000.0)
    )

    // Sort the list of employees first by age in ascending order,
    // and then by salary in ascending order (secondary sort).
    val sortedEmployees = employees.sortedWith(compareBy<Employee> { it.age }.thenBy { it.salary })

    println("Original List of Employees:")
    employees.forEach { println("Name: ${it.name}, Age: ${it.age}, Salary: ${it.salary}") }

    println("\nSorted List of Employees by Age and Salary:")
    sortedEmployees.forEach { println("Name: ${it.name}, Age: ${it.age}, Salary: ${it.salary}") }
}