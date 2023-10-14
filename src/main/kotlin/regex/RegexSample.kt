package regex

fun main() {
    // Regex to match any string starting with i
    val p1 = Regex("^i.*")
    // ^ starts with
    // .*0 or more
    println(p1.containsMatchIn("i"))
    println(p1.containsMatchIn("input"))

    // Regex to match "oo" in a string
    val p2 = Regex("oo")
    p2.find("non cooperations coordination")?.let { res ->
        println(res.value)
        println(res.range)
    }

    // Regex to match word pattern of length 5
    val p3 = Regex("He...")
    p3.findAll("Hello Helms").forEach { res ->
        println(res.value)
    }

    // replace() - replace all occurrences
    val p4 = Regex("Hi")
    println(p4.replace("Hi World! Hi", "Hello"))
    println(p4.replace("Howdy", "Okay"))

    // replaceFirst()
    val p5 = Regex("Hi")
    println(p5.replaceFirst("Hi World! Hi", "Hello"))
    println(p5.replaceFirst("Howdy", "Okay"))

    // split()
    // white space
    // \\s - one space
    // \\s+ - multiple spaces considered as one
    val p6 = Regex("\\s+")
    p6.split("Hello   World Welcome back !").forEach(::println)

    // comma
    val p7 = Regex(",")
    p7.split("Apple,Banana,Orange").forEach(::println)

    // Check string match with some characters can be in a pattern
    val p8 = Regex("He([ll]+)o?")
    println(p8.matches("Hello"))
    println(p8.matches("Helllllllllo"))
    println(p8.matches("HelloWorldHello"))
    println(p8.matches("He1aAo"))

    // matchEntire()
    val p9 = Regex("Hello?")
    println(p9.matchEntire("Hello")?.value)
    println(p9.matchEntire("Hellllo")?.value)
    println(p9.matchEntire("Hello, World!")?.value)

    // matchEntire()
    // \\D for non digits
    // \\d for digits
    // """\D+""" or "\\D+"
    val p10 = Regex("\\D+")
    println(p10.matchEntire("Hello")?.value)
    println(p10.matchEntire("Hellllo, Boss!")?.value)
    println(p10.matchEntire("Hello112")?.value)
}