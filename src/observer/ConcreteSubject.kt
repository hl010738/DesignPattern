package observer

class ConcreteSubject: Subject{

    var list = ArrayList<Observer>()

    private var indecs = arrayOf(1, 2, 3)

    override fun attach(observer: Observer) {
        list.add(observer)
    }

    override fun detach(observer: Observer) {
        list.remove(observer)
    }

    override fun notifyObserver(any: Any) {
        list.forEach { it.update(any) }
    }

    fun invoke(){
        for (it in indecs){
            println(it)

            notifyObserver(it)
        }
    }

}