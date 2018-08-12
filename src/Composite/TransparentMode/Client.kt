package Composite.TransparentMode

/*
    组合模式 Composite (透明式)
 */

fun main(args: Array<String>) {

    var leaf1: Component = Leaf()
    var leaf2: Component = Leaf()

    var composite = Composite()
    var composite1 = Composite()

    composite1.add(leaf1)
    composite.add(leaf2)
    composite.add(composite1)

    composite.dosomething()
}