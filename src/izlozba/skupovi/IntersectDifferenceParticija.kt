package izlozba.skupovi

import izlozba.*

fun intersectDifferenceParticijaUnion(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nIntersect(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nIntersect(a))
        } else {
            b.union(nDifference(a))
        }
    }
    return b
}

fun intersectDifferenceParticijaIntersect(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nIntersect(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.intersect(nIntersect(a))
        } else {
            b.intersect(nDifference(a))
        }
    }
    return b
}

fun intersectDifferenceParticijaDifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nIntersect(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.subtract(nIntersect(a))
        } else {
            b.subtract(nDifference(a))
        }
    }
    return b
}

fun intersectDifferenceParticijaSymmetricdifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nIntersect(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            symmetricDifference(b, nIntersect(a))
        } else {
            symmetricDifference(b, nDifference(a))
        }
    }
    return b
}
