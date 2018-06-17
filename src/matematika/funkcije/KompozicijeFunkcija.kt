package matematika.funkcije

import kotlin.math.sin

fun main(args: Array<String>) {
    var f: (Double) -> (Double) = { x -> sin(x) }
    var g: (Double) -> (Double) = { x -> Math.pow(x, 3.0) }
    var h: (Double) -> (Double) = { x -> f(g(x)) }
    var r: (Double) -> (Double) = { x -> g(f(x)) }
}

fun kompozicija() {

}