package izlozba.skupovi

import izlozba.*

fun symmetricdifferenceDifferenceParticijaUnion(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nSymmetricDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nSymmetricDifference(a))
        } else {
            b.union(nDifference(a))
        }
    }
    return b
}

fun symmetricdifferenceDifferenceParticijaIntersect(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nSymmetricDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.intersect(nSymmetricDifference(a))
        } else {
            b.intersect(nDifference(a))
        }
    }
    return b
}

fun symmetricdifferenceDifferenceParticijaDifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nSymmetricDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.subtract(nSymmetricDifference(a))
        } else {
            b.subtract(nDifference(a))
        }
    }
    return b
}

fun symmetricdifferenceDifferenceParticijaSymmetricdifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nSymmetricDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            symmetricDifference(b, nSymmetricDifference(a))
        } else {
            symmetricDifference(b, nDifference(a))
        }
    }
    return b
}
