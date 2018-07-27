package State

class Hight: State(){
    override fun pull(car: Car) {
        car.setState(Off())
        println("停车")
    }
}