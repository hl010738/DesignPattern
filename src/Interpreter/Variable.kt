package Interpreter

class Variable(name: String): Expression(){

    private var name = name

    override fun Interpret(context: Context): Boolean {
        return context.lookup(this)
    }
}