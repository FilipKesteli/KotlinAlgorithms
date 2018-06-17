package matematika.linearna_algebra.matrice

fun main(args: Array<String>) {
    var A: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(6.0, 2.0, 4.0), mutableListOf(0.0, 2.0, 7.0), mutableListOf(-5.0, -1.0, -3.0))
    var C: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(2.0, 2.0, 1.0), mutableListOf(4.0, 4.0, 2.0), mutableListOf(-5.0, -1.0, -3.0))
    println(echelonPoRetcima(A))
    println(echelonPoRetcima(C))
    println(rankMatrice(A))
    println(rankMatrice(C))
}

/**
 * Radim elementarne transformacije po retcima do echelon forme
 * Broj ne-nul stupaca je rank matrice
 */
fun rankMatrice(A: MutableList<MutableList<Double>>): Int {
    var B = echelonPoRetcima(A)
    var C = transponiranjeMatrice(B)
    var D = echelonPoRetcima(C)
    var g: Int = 0
    for (i in 0 until D.size) {
        if (!isNulLista(D[i])) {
            g += 1
        }
    }
    return g
}

/**
 * TODO Provjeriti zasto se sto radi
 */
fun echelonPoRetcima(A: MutableList<MutableList<Double>>): MutableList<MutableList<Double>> {
    var c: Int = 0 //sluzi da bi se zapamtio broj koliko smo puta imali pivotni element
    loop1@ for (i in 0 until A.size) {
        loop2@ for (j in 0 until A[0].size) {
            if (A[i][j] != 0.0) {
                for (k in 0 until A.size) {
                    swap(A[k], i, c) //metoda swapanja ako je element razlicit od 0 - swapaju se stupci - bolji pregled
                }
                var d: Double = A[i][c] //
                for (l in 0 until A[0].size) {
                    if (d != 0.0) { //provjera da nema djeljenja s 0.0
                        A[i][l] = A[i][l] / d //normiranje elementa
                    }
                }
                for (s in 0 until A.size) {
                    if (A[s][c] != 0.0 && s != i) {
                        var e: Double = A[s][c]
                        for (p in 0 until A[0].size) {
                            if (A[i][c] != 0.0) { //provjera da nema djeljenja s 0.0
                                A[s][p] = A[s][p] + e * (-1.0) / A[i][c] * A[i][p] //eliminiranje elementa
                            }
                        }
                    }
                }
                c += 1
                break@loop2
            }
        }
    }
    return A
}

fun isNulLista(L: MutableList<Double>): Boolean {
    for (i in 0 until L.size) {
        if (L[i] != 0.0) {
            return false
        }
    }
    return true
}

/**
 * Swap-ati s and na j
 */
private fun swap(L: MutableList<Double>, i: Int, j: Int) {
    var a: Double = L[i]
    L[i] = L[j]
    L[j] = a
//    println(L)
}
