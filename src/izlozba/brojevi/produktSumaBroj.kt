package izlozba.brojevi

import izlozba.produkt
import izlozba.suma

fun main(args: Array<String>) {

}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun produktSumaBrojZbroj(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b += produkt(a)
        } else {
            b += suma(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun produktSumaBrojRazlika(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b -= produkt(a)
        } else {
            b -= suma(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun produktSumaBrojMnozenje(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b *= produkt(a)
        } else {
            b *= suma(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun produktSumaBrojDijeljenje(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (and in 0 until 2 * s) {
        if (and.rem(2) == 0) {
            b /= produkt(a)
        } else {
            b /= suma(a)
        }
    }
    return b
}




