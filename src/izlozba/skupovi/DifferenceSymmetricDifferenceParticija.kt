package izlozba.skupovi

import izlozba.*

fun differenceSymmetricdifferenceParticijaUnion(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nDifference(a))
        } else {
            b.union(nSymmetricDifference(a))
        }
    }
    return b
}

fun differenceSymmetricdifferenceParticijaIntersect(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.intersect(nDifference(a))
        } else {
            b.intersect(nSymmetricDifference(a))
        }
    }
    return b
}

fun differenceSymmetricdifferenceParticijaDifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.subtract(nDifference(a))
        } else {
            b.subtract(nSymmetricDifference(a))
        }
    }
    return b
}

fun differenceSymmetricdifferenceParticijaSymmetricdifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            symmetricDifference(b, nDifference(a))
        } else {
            symmetricDifference(b, nSymmetricDifference(a))
        }
    }
    return b
}
