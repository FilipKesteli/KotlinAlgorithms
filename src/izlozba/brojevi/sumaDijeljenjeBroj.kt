package izlozba.brojevi

import izlozba.dijeljenje
import izlozba.suma

fun main(args: Array<String>) {

}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun sumaDijeljenjeBrojZbroj(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b += suma(a)
        } else {
            b += dijeljenje(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun sumaDijeljenjeBrojRazlika(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b -= suma(a)
        } else {
            b -= dijeljenje(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun sumaDijeljenjeBrojMnozenje(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b *= suma(a)
        } else {
            b *= dijeljenje(a)
        }
    }
    return b
}

/**
 * Iskombiniranje alternirajućeg zbroja and umnoška
 */
fun sumaDijeljenjeBrojDijeljenje(a: MutableList<Double>, s: Int): Double {
    var b: Double = 0.0
    for (i in 0 until 2 * s) {
        if (i.rem(2) == 0) {
            b /= suma(a)
        } else {
            b /= dijeljenje(a)
        }
    }
    return b
}

