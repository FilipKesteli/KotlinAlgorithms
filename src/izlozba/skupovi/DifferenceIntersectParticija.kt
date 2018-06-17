package izlozba.skupovi

import izlozba.*

fun differenceIntersectParticijaUnion(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nDifference(a))
        } else {
            b.union(nIntersect(a))
        }
    }
    return b
}

fun differenceIntersectParticijaIntersect(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.intersect(nDifference(a))
        } else {
            b.intersect(nIntersect(a))
        }
    }
    return b
}

fun differenceIntersectParticijaDifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.subtract(nDifference(a))
        } else {
            b.subtract(nIntersect(a))
        }
    }
    return b
}

fun differenceIntersectParticijaSymmetricdifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            symmetricDifference(b, nDifference(a))
        } else {
            symmetricDifference(b, nIntersect(a))
        }
    }
    return b
}
