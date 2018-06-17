package izlozba.logika

import izlozba.*

fun andAkkoVektorAkko(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akko(b, nAnd(a))
        } else {
            b = akko(b, nAkko(a))
        }
    }
    return b
}

fun andAkkoVektorAkoonda(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akoOnda(b, nAnd(a))
        } else {
            b = akoOnda(b, nAkko(a))
        }
    }
    return b
}

fun andAkkoVektorAnd(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = and(b, nAnd(a))
        } else {
            b = and(b, nAkko(a))
        }
    }
    return b
}

fun andAkkoVektorOr(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = or(b, nAnd(a))
        } else {
            b = or(b, nAkko(a))
        }
    }
    return b
}
