package Observer

interface Subject {
    fun attach(observer: Observer)

    fun detach(observer: Observer)

    fun notifyObserver(any: Any)
}