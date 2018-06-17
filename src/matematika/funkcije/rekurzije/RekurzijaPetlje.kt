package matematika.funkcije.rekurzije

// TODO Rekurzija daje na proizvoljnosti lista and funkcija!!!

fun main(args: Array<String>) {
    rekurzijaPetlja1(4)
    println(faktoriela(5))
    println(suma(5))
    println(fibbonacci(3))
    println(fibbonacci(7))
    println("**************Fibb loop******************")
    println(fibbonacciLoop(5))
    println("**************Suma liste*****************")
    println(sumaListe(3, mutableListOf(1, 2, 3, 4)))
    println("**************Suma prvih n clanova proizvoljnog niza*****************")
    var f: (Int) -> Int = { x -> 2 * x + 1 }
    println(sumaProizvoljnogNiza(3, mutableListOf(1, 2, 3, 4), f))
}

/**
 * Suma proizvoljnog niza
 * Rekurzija and Lambda
 */
fun sumaProizvoljnogNiza(n: Int, L: MutableList<Int>, f: (Int) -> Int): Int {
    return if (n == 0) f(L[0]) else f(L[n]) + sumaProizvoljnogNiza(n - 1, L, f)
}

/**
 * n je ovdje velicina liste minus 1
 */
fun sumaListe(n: Int, L: MutableList<Int>): Int {
    return if (n == 0) L[0] else L[n] + sumaListe(n - 1, L)
}

fun faktoriela(n: Int): Int {
    return if (n == 1) 1 else n * factorial(n - 1)
}

fun suma(n: Int): Int {
    return if (n == 1) 1 else n + suma(n - 1)
}

fun fibbonacci(n: Int): Int {
    return when (n) {
        0 -> 0
        1 -> 1
        else -> fibbonacci(n - 1) + fibbonacci(n - 2)
    }
}

/**
 * k je broj krajeva
 */
fun varijacija(krajevi: MutableList<Int>, k: Int): MutableList<MutableList<Int>> {
    var a: MutableList<MutableList<Int>> = mutableListOf()
    if (k == 0) {
        return a
    } else {
        var b: MutableList<Int> = mutableListOf()
        for (i in 1..krajevi[k]) {
            b.add(i)
        }
        a.add(b)
        return varijacija(krajevi, k - 1)
    }
}

private var v2: MutableList<Int> = mutableListOf()
fun fibbonacciLoop(n: Int): Int {
    for (i in 1..n) {
        println(i)
        v2.add(i)
    }
    println(v2)
    return when (n) {
        0 -> 0
        1 -> 1
        else -> fibbonacci(n - 1) + fibbonacci(n - 2)
    }
}

private var v1: MutableList<Int> = mutableListOf()
fun rekurzijaPetlja1(n: Int): Int {
    var b: MutableList<Int> = mutableListOf()
    return if (n == 1) {
        n
    } else {
        for (i in 1..n) {
            println(i)
            v1.add(i)
            b.add(i)
        }
        println(v1)
        println(b)
        n * rekurzijaPetlja1(n - 1)
    }
}




