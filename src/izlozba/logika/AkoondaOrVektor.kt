package izlozba.logika

import izlozba.*

fun AkoondaOrVektorAkko(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akko(b, nAkoOnda(a))
        } else {
            b = akko(b, nOr(a))
        }
    }
    return b
}

fun AkoondaOrVektorAkoonda(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akoOnda(b, nAkoOnda(a))
        } else {
            b = akoOnda(b, nOr(a))
        }
    }
    return b
}

fun AkoondaOrVektorAnd(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = and(b, nAkoOnda(a))
        } else {
            b = and(b, nOr(a))
        }
    }
    return b
}

fun AkoondaOrVektorOr(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = or(b, nAkoOnda(a))
        } else {
            b = or(b, nOr(a))
        }
    }
    return b
}
