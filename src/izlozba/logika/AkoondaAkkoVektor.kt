package izlozba.logika

import izlozba.*

fun AkoondaAkkoVektorAkko(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akko(b, nAkoOnda(a))
        } else {
            b = akko(b, nAkko(a))
        }
    }
    return b
}

fun AkoondaAkkoVektorAkoonda(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akoOnda(b, nAkoOnda(a))
        } else {
            b = akoOnda(b, nAkko(a))
        }
    }
    return b
}

fun AkoondaAkkoVektorAnd(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = and(b, nAkoOnda(a))
        } else {
            b = and(b, nAkko(a))
        }
    }
    return b
}

fun AkoondaAkkoVektorOr(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = or(b, nAkoOnda(a))
        } else {
            b = or(b, nAkko(a))
        }
    }
    return b
}
