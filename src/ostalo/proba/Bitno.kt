package ostalo.proba

fun main(args: Array<String>) {
    println(bitnoVarijacijaSPonavljanjem(3))
    println(bitnoKrajevi(mutableListOf(4, 8, 2, 7, 4, 6)))
    println(generirajListuListi(5, 3))
}

/**
 * Pomocna funkcija generirajListuListi
 */
fun generirajListuListi(n: Int, k: Int): MutableList<MutableList<Int>> {
    var a: MutableList<MutableList<Int>> = mutableListOf()
    for (j in 0 until k) {
        var b: MutableList<Int> = mutableListOf()
        for (i in 0 until n) {
            b.add(i)
        }
        a.add(b)
    }
    return a
}

/**
 * Treba paziti da stavimo b.toMutableList() (pass value, v1 ne address)!!! - zamijenjuje jednu for petlju
 * Ovdje ima hrpa trikova! Bitan algoritam!
 * Varijacije s ponavljanjem n^k
 * TODO Na temelju danih krajeva, izbrojati koliko je koja lista velika and na temelju toga izraditi algoritam
 */
fun bitnoVarijacijaSPonavljanjem(n: Int): MutableList<MutableList<Int>> {
    var a: MutableList<MutableList<Int>> = mutableListOf()
    for (i in 1..n) {
        var b: MutableList<Int> = mutableListOf(0, 0, 0)
        b[0] = i
        for (j in 1..n) {
            b[1] = j
            for (k in 1..n) {
                b[2] = k
                a.add(b.toMutableList())
            }
        }
    }
    return a
}

/**
 * krajevi.size je broj suma!!
 */
fun bitnoKrajevi(krajevi: MutableList<Int>): MutableList<MutableList<Int>> {
    var a: MutableList<MutableList<Int>> = mutableListOf()
    for (kraj in krajevi) {
        var b: MutableList<Int> = mutableListOf()
        for (i in 0 until kraj) {
            b.add(i)
        }
        a.add(b)
    }
    return a
}

/**
 * Pomocna funkcija swap za zamjenu elemenata
 */
fun swap(L: MutableList<Int>, i: Int, j: Int) {
    var a: Int = L[i]
    L[i] = L[j]
    L[j] = a
}