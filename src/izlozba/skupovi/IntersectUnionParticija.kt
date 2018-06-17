package izlozba.skupovi

import izlozba.*

fun intersectUnionParticijaUnion(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nIntersect(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nIntersect(a))
        } else {
            b.union(nUnion(a))
        }
    }
    return b
}

fun intersectUnionParticijaIntersect(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nIntersect(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.intersect(nIntersect(a))
        } else {
            b.intersect(nUnion(a))
        }
    }
    return b
}

fun intersectUnionParticijaDifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nIntersect(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.subtract(nIntersect(a))
        } else {
            b.subtract(nUnion(a))
        }
    }
    return b
}

fun intersectUnionParticijaSymmetricdifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nIntersect(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            symmetricDifference(b, nIntersect(a))
        } else {
            symmetricDifference(b, nUnion(a))
        }
    }
    return b
}
