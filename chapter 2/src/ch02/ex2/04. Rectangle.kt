package ch02.ex2

import java.util.Random

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(Math.abs(random.nextInt()), Math.abs(random.nextInt()))
}

fun main(args: Array<String>) {
    val rect = createRandomRectangle()
    print(rect)
}