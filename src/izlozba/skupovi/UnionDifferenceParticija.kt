package izlozba.skupovi

import izlozba.*

fun unionDifferenceParticijaUnion(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nUnion(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nUnion(a))
        } else {
            b.union(nDifference(a))
        }
    }
    return b
}

fun unionDifferenceParticijaIntersect(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nUnion(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.intersect(nUnion(a))
        } else {
            b.intersect(nDifference(a))
        }
    }
    return b
}

fun unionDifferenceParticijaDifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nUnion(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.subtract(nUnion(a))
        } else {
            b.subtract(nDifference(a))
        }
    }
    return b
}

fun unionDifferenceParticijaSymmetricdifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nUnion(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            symmetricDifference(b, nUnion(a))
        } else {
            symmetricDifference(b, nDifference(a))
        }
    }
    return b
}
