package jesen2018.linear_programming

fun main(args: Array<String>) {

}

fun sumaDouble(a: MutableList<Double>): Double {
    var b: Double = 0.0
    for (i in a) {
        b += i
    }
    return b
}

fun nPowOfList(a: MutableList<Double>, n: Double): MutableList<Double> {
    var b: MutableList<Double> = mutableListOf()
    for (i in a) {
        b.add(Math.pow(i, n))
    }
    return b
}

fun norm(a: MutableList<Double>): Double {
    return Math.pow(sumaDouble(nPowOfList(a, 2.0)), 0.5)
}

/**
 * Dobra fora s provjerom da li je nešto korektno s malom greškom
 * Ne možemo u numeričkoj analizi imati čiste vrijednosti među decimalnim brojevima - uvijek postoji greška
 */
fun isValueWithError(x: Double, y: Double, e: Double): Boolean {
    return Math.abs(x - y) < e
}

fun isInClosedBall(a: MutableList<Double>): Boolean {
    return norm(a) <= 1
}

/**
 * Trazimo nasumicne brojeve
 */
fun isInOpenBall(a: MutableList<Double>): Boolean {
    return norm(a) < 1
}

/**
 * Umjesto norm(a) == 1.0
 */
fun isUnitSphere(a: MutableList<Double>): Boolean {
    return isValueWithError(norm(a), 1.0, 0.001)
}

