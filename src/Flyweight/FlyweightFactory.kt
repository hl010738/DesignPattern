package Flyweight

class FlyweightFactory {



    private var map = mutableMapOf<Char, Flyweight>()

    private constructor(){
        map['A'] = ConcreteFlyweightA()
        map['B'] = ConcreteFlyweightB()
    }

    companion object {


        fun getInstance(): FlyweightFactory{
            return Holder.instance
        }
    }

    private object Holder{
        val instance = FlyweightFactory()
    }

    // 此方法为享元模式的关键
    fun getFlyweight(key: Char): Flyweight{
        var flyweight = map[key] as Flyweight
        if(null == flyweight){
            when(key){
                'A' -> {flyweight = ConcreteFlyweightA()}
                'B' -> {flyweight = ConcreteFlyweightB()}
            }
            map[key] = flyweight
        }
        return flyweight
    }
}