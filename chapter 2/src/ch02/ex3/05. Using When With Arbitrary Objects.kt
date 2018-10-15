package ch02.ex3

import ch02.ex3.Color.*

fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color!")
        }

fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
    try {
        println(mix(BLUE, BLUE))
    } catch (e: Exception) {
        println(e.message)
    }
}