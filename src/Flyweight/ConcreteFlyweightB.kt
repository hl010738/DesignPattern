package Flyweight

class ConcreteFlyweightB() : Flyweight(){

    override var letter: Char = 'B'
    override var size: Int = 15

    override fun display() {
        println("$letter $size")
    }

    override fun setFontSize(fontSize: Int) {
        this.size = fontSize
    }
}