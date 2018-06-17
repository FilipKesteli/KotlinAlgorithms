package izlozba.skupovi

import izlozba.*

fun symmetricdifferenceUnionParticijaUnion(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nSymmetricDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nSymmetricDifference(a))
        } else {
            b.union(nUnion(a))
        }
    }
    return b
}

fun symmetricdifferenceUnionParticijaIntersect(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nSymmetricDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.intersect(nSymmetricDifference(a))
        } else {
            b.intersect(nUnion(a))
        }
    }
    return b
}

fun symmetricdifferenceUnionParticijaDifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nSymmetricDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.subtract(nSymmetricDifference(a))
        } else {
            b.subtract(nUnion(a))
        }
    }
    return b
}

fun symmetricdifferenceUnionParticijaSymmetricdifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nSymmetricDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            symmetricDifference(b, nSymmetricDifference(a))
        } else {
            symmetricDifference(b, nUnion(a))
        }
    }
    return b
}
