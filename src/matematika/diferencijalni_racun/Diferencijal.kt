package matematika.diferencijalni_racun

import matematika.linearna_algebra.matrice.transponiranjeMatrice

fun main(args: Array<String>) {

}

/**
 * Jacobijeva matrica je matricno-numericka reprezentacija diferencijala funkcije f u tocki a
 * R^n -> R^m (n x m)
 */
fun jacobian(f: (MutableList<Double>) -> (MutableList<Double>), a: MutableList<Double>): MutableList<MutableList<Double>> {
    var b: MutableList<MutableList<Double>> = mutableListOf()
    for (j in 0 until a.size) {
        b.add(parcijalnaDerivacijaVektorskeFunkcijeViseVarijabli(f, j, a, 0.001))
    }
    return transponiranjeMatrice(b)
}

/**
 * Za f: R^n -> R
 * To je transponirani jacobijan
 */
fun gradijent(f: (MutableList<Double>) -> (Double), a: MutableList<Double>): MutableList<Double> {
    var b: MutableList<Double> = mutableListOf()
    for (j in 0 until a.size) {
        b.add(parcijalnaDerivacijaSkalarneFunkcijeViseVarijabli(f, j, a, 0.001))
    }
    return b
}

fun normaLinearnogOperatora(T: MutableList<MutableList<Double>>) {

}

private fun element(x: Double, a: Double, b: Double): Boolean {
    return x > a && x < b
}

/**
 * Osnovna 2-norma ili kvadratna norma vektora
 * TODO Sloziti vektorsku funkciju koja prevodi iz vektora u novi vektor
 */
private fun normaVektora(x: MutableList<Double>): Double {
    var a: MutableList<Double> = mutableListOf()
    for (i in x) {
        a.add(Math.pow(i, 2.0))
    }
    return Math.sqrt(sumaElemenataVektora(a))
}

private fun sumaElemenataVektora(x: MutableList<Double>): Double {
    var a: Double = 0.0
    for (i in x) {
        a += i
    }
    return a
}

fun isDiferencijal() {

}



