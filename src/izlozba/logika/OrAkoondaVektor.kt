package izlozba.logika

import izlozba.*

fun orAkoondaVektorAkko(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akko(b, nOr(a))
        } else {
            b = akko(b, nAkoOnda(a))
        }
    }
    return b
}

fun orAkoondaVektorAkoonda(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akoOnda(b, nOr(a))
        } else {
            b = akoOnda(b, nAkoOnda(a))
        }
    }
    return b
}

fun orAkoondaVektorAnd(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = and(b, nOr(a))
        } else {
            b = and(b, nAkoOnda(a))
        }
    }
    return b
}

fun orAkoondaVektorOr(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = or(b, nOr(a))
        } else {
            b = or(b, nAkoOnda(a))
        }
    }
    return b
}
