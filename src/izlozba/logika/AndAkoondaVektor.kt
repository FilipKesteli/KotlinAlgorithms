package izlozba.logika

import izlozba.*

fun andAkoondaVektorAkko(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akko(b, nAnd(a))
        } else {
            b = akko(b, nAkoOnda(a))
        }
    }
    return b
}

fun andAkoondaVektorAkoonda(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akoOnda(b, nAnd(a))
        } else {
            b = akoOnda(b, nAkoOnda(a))
        }
    }
    return b
}

fun andAkoondaVektorAnd(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = and(b, nAnd(a))
        } else {
            b = and(b, nAkoOnda(a))
        }
    }
    return b
}

fun andAkoondaVektorOr(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = or(b, nAnd(a))
        } else {
            b = or(b, nAkoOnda(a))
        }
    }
    return b
}
