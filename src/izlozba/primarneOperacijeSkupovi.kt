package izlozba

fun main(args: Array<String>) {

}

fun nIntersect(a: MutableList<MutableSet<Int>>): MutableSet<Int> {
    var b: MutableList<MutableSet<Int>> = kreirajSetInListByValue(a)
    var c: MutableSet<Int> = b[0]
    for (i in 1 until b.size) {
        c.intersect(b[i])
    }
    return c
}

fun nUnion(a: MutableList<MutableSet<Int>>): MutableSet<Int> {
    var b: MutableList<MutableSet<Int>> = kreirajSetInListByValue(a)
    var c: MutableSet<Int> = b[0]
    for (i in 1 until b.size) {
        c.union(b[i])
    }
    return c
}

fun nDifference(a: MutableList<MutableSet<Int>>): MutableSet<Int> {
    var b: MutableList<MutableSet<Int>> = kreirajSetInListByValue(a)
    var c: MutableSet<Int> = b[0]
    for (i in 1 until b.size) {
        c.subtract(b[i])
    }
    return c
}

fun nSymmetricDifference(a: MutableList<MutableSet<Int>>): MutableSet<Int> {
    var b: MutableList<MutableSet<Int>> = kreirajSetInListByValue(a)
    var c: MutableSet<Int> = b[0]
    for (i in 1 until b.size) {
        c.union(b[i]).subtract(c.intersect(b[i]))
    }
    return c
}

fun symmetricDifference(a: MutableSet<Int>, b: MutableSet<Int>): Set<Int> {
    var b: MutableSet<Int> = mutableSetOf()
    return a.union(b).subtract(a.intersect(b))
}

fun kreirajSetByValue(A: MutableSet<Int>): MutableSet<Int> {
    var B: MutableSet<Int> = mutableSetOf()
    for (i in A) {
        B.add(i)
    }
    return B
}

fun kreirajSetInSetByValue(A: MutableSet<MutableSet<Int>>): MutableSet<MutableSet<Int>> {
    var B: MutableSet<MutableSet<Int>> = mutableSetOf()
    for (i in A) {
        B.add(kreirajSetByValue(i))
    }
    return B
}

fun kreirajSetInListByValue(A: MutableList<MutableSet<Int>>): MutableList<MutableSet<Int>> {
    var B: MutableList<MutableSet<Int>> = mutableListOf()
    for (i in A) {
        B.add(kreirajSetByValue(i))
    }
    return B
}