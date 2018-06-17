package matematika.skupovi

fun main(args: Array<String>) {
    var a1: MutableSet<Int> = mutableSetOf(1, 2, 3)
    var a2: MutableSet<Int> = mutableSetOf(2, 3, 4, 5)
    var a3: MutableSet<Int> = mutableSetOf(5, 6)
    var b1: MutableSet<MutableSet<Int>> = mutableSetOf(a1, a2)
    var b2: MutableSet<MutableSet<Int>> = mutableSetOf(a1, a2, a3)
    var c1: MutableList<Int> = mutableListOf(2, 1, 3)
    var c2: MutableList<Int> = mutableListOf(2, 3, 2)
    var d1: MutableSet<MutableList<Int>> = mutableSetOf(c1, c2)
    var d2: MutableSet<MutableList<Int>> = mutableSetOf(c1)

    println("****************Skupovi skupova******************")
    println(b1.union(b2))
    println(b1.intersect(b2))
//    println(b1.filter {  })
//    println(b1.filterIndexed { index, mutableSet ->  })
    println(b1.distinct())
    println("***************Skupovi listi*******************")
    println(d1.union(d2))
    println(d1.intersect(d2))
    println("***************Moji unija and presjek*******************")
    println(presjek(a1, a2))
    println(unija(a1, a2))
}

fun unija(S1: MutableSet<Int>, S2: MutableSet<Int>): Set<Int> {
    return S1.union(S2)
}

fun presjek(S1: MutableSet<Int>, S2: MutableSet<Int>): Set<Int> {
    return S1.intersect(S2)
}

/**
 * Nema potrebe kad postoji biblioteka za tu operaciju!
 */
fun presjekLista(S1: MutableSet<Int>, S2: MutableSet<Int>): Set<Int> {
    return S1
}