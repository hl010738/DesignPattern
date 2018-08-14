package Adapter.Inherit

/*
    适配器模式 Adapter 类继承模式
 */

fun main(args: Array<String>) {
    var target: Target = Adapter()

    target.doSomething()
}