package Flyweight

/*
    享元模式 Flyweight
 */

fun main(args: Array<String>) {

    var factory = FlyweightFactory.getInstance()

    var a = factory.getFlyweight('A')
    a.setFontSize(20)
    a.display()

    var b = factory.getFlyweight('B')
    b.setFontSize(17)
    b.display()

}