package izlozba.skupovi

import izlozba.*

fun symmetricdifferenceIntersectParticijaUnion(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nSymmetricDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nSymmetricDifference(a))
        } else {
            b.union(nIntersect(a))
        }
    }
    return b
}

fun symmetricdifferenceIntersectParticijaIntersect(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nSymmetricDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.intersect(nSymmetricDifference(a))
        } else {
            b.intersect(nIntersect(a))
        }
    }
    return b
}

fun symmetricdifferenceIntersectParticijaDifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nSymmetricDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.subtract(nSymmetricDifference(a))
        } else {
            b.subtract(nIntersect(a))
        }
    }
    return b
}

fun symmetricdifferenceIntersectParticijaSymmetricdifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nSymmetricDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            symmetricDifference(b, nSymmetricDifference(a))
        } else {
            symmetricDifference(b, nIntersect(a))
        }
    }
    return b
}
