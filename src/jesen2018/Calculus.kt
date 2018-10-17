package jesen2018

import jesen2018.linear_programming.sumaDouble

fun main(args: Array<String>) {

}

/**
 * Norma vektora koji prolazi točkama X i X0
 */
fun normInSpace(X: MutableList<Double>, X0: MutableList<Double>): Double {
    var a: Double = 0.0
    for (i in 0 until X.size) {
        a += Math.pow(X[i] - X0[i], 2.0)
    }
    return Math.sqrt(a)
}