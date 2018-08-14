package Adapter.Composit

/*
    适配器模式 Adapter 组合模式
    当可以知道Adaptee/被适配对象的情况下，推荐使用组合模式
 */

fun main(args: Array<String>) {

    var adaptee = ConcreteAdaptee()

    var target: Target = Adapter(adaptee)

    target.doSomething()

}