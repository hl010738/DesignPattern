package Interpreter


/*
    解释器模式 Interpreter
 */

fun main(args: Array<String>) {

    var context = Context()

    var x = Variable("x")
    var y = Variable("v")

    var constant = Constant(true)

    context.assign(x, false)
    context.assign(y, false)

    var expression = Or(And(constant, x), And(y, Not(x)))

    println(expression.Interpret(context))
}