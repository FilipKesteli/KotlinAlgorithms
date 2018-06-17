package matematika.linear_programming

import matematika.kombinatorika_vjerojatnost.kombinacije.Comb
import matematika.kombinatorika_vjerojatnost.permutacije.kreirajListByValueDouble
import matematika.kombinatorika_vjerojatnost.permutacije.kreirajListInListByValue
import matematika.kombinatorika_vjerojatnost.permutacije.kreirajListInListByValueDouble
import matematika.linearna_algebra.matrice.kreirajKvadratnuListInListByValue
import matematika.linearna_algebra.matrice.sustavNJednadzbiEchelon
import matematika.linearna_algebra.matrice.transponiranjeMatrice
import matematika.teorija_igara.minElementListeDouble

fun main(args: Array<String>) {
    var f: (MutableList<Double>) -> (Double) = { x -> -4.0 * x[0] - 5 * x[1] }
    var f2: (MutableList<Double>) -> (Double) = { x -> -4.0 * x[0] - 5 * x[1] }
    println(obicnaMetodaLinearProgramming(f,
            mutableListOf(mutableListOf(2.0, 1.0, 1.0, 0.0, 0.0), mutableListOf(1.0, 0.0, 0.0, 1.0, 0.0), mutableListOf(0.0, 1.0, 0.0, 0.0, 1.0)),
            mutableListOf(9.0, 4.0, 3.0)))
//    println(obicnaMetodaLinearProgramming(f2,
//            mutableListOf(mutableListOf(2.0, 1.0, 1.0, 0.0, 0.0), mutableListOf(1.0, 0.0, 0.0, 1.0, 0.0), mutableListOf(0.0, 1.0, 0.0, 0.0, 1.0)))
//    println(kKombinacijeBezPonavljanja())
}

/**
 * c je lista svih kombinacija stupaca - u gornjem primjeru po 3 stupca
 * onda slazemo matricu po matricu
 * d - matrica za sloziti
 * e - lista
 * r - list of cost coefficients - to je za simplex metodu, no jos prije simplex moram napraviti slicnu metodu, a da nije bas simplex
 * TODO Treba sad proučiti linearnu algebru and linearno programiranje do vrhunca
 * TODO Dokazati sve moguće teoreme and isprogramirati pomoćne metode, odnosno funkcije
 */
fun obicnaMetodaLinearProgramming(f: (MutableList<Double>) -> (Double), A: MutableList<MutableList<Double>>, b: MutableList<Double>): Double {
//    var m = (0 until A[0].size).toMutableList()
//    var q: MutableList<MutableList<Int>> = kKombinacijeBezPonavljanja(A[0].size, m)
    var c = Comb.comb(A.size, A[0].size)
    var d: MutableList<MutableList<Double>> = mutableListOf()
    var g = kreirajListInListByValueDouble(A)
    var t = transponiranjeMatrice(g)
    var listX: MutableList<MutableList<Double>> = mutableListOf()
    var min: MutableList<Double> = mutableListOf()
//    var p: MutableList<Double> = listOfZeroesDouble(A[0].size)
    var x: MutableList<Double> = mutableListOf()
    for (i in c) {
        x.clear()
        var x: MutableList<Double> = listOfZeroesDouble(A[0].size)
        d.clear()
        for (j in i) {
            var e: MutableList<Double> = kreirajListByValueDouble(t[j])
            d.add(e)
        }
//        var h: MutableList<Any> = m.intersect(c).toMutableList()
        var xB: MutableList<Double> = sustavNJednadzbiEchelon(d, b)
        for (j in 0 until i.size) {
            x[i[j]] = xB[j]
        }
        min.add(f(x))
        listX.add(x)
    }
    /*var v: MutableList<Double> = mutableListOf()
    for (and in 0 until min.size) {
        if (min[and] > 0) {
            v.add(min[and])
        }
    }*/
    return minElementListeDouble(min)
}

fun listOfZeroes(n: Int): MutableList<Int> {
    var a: MutableList<Int> = mutableListOf()
    for (i in 0 until n) {
        a.add(0)
    }
    return a
}

fun listOfZeroesDouble(n: Int): MutableList<Double> {
    var a: MutableList<Double> = mutableListOf()
    for (i in 0 until n) {
        a.add(0.0)
    }
    return a
}
