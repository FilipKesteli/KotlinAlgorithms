package matematika.linearna_algebra.blok_matrice

import matematika.kombinatorika_vjerojatnost.permutacije.kreiraj3ListInListByValueDouble
import matematika.kombinatorika_vjerojatnost.permutacije.kreirajListInListByValueDouble

fun main(args: Array<String>) {
    println(nulRedak(6))
    println(jedinicnaMatrica(5))
    println(kroneckerProduct(jedinicnaMatrica(2), jedinicnaMatrica(2)))
}

/**
 * A x B
 */
fun kroneckerProduct(A: MutableList<MutableList<Double>>, B: MutableList<MutableList<Double>>): MutableList<MutableList<MutableList<MutableList<Double>>>> {
    var C: MutableList<MutableList<MutableList<Double>>> = mutableListOf()
    var E: MutableList<MutableList<MutableList<MutableList<Double>>>> = mutableListOf()
    for (i in 0 until A.size) {
        for (j in 0 until A[0].size) {
            var D: MutableList<MutableList<Double>> = umnozakSkalaraIMatrice(A[i][j], kreirajListInListByValueDouble(B))
            C.add(D)
        }
        var F: MutableList<MutableList<MutableList<Double>>> = kreiraj3ListInListByValueDouble(C)
        E.add(F)
        C.clear()
    }
    return E
}

fun umnozakSkalaraIMatrice(a: Double, B: MutableList<MutableList<Double>>): MutableList<MutableList<Double>> {
    for (i in 0 until B.size) {
        for (j in 0 until B[0].size) {
            B[i][j] = a * B[i][j]
        }
    }
    return B
}

fun jedinicnaMatrica(n: Int): MutableList<MutableList<Double>> {
    var A: MutableList<MutableList<Double>> = mutableListOf()
    for (i in 0 until n) {
        var B: MutableList<Double> = nulRedak(n)
        for (j in 0 until n) {
            if (i == j) {
                B[i] = 1.0
            }
        }
        A.add(B)
    }
    return A
}

fun nulRedak(n: Int): MutableList<Double> {
    var B: MutableList<Double> = mutableListOf()
    for (i in 0 until n) {
        B.add(0.0)
    }
    return B
}