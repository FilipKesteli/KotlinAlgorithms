package izlozba.skupovi

import izlozba.*

fun unionSymmetricdifferenceParticijaUnion(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nUnion(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nUnion(a))
        } else {
            b.union(nSymmetricDifference(a))
        }
    }
    return b
}

fun unionSymmetricdifferenceParticijaIntersect(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nUnion(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.intersect(nUnion(a))
        } else {
            b.intersect(nSymmetricDifference(a))
        }
    }
    return b
}

fun unionSymmetricdifferenceParticijaDifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nUnion(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.subtract(nUnion(a))
        } else {
            b.subtract(nSymmetricDifference(a))
        }
    }
    return b
}

fun unionSymmetricdifferenceParticijaSymmetricdifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nUnion(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            symmetricDifference(b, nUnion(a))
        } else {
            symmetricDifference(b, nSymmetricDifference(a))
        }
    }
    return b
}
