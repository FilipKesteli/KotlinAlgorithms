package matematika.funkcije

import kotlin.math.sin

/**
 * Ovdje treba primjetiti da je jedini nacin za mijenjanje varijabli funkcija g
 * Samo let funkcija pomaze!!! -> to je zapravo kao nekakvi filter, constraint za ubuduce
 * TODO U detalje prouciti funkciju let
 */
fun main(args: Array<String>) {
    var f: (MutableList<Double>) -> (Double) = { X -> X.let { X[0] = 1.0 }.let { (X[0] + X[1] + X[2]) } }
    var f2: (MutableList<Double>) -> (Double) = { X -> (X[0] + X[1] + X[2]) }
    var g: (MutableList<Double>) -> ((MutableList<Double>) -> Double) = { X -> X.let { X[0] = 10.0 }.let { f2 } }
    var g2: (MutableList<Double>) -> (Double) = { X -> X.let { X[0] = 10.0 }.let { f2(X) } }
//    var h: (MutableList<Double>) -> (Double) = f.also { X[0] = 1.0}
    println(f(mutableListOf(0.0, 2.0, 3.0)))
    println(g2(mutableListOf(0.0, 8.0, 6.0)))

    var Y: MutableList<Int> = mutableListOf(1, 2, 3)
    Y.let { Y[0] = 3 }.let { println(Y) }

    var p: (MutableList<Double>) -> (Double) = { X -> (sin(X[0] * X[1] * X[2])) }
//    println(prF(p, 2))
}

fun prF(f: (MutableList<Double>) -> Double, X: MutableList<Double>, i: Int) {

}