package Interpreter

class Constant(value: Boolean): Expression(){

    private var value = value

    override fun Interpret(context: Context): Boolean {
        return value
    }
}
