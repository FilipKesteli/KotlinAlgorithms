package izlozba.brojevi

import izlozba.produkt
import izlozba.razlika

fun main(args: Array<String>) {

}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun razlikaProduktBrojZbroj(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b += razlika(a)
        } else {
            b += produkt(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun razlikaProduktBrojRazlika(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b -= razlika(a)
        } else {
            b -= produkt(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun razlikaProduktBrojMnozenje(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b *= razlika(a)
        } else {
            b *= produkt(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun razlikaProduktBrojDijeljenje(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b /= razlika(a)
        } else {
            b /= produkt(a)
        }
    }
    return b
}
