package TemplateMethod

class OracleDataObject: DataObject(){
    override fun connect() {
        println("Oracle connect")
    }

    override fun select() {
        println("Oracle select")
    }

    override fun process() {
        println("Oracle process")
    }

    override fun disconnect() {
        println("Oracle disconnect")
    }

}