package izlozba.logika

import izlozba.*

fun orAndVektorAkko(a: MutableList<Int>, s: Int): Int {
    var b: Int = nOr(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akko(b, nOr(a))
        } else {
            b = akko(b, nAnd(a))
        }
    }
    return b
}

fun orAndVektorAkoonda(a: MutableList<Int>, s: Int): Int {
    var b: Int = nOr(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akoOnda(b, nOr(a))
        } else {
            b = akoOnda(b, nAnd(a))
        }
    }
    return b
}

fun orAndVektorAnd(a: MutableList<Int>, s: Int): Int {
    var b: Int = nOr(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = and(b, nOr(a))
        } else {
            b = and(b, nAnd(a))
        }
    }
    return b
}

fun orAndVektorOr(a: MutableList<Int>, s: Int): Int {
    var b: Int = nOr(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = or(b, nOr(a))
        } else {
            b = or(b, nAnd(a))
        }
    }
    return b
}



