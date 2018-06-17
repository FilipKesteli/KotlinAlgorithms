package izlozba.logika

import izlozba.*

fun AkkoOrVektorAkko(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akko(b, nAkko(a))
        } else {
            b = akko(b, nOr(a))
        }
    }
    return b
}

fun AkkoOrVektorAkoonda(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akoOnda(b, nAkko(a))
        } else {
            b = akoOnda(b, nOr(a))
        }
    }
    return b
}

fun AkkoOrVektorAnd(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = and(b, nAkko(a))
        } else {
            b = and(b, nOr(a))
        }
    }
    return b
}

fun AkkoOrVektorOr(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = or(b, nAkko(a))
        } else {
            b = or(b, nOr(a))
        }
    }
    return b
}
