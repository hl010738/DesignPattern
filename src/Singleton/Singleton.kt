package Singleton

/*
    This is the best implementation of Kotlin
    这是目前使用Kotlin对单例模式的最佳实现
 */

class Singleton private constructor(){

    companion object {
        fun getInstance(): Singleton{
            return Holder.singleton
        }
    }

    private object Holder{
        val singleton = Singleton()
    }
}