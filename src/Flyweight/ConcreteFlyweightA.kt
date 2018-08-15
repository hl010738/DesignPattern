package Flyweight

class ConcreteFlyweightA() : Flyweight(){

    override var letter: Char = 'A'
    override var size: Int = 12

    override fun display() {
        println("$letter $size")
    }

    override fun setFontSize(fontSize: Int) {
        this.size = fontSize
    }
}