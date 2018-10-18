package ch02.ex5

import java.io.BufferedReader
import java.io.StringReader

fun readNumberExpressionWithReturn(reader: BufferedReader): Int? {
    return try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        0
    } finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    println(readNumberExpressionWithReturn(reader))
}
