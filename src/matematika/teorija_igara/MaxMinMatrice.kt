package matematika.teorija_igara

import matematika.linearna_algebra.matrice.transponiranjeMatriceInt

fun main(args: Array<String>) {
    println(maxElementListe(mutableListOf(3, 5, 1, 7)))
    println(maxRedak(mutableListOf(mutableListOf(3, 5, 1, 7), mutableListOf(5, 6, 1, 2), mutableListOf(9, 11, 2, 32))))
    println(minRedak(mutableListOf(mutableListOf(3, 5, 1, 7), mutableListOf(5, 6, 1, 2), mutableListOf(9, 11, 2, 32))))
    println(maxStupac(mutableListOf(mutableListOf(3, 5, 1, 7), mutableListOf(5, 6, 1, 2), mutableListOf(9, 11, 2, 32))))
    println(minStupac(mutableListOf(mutableListOf(3, 5, 1, 7), mutableListOf(5, 6, 1, 2), mutableListOf(9, 11, 2, 32))))
}

/**
 * Maksimalni elementi iz redaka - output je vektor maksimalnih elemenata iz redaka
 */
fun maxRedak(M: MutableList<MutableList<Int>>): MutableList<Int> {
    var a: MutableList<Int> = mutableListOf()
    for (i in 0 until M.size) {
        a.add(maxElementListe(M[i]))
    }
    return a
}

/**
 * Minimalni elementi iz redaka
 */
fun minRedak(M: MutableList<MutableList<Int>>): MutableList<Int> {
    var a: MutableList<Int> = mutableListOf()
    for (i in 0 until M.size) {
        a.add(minElementListe(M[i]))
    }
    return a
}

/**
 * Maksimalni elementi iz stupaca
 */
fun maxStupac(M: MutableList<MutableList<Int>>): MutableList<Int> {
    var a: MutableList<Int> = mutableListOf()
    var b: MutableList<MutableList<Int>> = transponiranjeMatriceInt(M)
    for (i in 0 until b.size) {
        a.add(maxElementListe(b[i]))
    }
    return a
}

/**
 * Minimalni elementi iz stupaca
 */
fun minStupac(M: MutableList<MutableList<Int>>): MutableList<Int> {
    var a: MutableList<Int> = mutableListOf()
    var b: MutableList<MutableList<Int>> = transponiranjeMatriceInt(M)
    for (i in 0 until b.size) {
        a.add(minElementListe(b[i]))
    }
    return a
}

fun maxElementListe(x: MutableList<Int>): Int {
    var a = x[0]
    for (i in 0 until x.size) {
        if (x[i] > a) {
            a = x[i]
        }
    }
    return a
}

fun minElementListe(x: MutableList<Int>): Int {
    var a = x[0]
    for (i in 0 until x.size) {
        if (x[i] < a) {
            a = x[i]
        }
    }
    return a
}

fun minElementListeDouble(x: MutableList<Double>): Double {
    var a = x[0]
    for (i in 0 until x.size) {
        if (x[i] < a) {
            a = x[i]
        }
    }
    return a
}