package ch02.ex4

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    println(isLetter('q'))
    println(isLetter('1'))
    println(isNotDigit('x'))
    println(isNotDigit('9'))
}
