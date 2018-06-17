package izlozba.logika

import izlozba.*

fun andOrVektorAkko(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akko(b, nAnd(a))
        } else {
            b = akko(b, nOr(a))
        }
    }
    return b
}

fun andOrVektorAkoonda(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akoOnda(b, nAnd(a))
        } else {
            b = akoOnda(b, nOr(a))
        }
    }
    return b
}

fun andOrVektorAnd(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = and(b, nAnd(a))
        } else {
            b = and(b, nOr(a))
        }
    }
    return b
}

fun andOrVektorOr(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = or(b, nAnd(a))
        } else {
            b = or(b, nOr(a))
        }
    }
    return b
}
