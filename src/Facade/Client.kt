package Facade

/*
    门面模式 Facade
 */

fun main(args: Array<String>) {

    var facade = Facade()

    facade.accessSubSystemA()

    facade.accessSubSystemB()

    facade.accessSubSystemC()
}