package ch02.ex1HelloWorld

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")
}