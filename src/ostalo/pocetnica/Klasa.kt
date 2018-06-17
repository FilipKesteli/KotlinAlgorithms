package ostalo.pocetnica

fun main(args: Array<String>) {
    val bonnie = Animal("Bonnie", 30.4, 50.0)
    bonnie.getInfo()

    val joni = Dog("Joni", 20.0, 30.2, "Filip")
    joni.getInfo()

    val tweety = Bird("Tweety")
    tweety.fly(19.8)
}

open class Animal(val name: String, var height: Double, var weight: Double) {
    init {
        require(height > 0) { "Height must be greater than 0" }
        require(weight > 0) { "Weight must be greater than 0" }
    }

    open fun getInfo() {
        println("$name is $height tall and weighs $weight")
    }
}

class Dog(name: String,
          height: Double,
          weight: Double,
          private var owner: String) : Animal(name, weight, height) {

    override fun getInfo() {
        super.getInfo()
        println("$name is $height tall and weighs $weight and is owned by $owner")
    }
}

interface Flyable {
    var flies: Boolean
    fun fly(distMile: Double): Unit
}

class Bird constructor(private val name: String, override var flies: Boolean = true) : Flyable {
    override fun fly(distMile: Double) {
        if (flies == true) {
            println("$name flies $distMile miles")
        }
    }
}




