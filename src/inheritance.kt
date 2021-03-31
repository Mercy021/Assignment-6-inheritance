



fun main() {
    var gari=Car("buggatti","legacy","black",40)
    gari.carry(100)
    println("i am a ${gari.color} ${gari.make} ${gari.model}")
    println(gari.calculateParkingFees(5))
    var basi=Bus("buggatti","legacy","black",40)
    println(basi.max(4688.76.toDouble()))
    println(basi.max(4688.76.toDouble()*basi.capacity))




    }
    open class Mat( var make:String,var model:String,var color:String,var capacity:Int) {
        fun carry(people:Int) {
            println("carry $people passengers")
            var people = people - capacity
            if (people <= capacity) {
                println("carry $people passengers")
            } else {
                println("over capacity by $people")
            }
        }
        fun calculateParkingFees(hours:Int):Int {
            return hours * 20
        }
        }
class Car( make:String, model:String, color:String, capacity:Int):Mat(make,model,color,capacity){


}
class Bus(var make:String,var model:String,var color: String,var capacity:Int) {
    fun max(fare:Double):Double{
        var x=0
        return x+fare

    }
}






