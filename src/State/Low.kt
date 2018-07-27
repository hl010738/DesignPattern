package State

class Low: State(){
    override fun pull(car: Car) {
        car.setState(Medium())
        println("中档")
    }
}