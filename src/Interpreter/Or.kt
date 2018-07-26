package Interpreter

class Or(left: Expression, right: Expression): Expression(){

    private var left = left
    private var right = right

    override fun Interpret(context: Context): Boolean {
        return left.Interpret(context) || right.Interpret(context)
    }
}