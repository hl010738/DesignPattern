package Builder

/*
    Builder 建造者模式
 */

fun main(args: Array<String>) {

    var director = Director()

    var builderA: Builder = ConcreteBuilderA()
    var builderB: Builder = ConcreteBuilderB()

    director.build(builderA)
    var productA = builderA.getResult()
    productA.show()

    director.build(builderB)
    var productB = builderB.getResult()
    productB.show()
}