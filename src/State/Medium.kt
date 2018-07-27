package State

class Medium: State(){
    override fun pull(car: Car) {
        car.setState(Hight())
        println("高档")
    }
}