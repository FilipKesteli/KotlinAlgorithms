package matematika.statistika

fun main(args: Array<String>) {

}

fun l0Norma(x: MutableList<Double>): Int {
    var a: Int = 0
    for (i in x) {
        if (i != 0.0) {
            a += 1
        }
    }
    return a
}

fun l1Norma(x: MutableList<Double>): Double {
    var a: Double = 0.0
    for (i in x) {
        a += Math.abs(i)
    }
    return a
}

fun l2Norma(x: MutableList<Double>): Double {
    return Math.sqrt(skalarniProdukt(x, x))
}

fun lBeskonacnoNorma(x: MutableList<Double>): Double? {
    var a: MutableList<Double> = mutableListOf()
    for (i in x) {
        a.add(i)
    }
    return a.max()
}

fun lpNorma(x: MutableList<Double>, p: Int): Double {
    var a: Double = 0.0
    for (i in x) {
        a += Math.pow(Math.abs(i), p.toDouble())
    }
    return Math.pow(a, 1 / p.toDouble())
}

fun skalarniProdukt(a: MutableList<Double>, b: MutableList<Double>): Double {
    var c: Double = 0.0
    for (i in 0 until a.size) {
        c += a[i] * b[i]
    }
    return c
}
