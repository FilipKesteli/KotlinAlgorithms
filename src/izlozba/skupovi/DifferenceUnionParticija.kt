package izlozba.skupovi

import izlozba.*

fun differenceUnionParticijaUnion(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.union(nDifference(a))
        } else {
            b.union(nUnion(a))
        }
    }
    return b
}

fun differenceUnionParticijaIntersect(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.intersect(nDifference(a))
        } else {
            b.intersect(nUnion(a))
        }
    }
    return b
}

fun differenceUnionParticijaDifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            b.subtract(nDifference(a))
        } else {
            b.subtract(nUnion(a))
        }
    }
    return b
}

fun differenceUnionParticijaSymmetricdifference(a: MutableList<MutableSet<Int>>, s: Int): MutableSet<Int> {
    var b: MutableSet<Int> = nDifference(a)
    for (i in 1 until 2 * s) {
        if (i.rem(2) == 0) {
            symmetricDifference(b, nDifference(a))
        } else {
            symmetricDifference(b, nUnion(a))
        }
    }
    return b
}
