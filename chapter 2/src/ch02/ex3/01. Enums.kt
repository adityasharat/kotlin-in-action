package ch02.ex3

enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

fun main(args: Array<String>) {
    Day.values().forEach { d ->println(d) }
}