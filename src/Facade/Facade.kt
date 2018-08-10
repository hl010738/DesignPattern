package Facade

class Facade{
    private var subSystemA = SubSystemA()
    private var subSystemB = SubSystemB()
    private var subSystemC = SubSystemC()

    fun accessSubSystemA(){
        subSystemA.accessSubSystemA()
    }

    fun accessSubSystemB(){
        subSystemB.accessSubSystemB()
    }

    fun accessSubSystemC(){
        subSystemC.accessSubSystemC()
    }
}