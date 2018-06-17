package matematika.funkcije

fun main(args: Array<String>) {
    var f: (Double) -> (Double) = { x -> 2 * x + 3 }
    var g: (Double) -> (Double) = { x -> Math.pow(x, 2.0) - 10 * x + 24 }
//    println(nultockeFunkcije(f, -3.0, 3.0))
    println(nultockeFunkcije(g, 1.0, 5.0))
}

/**
 * Metoda raspolavljanja intervala
 * Metoda nalazenja jedne nultocke opcenito nelinearnih, a i linearnih funkcija
 */
fun nultockeFunkcije(f: (Double) -> (Double), a: Double, b: Double): Double {
    var a2: Double = a
    var b2: Double = b
    var x: Double = (a2 + b2) / 2.0
    var epsilon: Double = 0.1
    var delta: Double = 0.01
    while (b2 - x > delta) {
        if (f(x) * f(b) < 0.0) {
            a2 = x
        } else if (f(x) == 0.0) {
            return x
        } else {
            b2 = x
        }
        x = (a2 + b2) / 2.0
    }
    if (f(x) <= epsilon) {
        return x
    } else {
        return -9999999.9
    }
}

/**
 * a mora biti razlicit od intervala u kojem nalazimo nultocke
 */
/*
fun nultockePolinoma(M: MutableList<Double>, a: Double, b: Double) {
    var f: (Double) -> (Double) = { x ->
        x.let {
            var e: Double = 0.0
            for (and in 0 until M.size) {
                e += Math.pow(x, and.toDouble()) * M[and]
            }
            e
        }
    }

    var c: Double = 1000.0
    var a2: Double = a
    var b2: Double = b
    var d: MutableList<Double> = mutableListOf()
    while (a2 < (-a)) {
        nultockeFunkcije(f, )
    }
}
*/

/*
fun nultockeKarakteristicnogPolinoma(M: MutableList<MutableList<Double>>, lambda: Double, a: Double, b: Double): Double {
    var f: (MutableList<MutableList<Double>>, Double) -> (Double) = { Y, la -> 1.0 }
    var a2: Double = a
    var b2: Double = b
    var x: Double = (a2 + b2) / 2.0
    var epsilon: Double = 0.01
    while (b2 - x > epsilon) {
        if (f(x) * f(b) < 0.0) {
            a2 = x
        } else {
            b2 = x
        }
        x = (a2 + b2) / 2.0
    }
    return x
}
*/

