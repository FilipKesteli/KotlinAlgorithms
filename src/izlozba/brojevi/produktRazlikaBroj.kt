package izlozba.brojevi

import izlozba.produkt
import izlozba.razlika

fun main(args: Array<String>) {

}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun produktRazlikaBrojZbroj(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b += produkt(a)
        } else {
            b += razlika(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun produktRazlikaBrojRazlika(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b -= produkt(a)
        } else {
            b -= razlika(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun produktRazlikaBrojMnozenje(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b *= produkt(a)
        } else {
            b *= razlika(a)
        }
    }
    return b
}

fun produktRazlikaBrojDijeljenje(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b /= produkt(a)
        } else {
            b /= razlika(a)
        }
    }
    return b
}