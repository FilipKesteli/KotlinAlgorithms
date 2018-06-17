package izlozba.logika

import izlozba.*

fun orAkkoVektorAkko(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akko(b, nOr(a))
        } else {
            b = akko(b, nAkko(a))
        }
    }
    return b
}

fun orAkkoVektorAkoonda(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akoOnda(b, nOr(a))
        } else {
            b = akoOnda(b, nAkko(a))
        }
    }
    return b
}

fun orAkkoVektorAnd(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = and(b, nOr(a))
        } else {
            b = and(b, nAkko(a))
        }
    }
    return b
}

fun orAkkoVektorOr(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = or(b, nOr(a))
        } else {
            b = or(b, nAkko(a))
        }
    }
    return b
}



