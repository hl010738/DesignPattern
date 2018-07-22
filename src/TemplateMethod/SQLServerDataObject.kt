package TemplateMethod

class SQLServerDataObject: DataObject(){
    override fun connect() {
        println("SQL Server connect")
    }

    override fun select() {
        println("SQL Server select")
    }

    override fun process() {
        println("SQL Server process")
    }

    override fun disconnect() {
        println("SQL Server disconnect")
    }

}