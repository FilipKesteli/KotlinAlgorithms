package ostalo.proba

private var v1: MutableList<MutableList<Int>> = mutableListOf()
var v2: MutableList<MutableList<Int>> = mutableListOf()

fun main(args: Array<String>) {
    blagaPermutacija(3, mutableListOf(1, 2, 3))
    var a: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    swap(a, 0, 4)
    println(a)
    println("********************************")
    probaSwap(a, 0, 4)
    unitRekurzija2(5, a)
}

/**
 * Lista je velika n-1
 * return ovdje znači da se izbacujemo iz matematika.funkcije
 */
fun unitRekurzija2(n: Int, L: MutableList<Int>) {
    var a: MutableList<Int> = L.toMutableList()
    if (n == 0) {
        println(v2)
        return
    }
    for (i in 1 until a.size) {
        var a: Int = L[i]
        L[i] = L[n-1]
        L[n-1] = a
        v2.add(L)
    }
}

/**
 * Kad ne želimo sumu nekog niza, već nešto drugo
 */
fun unitRekurzija(n: Int) {
    return if (n == 0) {

    } else {
        unitRekurzija(n - 1)
    }
}

/**
 * Ovdje definiramo funkciju tipa Unit (iliti void)
 */
fun blagaPermutacija(n: Int, L: MutableList<Int>) {
    var a: MutableList<Int> = mutableListOf()
    return if (n == 1) {
        println("Gotovo")
        println(v1)
        println(v1.size)
    } else {
        for (i in 1 until L.size step n - 1) {
            for (j in 1 until L.size step n - 1) {
                swap(L, i, j)
                v1.add(L)
            }
        }
        blagaPermutacija(n - 1, L)
    }
}


/*
fun sumaProizvoljnogVisedimenzionalnogNiza(n: Int, L2: MutableList<Int>, f:(MutableList<Int>) -> Int): Int {
    return if (n == 0) {

    }
}*/

/*fun varijacija(n: Int, k: Int) {
    if () {
    }
}*/

fun sumaProizvoljnogNiza(n: Int, L: MutableList<Int>, f: (Int) -> Int): Int {
    return if (n == 0) f(L[0]) else f(L[n]) + matematika.funkcije.rekurzije.sumaProizvoljnogNiza(n - 1, L, f)
}

fun probaSwap(L: MutableList<Int>, i: Int, j: Int) {
    var b: MutableList<Int> = L.toMutableList()
    swap(b, i, j)
    println(b)
}
