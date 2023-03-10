fun main(){
    var rangerover=car("lexus","A4","white",8)
    rangerover.carry( 12)
    rangerover.carry(4)
    rangerover.identity("white","lexus")
    println(rangerover.culculateparkingfees(24))
    rangerover.capacity

    var rusinga=bus("hopper","A55","blue",30,)
    println(rusinga.maxTripFare(64.5))
    rusinga.culculateparkingfees(17)





}
//1. Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
 open class car( var make:String, var model:String, var color:String, var capacity:Int){
   fun carry(people:Int){
        var x=people-capacity
    if (people<= capacity) println("carrying $people passengers")
    else println("over capacity $x people")

    }
//    - identity() : Prints out the color, make and model in the following
//    format e.g: “I am a white subaru legacy”
fun identity(color: String,make: String){
    var whatiam=("i am a $color $make legacy")
    println(whatiam)
}
//    - calculateParkingFees(hours: Int) : Calculates and returns the
//    parking fees by multiplying the hours by 20
  open  fun  culculateparkingfees(hours:Int):Int{
        var x=hours*20
    return x
    }
}
//2. Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus
class bus( make: String,model: String, color: String, capacity: Int):car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double {
        println(fare*capacity)
        return fare

    }

    override fun culculateparkingfees(hours: Int):Int{
//        super.culculateparkingfees(hours)
        println(hours*capacity)
        return (hours*capacity)
    }
    }
