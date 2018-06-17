package ostalo.cake

fun main(args: Array<String>) {
    probaNadodavanje(jedinicnaMatrica(3), jedinicnaMatrica(3))
}

/**
 * Kreiranje varijable broja iz broja u listi je passed by value,
 * a kreiranje liste iz liste je passed by reference
 */
private fun probaNadodavanje(A: MutableList<MutableList<Double>>, B: MutableList<MutableList<Double>>) {
    println(A)
    var C: MutableList<MutableList<Double>> = mutableListOf()
    var G: MutableList<MutableList<Double>> = mutableListOf()
    G.addAll(A)
    println(G)
    var d: Double = A[0][0]
    A[0][1] = 3.12
    println(d)
    for (i in 0 until A.size) {
        var e: MutableList<Double> = mutableListOf()
        for (j in 0 until A.size) {
            var f: Double = A[i][j]
            e.add(f)
        }
        C.add(e)
    }
    println(C)
    nadodavanjeMatriceNaMatricu(A, B)
    println(A)
    println(C)
    println(G)
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