package State

class Car{
    private var current: State = Off()

    init {
        println("新车出厂，空档")
    }

    fun setState(s: State){
        current = s
    }

    fun pull(){
        current.pull(this)
    }
}