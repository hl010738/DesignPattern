package Prototype

abstract class Prototype(id: String){
    var id = id

    abstract fun clone(): Prototype
}