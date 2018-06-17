package ostalo.pocetnica

/**
 * ostalo.pocetnica.unaryMinus() metoda govori da je rijec o unarnoj operaciji
 * Kad pozivamo metodu ostalo.pocetnica.unaryMinus() na nasem objektu, onda stavljamo - (minus) znak ispred objekta
 * v1 + b v1.plus(b)
v1 - b v1.minus(b)
v1 * b v1.times(b)
v1 / b v1.div(b)
v1 % b v1.rem(b), v1.mod(b) (deprecated)
v1..b v1.rangeTo(b)
 */
fun main(args: Array<String>) {
    val point = Point(10, 20)

    println(-point)
}

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)

operator fun Point.unaryPlus() = Point(Math.abs(x), Math.abs(y))

//operator fun ostalo.pocetnica.Point.not() =