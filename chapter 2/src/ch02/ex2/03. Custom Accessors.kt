package ch02.ex2

class Rectangle(private val height: Int, private val width: Int) {
    val isSquare: Boolean
        get() = height == width

    override fun toString(): String = "${this.javaClass.simpleName}[height=$height,width=$width]"
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}