package izlozba.logika

import izlozba.*

fun AkkoAndVektorAkko(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akko(b, nAkko(a))
        } else {
            b = akko(b, nAnd(a))
        }
    }
    return b
}

fun AkkoAndVektorAkoonda(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = akoOnda(b, nAkko(a))
        } else {
            b = akoOnda(b, nAnd(a))
        }
    }
    return b
}

fun AkkoAndVektorAnd(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = and(b, nAkko(a))
        } else {
            b = and(b, nAnd(a))
        }
    }
    return b
}

fun AkkoAndVektorOr(a: MutableList<Int>, s: Int): Int {
    var b: Int = nAkko(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b = or(b, nAkko(a))
        } else {
            b = or(b, nAnd(a))
        }
    }
    return b
}
