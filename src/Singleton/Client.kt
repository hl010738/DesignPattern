package Singleton

/*
    单例模式 Singleton
 */

fun main(args: Array<String>) {
    var s1 = Singleton.getInstance()
    var s2 = Singleton.getInstance()

    println(s1 == s2)
}