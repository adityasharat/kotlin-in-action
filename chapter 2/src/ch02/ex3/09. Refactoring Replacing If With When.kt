package ch02.ex3

fun evalIfWithWhen(e: Expr): Int =
        when (e) {
            is Num ->
                e.value
            is Sum ->
                eval(e.right) + eval(e.left)
            else ->
                throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(evalIfWithWhen(Sum(Num(1), Num(2))))
}