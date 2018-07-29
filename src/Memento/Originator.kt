package Memento

class Originator(name: String, phone: String, buget: Double){
    var name: String = name
    var phone: String = phone
    var buget: Double = buget

    fun saveMemento(): Memento{
        return Memento(name, phone, buget)
    }

    fun restoreMemento(memento: Memento){
        this.name = memento.name
        this.phone = memento.phone
        this.buget = memento.buget
    }

    override fun toString(): String {
        return "名字：$name， 电话：$phone， 预算：$buget"
    }
}