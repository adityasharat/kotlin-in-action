package ch02.ex3

fun evalIf(e: Expr): Int =
        if (e is Num) {
            e.value
        } else if (e is Sum) {
            eval(e.right) + eval(e.left)
        } else {
            throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(evalIf(Sum(Num(1), Num(2))))
}
