package matematika.diferencijalni_racun

import kotlin.math.pow

fun main(args: Array<String>) {
    var f: (Double) -> Double = { x -> x.pow(2) }
    println(derivacija(f, 3.0))
}

private fun derivacija(f: (Double) -> (Double), x0: Double): Double {
    var dx: Double = 0.000001
    return (f(x0 + dx) - f(x0)) / dx
}

/**
 * and-ta parcijalna derivacija, and 0..n-1
 */
fun parcijalnaDerivacijaSkalarneFunkcijeViseVarijabli(f: (MutableList<Double>) -> Double, i: Int, a: MutableList<Double>, h: Double): Double {
    var b: MutableList<Double> = kreirajListaIzListeByValue(a)
    a[i] = a[i] + h
    return (f(a) - f(b)) / h
}

/**
 * Parcijalna derivacija vektorske matematika.funkcije
 * Odmah cemo izvuc Maxwellove relacije
 * Najopcenitije
 * vektor b je pomocni vektor b = a + t*e[i], gdje je e[i] vektor smjera and
 */
fun parcijalnaDerivacijaVektorskeFunkcijeViseVarijabli(f: (MutableList<Double>) -> (MutableList<Double>), i: Int, a: MutableList<Double>, h: Double): MutableList<Double> {
    var b: MutableList<Double> = kreirajListaIzListeByValue(a)
    b[i] = a[i] + h
    var c: MutableList<Double> = mutableListOf()
    for (i in 0 until a.size) {
        c.add((f(b)[i] - f(a)[i]) / h)
    }
    return c
}

/**
 * Ovdje dobivamo derivaciju u smjeru vektora v
 * vektor b je pomocni vektor b = a + hv
 */
fun usmjerenaDerivacijaVektorskeFunkcijeViseVarijabli(f: (MutableList<Double>) -> (MutableList<Double>), a: MutableList<Double>, h: Double, v: MutableList<Double>): MutableList<Double> {
    var b: MutableList<Double> = kreirajListaIzListeByValue(a)
    for (i in 0 until a.size) {
        b[i] = a[i] + h * v[i]
    }
    var c: MutableList<Double> = mutableListOf()
    for (i in 0 until a.size) {
        c.add((f(b)[i] - f(a)[i]) / h)
    }
    return c
}

private fun kreirajListaIzListeByValue(L: MutableList<Double>): MutableList<Double> {
    var a: MutableList<Double> = mutableListOf()
    for (i in L) {
        a.add(i)
    }
    return a
}



