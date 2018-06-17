package izlozba

// TODO Sloziti klasu kojoj su objekti logicki elementi

fun main(args: Array<String>) {
    println(or(0, 1))
    println(or(0, or(0, or(0, 0))))
    println(akoOnda(or(1, 0), and(akko(0, 1), ne(0))))
}

//Napisati matematika.funkcije koje predstavljaju logiku prvog reda
//Napisati matematika.funkcije za svaku od operacija (množenje and zbrajanje elemenata Booleove algebre)

fun or(a: Int, b: Int): Int {
    return if (a == 1 && b == 1)
        1
    else if (a == 1 && b == 0)
        1
    else if (a == 0 && b == 1)
        1
    else if (a == 0 && b == 0)
        0
    else
        -1
}

fun and(a: Int, b: Int): Int {
    return if (a == 1 && b == 1)
        1
    else if (a == 1 && b == 0)
        0
    else if (a == 0 && b == 1)
        0
    else if (a == 0 && b == 0)
        0
    else
        -1
}

fun akoOnda(a: Int, b: Int): Int {
    return if (a == 1 && b == 1)
        1
    else if (a == 1 && b == 0)
        0
    else if (a == 0 && b == 1)
        1
    else if (a == 0 && b == 0)
        1
    else
        -1
}

fun ne(a: Int): Int {
    return when (a) {
        1 -> 0
        0 -> 1
        else -> -1
    }
}

fun akko(a: Int, b: Int): Int {
    return if (a == 1 && b == 1)
        1
    else if (a == 1 && b == 0)
        0
    else if (a == 0 && b == 1)
        0
    else if (a == 0 && b == 0)
        1
    else
        -1
}

/**
 * Tautologija
 */
fun binarnaFunkcija1111(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        1
    else if (p == 1 && q == 0)
        1
    else if (p == 0 && q == 1)
        1
    else if (p == 0 && q == 0)
        1
    else
        -1
}

/**
 * Disjunkcija (p or q)
 */
fun binarnaFunkcija1110(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        1
    else if (p == 1 && q == 0)
        1
    else if (p == 0 && q == 1)
        1
    else if (p == 0 && q == 0)
        0
    else
        -1
}

/**
 * Konverzna implikacija
 */
fun binarnaFunkcija1101(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        1
    else if (p == 1 && q == 0)
        1
    else if (p == 0 && q == 1)
        0
    else if (p == 0 && q == 0)
        1
    else
        -1
}

/**
 * Implikacija
 */
fun binarnaFunkcija1011(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        1
    else if (p == 1 && q == 0)
        0
    else if (p == 0 && q == 1)
        1
    else if (p == 0 && q == 0)
        1
    else
        -1
}

/**
 * Inkompatibilnost (p | q)
 */
fun binarnaFunkcija0111(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        0
    else if (p == 1 && q == 0)
        1
    else if (p == 0 && q == 1)
        1
    else if (p == 0 && q == 0)
        1
    else
        -1
}

/**
 * p
 */
fun binarnaFunkcija1100(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        1
    else if (p == 1 && q == 0)
        1
    else if (p == 0 && q == 1)
        0
    else if (p == 0 && q == 0)
        0
    else
        -1
}

/**
 * q
 */
fun binarnaFunkcija1010(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        1
    else if (p == 1 && q == 0)
        0
    else if (p == 0 && q == 1)
        1
    else if (p == 0 && q == 0)
        0
    else
        -1
}

/**
 * Ekvivalencija (p <=> q)
 */
fun binarnaFunkcija1001(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        1
    else if (p == 1 && q == 0)
        0
    else if (p == 0 && q == 1)
        0
    else if (p == 0 && q == 0)
        1
    else
        -1
}

/**
 * Alternativa (or p or q)
 */
fun binarnaFunkcija0110(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        0
    else if (p == 1 && q == 0)
        1
    else if (p == 0 && q == 1)
        1
    else if (p == 0 && q == 0)
        0
    else
        -1
}

/**
 * Ne q
 */
fun binarnaFunkcija0101(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        0
    else if (p == 1 && q == 0)
        1
    else if (p == 0 && q == 1)
        0
    else if (p == 0 && q == 0)
        1
    else
        -1
}

/**
 * Ne p
 */
fun binarnaFunkcija0011(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        0
    else if (p == 1 && q == 0)
        0
    else if (p == 0 && q == 1)
        1
    else if (p == 0 && q == 0)
        1
    else
        -1
}

/**
 * Konjunkcija (p and q)
 */
fun binarnaFunkcija1000(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        1
    else if (p == 1 && q == 0)
        0
    else if (p == 0 && q == 1)
        0
    else if (p == 0 && q == 0)
        0
    else
        -1
}

/**
 * Direktna neimplikacija
 */
fun binarnaFunkcija0100(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        0
    else if (p == 1 && q == 0)
        1
    else if (p == 0 && q == 1)
        0
    else if (p == 0 && q == 0)
        0
    else
        -1
}

/**
 * Konverzna neimplikacija
 */
fun binarnaFunkcija0010(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        0
    else if (p == 1 && q == 0)
        0
    else if (p == 0 && q == 1)
        1
    else if (p == 0 && q == 0)
        0
    else
        -1
}

/**
 * Binegacija
 */
fun binarnaFunkcija0001(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        0
    else if (p == 1 && q == 0)
        0
    else if (p == 0 && q == 1)
        0
    else if (p == 0 && q == 0)
        1
    else
        -1
}

/**
 * Kontradikcija
 */
fun binarnaFunkcija0000(p: Int, q: Int): Int {
    return if (p == 1 && q == 1)
        0
    else if (p == 1 && q == 0)
        0
    else if (p == 0 && q == 1)
        0
    else if (p == 0 && q == 0)
        0
    else
        -1
}