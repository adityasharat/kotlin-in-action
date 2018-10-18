package ch02.ex5

import java.io.BufferedReader
import java.io.StringReader

fun readNumberExpression(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }

    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumberExpression(reader)
}
