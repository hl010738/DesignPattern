package Flyweight

abstract class Flyweight{
    abstract var letter: Char
    abstract var size: Int

    abstract fun display()

    abstract fun setFontSize(fontSize: Int)
}