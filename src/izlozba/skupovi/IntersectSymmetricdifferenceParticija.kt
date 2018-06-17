package izlozba.skupovi

import izlozba.*

fun intersectSymmetricdifferenceParticijaUnion(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nIntersect(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nIntersect(a))
        } else {
            b.union(nSymmetricDifference(a))
        }
    }
    return b
}

fun intersectSymmetricdifferenceParticijaIntersect(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nIntersect(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nIntersect(a))
        } else {
            b.union(nSymmetricDifference(a))
        }
    }
    return b
}

fun intersectSymmetricdifferenceParticijaDifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nIntersect(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nIntersect(a))
        } else {
            b.union(nSymmetricDifference(a))
        }
    }
    return b
}

fun intersectSymmetricdifferenceParticijaSymmetricdifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nIntersect(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            symmetricDifference(b, nIntersect(a))
        } else {
            symmetricDifference(b, nSymmetricDifference(a))
        }
    }
    return b
}
