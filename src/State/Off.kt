package State

class Off: State(){
    override fun pull(car: Car) {
        car.setState(Low())
        println("低档")
    }

}