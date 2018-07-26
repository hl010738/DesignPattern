package Interpreter

abstract class Expression{
    abstract fun Interpret(context: Context): Boolean
}