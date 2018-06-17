package izlozba.brojevi

import izlozba.dijeljenje
import izlozba.produkt

fun main(args: Array<String>) {

}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun dijeljenjeProduktBrojZbroj(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b += dijeljenje(a)
        } else {
            b += produkt(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun dijeljenjeProduktBrojRazlika(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b -= dijeljenje(a)
        } else {
            b += produkt(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun dijeljenjeProduktBrojMnozenje(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b *= dijeljenje(a)
        } else {
            b += produkt(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun dijeljenjeProduktBrojDijeljenje(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b /= dijeljenje(a)
        } else {
            b += produkt(a)
        }
    }
    return b
}

