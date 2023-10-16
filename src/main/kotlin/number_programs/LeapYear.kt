package number_programs

import java.time.Year

fun isLeapYear(year: Long): Boolean {
    return Year.isLeap(year)
}

fun isLeapYear(year: Int): Boolean {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true
            } else {
                return false
            }
        } else {
            return true
        }
    } else {
        return false
    }
}

fun isLeapYear1(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
}

fun isLeapYear2(year: Int): Boolean {
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}

fun main() {
    println(isLeapYear(2000L))
    println(isLeapYear(1900L))

    println(isLeapYear(2000))
    println(isLeapYear(1900))

    println(isLeapYear1(2000))
    println(isLeapYear1(1900))

    println(isLeapYear2(2000))
    println(isLeapYear2(1900))
}
