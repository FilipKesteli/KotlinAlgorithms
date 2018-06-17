package matematika.teorija_grafova

fun main(args: Array<String>) {
    grafFail(4, mutableListOf())
    println(graf(4, 4, mutableListOf()))
}

/**
 * Ovdje pomazu samo pomocne liste
 * Idem iznutra prema van, jer ne znam dohvacati proizvoljni element izvana prema unutra
 * Krece se od n==m, pa sve do m==1
 */
private fun graf(n: Int, m: Int, L: MutableList<Any>): MutableList<Any> {
    if (n == m) {
        var a: MutableList<Double> = mutableListOf()
        return graf(n, m - 1, L)
    } else if (m == 1) {
        var b: MutableList<Any> = mutableListOf()
        b.add(L)
        return b
    } else {
        var b: MutableList<Any> = mutableListOf()
        b.add(L)
        return graf(n, m - 1, b)
    }
}

/**
 * n-dubok graf
 * Ovo je slozeno za Double, a lako se promijeni na Int
 */
private fun grafFail(n: Int, L: MutableList<Any>): MutableList<Any> {
    if (n == 1) {
        var b: MutableList<Double> = mutableListOf(1.0, 2.0, 3.0)
        L.add(b)
        println(L)
        return L
    } else {
        var a: MutableList<Any> = mutableListOf()
        L.add(a)
        return grafFail(n - 1, L)
    }
}

