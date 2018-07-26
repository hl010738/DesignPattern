package Interpreter


class Context{

    var hashMap = mutableMapOf<Variable, Boolean>()

    fun assign(v: Variable, value: Boolean){
        hashMap[v] = value
    }

    fun lookup(v: Variable): Boolean {
        return if(hashMap[v] == null){
            false
        } else {
            hashMap[v] as Boolean
        }
    }
}