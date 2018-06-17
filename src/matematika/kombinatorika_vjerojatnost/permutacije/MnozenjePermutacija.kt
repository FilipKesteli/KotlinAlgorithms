package matematika.kombinatorika_vjerojatnost.permutacije

fun main(args: Array<String>) {
    var P: MutableList<MutableList<Int>> = mutableListOf((1..5).toMutableList(), mutableListOf(2, 4, 1, 3, 5))
    var Q: MutableList<MutableList<Int>> = mutableListOf((1..5).toMutableList(), mutableListOf(5, 4, 3, 2, 1))
    println(mnozenjePermutacija(Q, P))
    println(mnozenjePermutacija(P, Q))

    var R: MutableList<MutableList<Int>> = mutableListOf((1..5).toMutableList(), mutableListOf(2, 5, 4, 3, 1))
    println(inverzPermutacije(R))
}

/**
 * Mnozenje matrica permutacija
 * a * b
 * Ovaj se problem takoder mozda moze rijesiti swapanjem
 * Ovo valja kao algoritam kad je a po redu
 */
fun mnozenjePermutacija(a: MutableList<MutableList<Int>>, b: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    var c: MutableList<MutableList<Int>> = kreirajListInListByValue(a)
    for (i in 0 until c[0].size) {
        c[0][i] = b[1][i]
    }
    for (i in 0 until c[0].size) {
        c[1][i] = a[1][c[0][i] - 1]
    }
    for (i in 0 until c[0].size) {
        c[0][i] = b[0][i]
    }
    return c
}

/**
 * TODO Ovdje je najpametnije swapati citavu matricu permutacija
 */
fun inverzPermutacije(P: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    var b: MutableList<Int> = P[0]
    P[0] = P[1]
    P[1] = b
    sortStupciMatricePermutacije(P)
    return P
}

fun kreirajListInListByValue(A: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    var B: MutableList<MutableList<Int>> = mutableListOf()
    for (i in 0 until A.size) {
        var c: MutableList<Int> = mutableListOf()
        for (j in 0 until A[0].size) {
            var d: Int = A[i][j]
            c.add(d)
        }
        B.add(c)
    }
    return B
}

fun kreirajListInListByValueDouble(A: MutableList<MutableList<Double>>): MutableList<MutableList<Double>> {
    var B: MutableList<MutableList<Double>> = mutableListOf()
    for (i in 0 until A.size) {
        var c: MutableList<Double> = mutableListOf()
        for (j in 0 until A[0].size) {
            var d: Double = A[i][j]
            c.add(d)
        }
        B.add(c)
    }
    return B
}

fun kreiraj3ListInListByValueDouble(A: MutableList<MutableList<MutableList<Double>>>): MutableList<MutableList<MutableList<Double>>> {
    var B: MutableList<MutableList<MutableList<Double>>> = mutableListOf()
    for (i in 0 until A.size) {
        var c: MutableList<MutableList<Double>> = mutableListOf()
        for (j in 0 until A[0].size) {
            var e: MutableList<Double> = mutableListOf()
            for (k in 0 until A[0][0].size) {
                var d: Double = A[i][j][k]
                e.add(d)
            }
            c.add(e)
        }
        B.add(c)
    }
    return B
}

/**
 * a mora biti permutacija
 */
fun matricaPermutacija(a: MutableList<Int>): MutableList<MutableList<Int>> {
    var b: MutableList<MutableList<Int>> = mutableListOf((1..a.size).toMutableList(), mutableListOf())
    for (i in a) {
        b[1].add(i)
    }
    return b
}
