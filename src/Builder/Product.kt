package Builder

class Product{

    private var list = arrayListOf<String>()

    fun add(content: String){
        list.add(content)
    }

    fun show(){
        println("Display product：")

        list.forEach { println(it) }
    }
}