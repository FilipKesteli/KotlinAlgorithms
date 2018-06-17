package izlozba.logika

import izlozba.*

fun AkoondaAndVektorAkko(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akko(b, nAkoOnda(a))
        } else {
            b = akko(b, nAnd(a))
        }
    }
    return b
}

fun AkoondaAndVektorAkoonda(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akoOnda(b, nAkoOnda(a))
        } else {
            b = akoOnda(b, nAnd(a))
        }
    }
    return b
}

fun AkoondaAndVektorAnd(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = and(b, nAkoOnda(a))
        } else {
            b = and(b, nAnd(a))
        }
    }
    return b
}

fun AkoondaAndVektorOr(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = or(b, nAkoOnda(a))
        } else {
            b = or(b, nAnd(a))
        }
    }
    return b
}
