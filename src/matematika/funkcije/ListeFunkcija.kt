package matematika.funkcije

import kotlin.math.cos
import kotlin.math.sin

fun main(args: Array<String>) {
    var f: (Double) -> (Double) = { x -> cos(x) }
    var L: MutableList<(Double) -> (Double)> = mutableListOf(f, f, f, f)
    println(L[0](0.0))
}

