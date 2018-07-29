package Mediator


/*
    中介者模式 Mediator
 */

fun main(args: Array<String>) {

    var mediator = ConcreteMediator()

    var zhangsan = ConcreteColleagueA("zhangsan")
    var lisi = ConcreteColleagueB("lisi")
    var wangwu = ConcreteColleagueA("wangwu")

    mediator.register(zhangsan)
    mediator.register(lisi)
    mediator.register(wangwu)

    zhangsan.send("lisi", "abc")
    lisi.send("wangwu", "123")
    wangwu.send("zhangsan", "!_!")
}