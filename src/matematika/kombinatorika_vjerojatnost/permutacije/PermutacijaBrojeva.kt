package matematika.kombinatorika_vjerojatnost.permutacije

fun main(args: Array<String>) {
    perm(mutableListOf(1, 2, 3, 4))
}

/**
 * Ovu funkciju pozivamo kao korisnici dajući joj neki niz brojeva
 * Ona to pretvara u pomocnu listu and poziva rec funkciju koja swapa elemente
 * Primajuća funkcija
 */
private fun perm(L: MutableList<Int>) {
    val n = L.size
    val a: MutableList<Int> = mutableListOf()
    for (i in 0 until n) {
        a.add(L[i])
    }
    perm(a, n)
}

/**
 * Ovdje swapamo - glavna funkcija (Davajuća funkcija)
 */
private fun perm(a: MutableList<Int>, n: Int) {
    if (n == 1) {
        println(a)
        return
    }
    for (i in 0 until n) {
        swap(a, i, n - 1)
        perm(a, n - 1)
        swap(a, i, n - 1)
    }
}

private fun swap(a: MutableList<Int>, i: Int, j: Int) {
    val c: Int = a[i]
    a[i] = a[j]
    a[j] = c
}