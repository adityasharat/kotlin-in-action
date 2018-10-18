package ch02.ex5

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return 0
    } finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    var reader:BufferedReader;

    reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))

    reader = BufferedReader(StringReader("abc"))
    println(readNumber(reader))
}
