package matematika.linearna_algebra.matrice

fun main(args: Array<String>) {
//    swap(mutableListOf(1.0, 2.0, 3.0, 4.0, 5.0), 4, 0)
//    swapIJPermutacijaPomicanje(mutableListOf(1.0, 2.0, 3.0, 4.0, 5.0), 4, 0)
//    swapIJPermutacijaPomicanje(mutableListOf(1.0, 2.0, 3.0, 4.0, 5.0), 0, 4)

    var A: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(6.0, 2.0, 4.0), mutableListOf(0.0, 2.0, 7.0), mutableListOf(-5.0, -1.0, -3.0))
    var b: MutableList<Double> = mutableListOf(2.0, 5.0, 3.0)
    var M1: Matrica = Matrica(3, 3, A)
    var M2: Matrica = Matrica(3, 1, mutableListOf(mutableListOf(-1.2499999), mutableListOf(7.75), mutableListOf(-1.5)))
    println(umnozakMatricaKlasa(M1, M2).retci)
    sustavNJednadzbiEchelon(A, b)
}

/**
 * Ax = b -> Trazimo x za matricu A and vektor b
 * Funkcija vraca vektor x
 * Ovo je funkcija upotrebljiva samo za kvadratne matrice s punim rankom
 */
fun sustavNJednadzbiEchelon(A: MutableList<MutableList<Double>>, b: MutableList<Double>): MutableList<Double> {
    for (i in 0 until A.size) {
        A[i].add(b[i])
    }
    var c: Int = 0
    loop1@ for (i in 0 until A.size) {
        loop2@ for (j in 0 until A[0].size - 1) {
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
    var f: MutableList<Double> = mutableListOf()
    for (i in 0 until A.size) {
        f.add(A[i][A[0].size - 1])
    }
//    println(f)
    return f
}

/**
 * L1 and L2 su vektor retci s b-ovima na kraju
 * TODO Ovo se takoder da rijesiti rekurzijom... Rekurzivno se swapaju clanovi
 */
fun sustav2Jednadzbe(L1: MutableList<Double>, L2: MutableList<Double>) {
    //Najprije trazim prvi clan razlicit od 0.0
    var a: Int = 0
    loop1@ for (i in 1..L1.size) {
        if (L1[i] != 0.0) {
            swap(L1, i, a)
            swap(L2, i, a)
            a += 1
            for (j in 0 until L1.size) {
                L1[j] = L1[j] / L1[a]
            }
            for (k in 0 until L2.size) {
                L2[k] = L2[k] - L2[a] * (-1.0) * L1[k]
            }
//            break@loop1
        }
    }
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

/**
 * Swap-ati s and na j, ali tako da se zadrži poredak
 * [1,2,3,4,5] -> [5,1,2,3,4] or [2,3,4,5,1]
 */
private fun swapIJ(L: MutableList<Double>, i: Int, j: Int) {
    if (i > j) {
        for (k in 0 until i - j) {
            swap(L, i - k, i - k - 1)
        }
    } else if (j > i) {
        for (k in 0 until j - i) {
            swap(L, i + k, i + k + 1)
        }
    }
    println(L)
}