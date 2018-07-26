package Interpreter

class Not(exp: Expression): Expression(){

    private var exp = exp

    override fun Interpret(context: Context): Boolean {
        return !exp.Interpret(context)
    }
}