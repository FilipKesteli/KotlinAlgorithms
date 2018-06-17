package matematika.linearna_algebra.matrice

fun main(args: Array<String>) {
//    println(karakteristicniPolinom(mutableListOf(mutableListOf(1.0, 1.0), mutableListOf(1.0, 1.0)), 3.0))
//    println(karakteristicniPolinom(mutableListOf(mutableListOf(3.0, 1.0), mutableListOf(-3.0, 7.0)), 5.0))
//    println(karakteristicniPolinom(mutableListOf(mutableListOf(1.0, 0.0, 1.0), mutableListOf(0.0, 1.0, 1.0), mutableListOf(0.0, 2.0, 1.0)), 3.0))
//    println(nultockaKarakteristicnogPolinoma(mutableListOf(mutableListOf(3.0, 1.0), mutableListOf(-3.0, 7.0)), 1.0, 5.0))
    println(nultockeSvojstvenogPolinoma(mutableListOf(mutableListOf(3.0, 1.0), mutableListOf(-3.0, 7.0)), 0.0, 7.0))

}

/**
 * mogu vracati polinomijalnu funkciju, a mogu and vrijednost te funkcije u tocki
 * opet problemi s byValue
 */
fun karakteristicniPolinom(A: MutableList<MutableList<Double>>, lam: Double): Double {
    var B = kreirajKvadratnuListInListByValue(A)
    var f: (MutableList<MutableList<Double>>, Double) -> (Double) =
            { X, lambda ->
                X.let {
                    for (i in 0 until X.size) {
                        X[i][i] = X[i][i] - lambda
                    }
                }.let { determinantaMatrice(X) }
            }
    return f(B, lam)
}

/**
 * lambda mi je ovdje kao x
 */
fun nultockaKarakteristicnogPolinoma(M: MutableList<MutableList<Double>>, a: Double, b: Double): Double {
    var a2: Double = a
    var b2: Double = b
    var x: Double = (a2 + b2) / 2.0
    var epsilon: Double = 0.01
    var delta: Double = 0.01
    while (b2 - x > delta) {
        var s2: Double = karakteristicniPolinom(M, b2)
        var s1: Double = karakteristicniPolinom(M, x)
        if (karakteristicniPolinom(M, x) * karakteristicniPolinom(M, b2) < 0.0) {
            a2 = x
        } else if (karakteristicniPolinom(M, x) == 0.0) {
            return x
        } else {
            b2 = x
        }
        x = (a2 + b2) / 2.0
    }
    if (karakteristicniPolinom(M, x) <= epsilon) {
        return x
    } else {
        return -9999999.9
    }
}

/**
 * Ovdje se procjenjuje raspon svih nultocki
 */
fun nultockeSvojstvenogPolinoma(M: MutableList<MutableList<Double>>, a: Double, b: Double): MutableList<Double> {
    var m = 5
    var s: MutableList<Double> = mutableListOf()
    for (i in 0 until m - 1) {
        s.add(nultockaKarakteristicnogPolinoma(M, a + i * (b - a) / m.toDouble(), a + (i + 1) * (b - a) / m.toDouble()))
    }
    var r: MutableList<Double> = mutableListOf()
    for (i in s) {
        if (i != -9999999.9) {
            r.add(i)
        }
    }
    return r
}

