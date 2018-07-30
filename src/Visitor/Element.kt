package Visitor

abstract class Element{
    abstract fun accept(visitor: Visitor)
}