package TemplateMethod

abstract class DataObject{
    abstract fun connect()
    abstract fun select()
    abstract fun process()
    abstract fun disconnect()

    fun run(){
        connect()
        select()
        process()
        disconnect()
    }
}