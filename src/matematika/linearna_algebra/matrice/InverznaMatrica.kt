package matematika.linearna_algebra.matrice

fun main(args: Array<String>) {
//    jedinicnaMatrica(3)
//    nadodavanjeMatriceNaMatricu(jedinicnaMatrica(3), jedinicnaMatrica(3))
//    kreirajKvadratnuListInListByValue(jedinicnaMatrica(3))
    var X: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(6.0, 2.0, 4.0), mutableListOf(0.0, 2.0, 7.0), mutableListOf(-5.0, -1.0, -3.0))
    println(inverznaMatrica(X))
    var Y: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(1.0, -1.0, 1.0), mutableListOf(2.0, -1.0, 0.0), mutableListOf(1.0, -2.0, 2.0))
    println(inverznaMatrica(Y))
    umnozakMatrica(Y, inverznaMatrica(Y))
}

/**
 * A takoder mora biti kvadratna matrica
 */
fun inverznaMatrica(L: MutableList<MutableList<Double>>): MutableList<MutableList<Double>> {
    var A = kreirajKvadratnuListInListByValue(L)
    var B: MutableList<MutableList<Double>> = jedinicnaMatrica(A.size)
    nadodavanjeMatriceNaMatricu(A, B)

    var c: Int = 0
    loop1@ for (i in 0 until A.size) {
        loop2@ for (j in 0 until A[0].size - B[0].size) {
            if (A[i][j] != 0.0) {
                for (k in 0 until A.size) {
                    swap(A[k], i, c)
                }
                var d: Double = A[i][c]
                for (l in 0 until A[0].size) {
                    A[i][l] = A[i][l] / d
                }
                for (s in 0 until A.size) {
                    if (A[s][c] != 0.0 && s != i) {
                        var e: Double = A[s][c]
                        for (p in 0 until A[0].size) {
                            A[s][p] = A[s][p] + e * (-1.0) / A[i][c] * A[i][p]
                        }
                    }
                }
                c += 1
                break@loop2
            }
        }
    }
//    println(A)
    var F: MutableList<MutableList<Double>> = mutableListOf()

    for (i in 0 until A.size) {
        var G: MutableList<Double> = mutableListOf()
        for (j in B[0].size until A[0].size) {
            var h: Double = A[i][j]
            G.add(h)
        }
        F.add(G)
    }
//    println(F)
    return F
}

private fun jedinicnaMatrica(n: Int): MutableList<MutableList<Double>> {
    var a: MutableList<MutableList<Double>> = mutableListOf()
    for (i in 0 until n) {
        var b: MutableList<Double> = mutableListOf()
        for (j in 0 until n) {
            if (i == j) {
                b.add(1.0)
            } else {
                b.add(0.0)
            }
        }
        a.add(b)
    }
    return a
}

/**
 * Pomocna funkcija za inverz
 */
private fun nadodavanjeMatriceNaMatricu(A: MutableList<MutableList<Double>>, B: MutableList<MutableList<Double>>): MutableList<MutableList<Double>> {
    for (i in 0 until A.size) {
        for (j in 0 until A.size) {
            A[i].add(B[i][j])
        }
    }
    return A
}

/**
 * Swap-ati s and na j
 */
private fun swap(L: MutableList<Double>, i: Int, j: Int) {
    var a: Double = L[i]
    L[i] = L[j]
    L[j] = a
}

/**
 * Mozemo uociti kako se brojevi gledaju kao byValue, a liste byReference
 * Kreiranje varijable broja iz broja u listi je passed by value,
 * a kreiranje liste iz liste je passed by reference
 */
fun kreirajKvadratnuListInListByValue(A: MutableList<MutableList<Double>>): MutableList<MutableList<Double>> {
    var B: MutableList<MutableList<Double>> = mutableListOf()
    for (i in 0 until A.size) {
        var c: MutableList<Double> = mutableListOf()
        for (j in 0 until A.size) {
            var d: Double = A[i][j]
            c.add(d)
        }
        B.add(c)
    }
    return B
}
