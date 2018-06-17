package izlozba.skupovi

import izlozba.*

fun unionIntersectParticijaUnion(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nUnion(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nUnion(a))
        } else {
            b.union(nIntersect(a))
        }
    }
    return b
}

fun unionIntersectParticijaIntersect(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nUnion(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.intersect(nUnion(a))
        } else {
            b.intersect(nIntersect(a))
        }
    }
    return b
}

fun unionIntersectParticijaDifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nUnion(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.subtract(nUnion(a))
        } else {
            b.subtract(nIntersect(a))
        }
    }
    return b
}

fun unionIntersectParticijaSymmetricdifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nUnion(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            symmetricDifference(b, nUnion(a))
        } else {
            symmetricDifference(b, nIntersect(a))
        }
    }
    return b
}
