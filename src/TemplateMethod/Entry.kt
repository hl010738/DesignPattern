package TemplateMethod

/*
    TemplateMethod(模版方法模式)
 */
fun main(args: Array<String>) {
    var dataObject: DataObject = OracleDataObject()
    var sqlServerDataObject: DataObject = SQLServerDataObject()

    dataObject.run()

    println("------------------------")

    sqlServerDataObject.run()
}