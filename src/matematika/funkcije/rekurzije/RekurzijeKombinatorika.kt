package matematika.funkcije.rekurzije

private var v1: MutableList<MutableList<Int>> = mutableListOf()
private var v2: MutableList<MutableList<Int>> = mutableListOf()

fun main(args: Array<String>) {
//    swap2(mutableListOf(1, 2, 3, 4))
//    rec1(mutableListOf(2, 2, 2, 2, 2, 2, 2))
//    println(v1)
    rec2(mutableListOf(4, 1, 2))
    println("*******************************")
    rec3(mutableListOf(4, 1, 2))
    println("*******************************")
    rec5(mutableListOf(4, 1, 2))
    println(v1)
    println("*******************************")
    rec3(mutableListOf(2, 1, 1, 2))
    println("*******************************")
    rec6(mutableListOf(4, 1, 2))
    println(v2.size)
    v2.clear()
    rec6(mutableListOf(2, 1, 2, 1))
    println(v2.size)
    v2.clear()
}

/**
 * Ovo je algoritam za stvaranje liste koja ima sve moguće kombinacije indeksa
 * Ključ je u listi v1
 * TODO Napraviti posebnu datoteku za ovaj algoritam
 * TODO Umetnuti funkciju kao parametar and napraviti algoritam za općenito množenje and zbrajanje elemenata matematika.funkcije proizvoljno varijabli
 * TODO Poopćiti na tenzore kad složim permutacije - složiti permutacije indeksa, odnosno ovih lista
 * TODO Poopćiti na Double
 * TODO Krenuti na slučajne varijable
 */
fun rec6(krajevi: MutableList<Int>) {
    var a: Int = 0
    var b: MutableList<Int> = krajevi.toMutableList()
    var c: MutableList<Int> = b.toMutableList()
    v2.add(c)
    println(v2)
    for (kraj in krajevi) {
        a += kraj
    }
    if (a == 0) {
        return
    }
    for (i in 1 until v2[v2.size - 1].size) {
        if (v2[v2.size - 1][i] < 0) {
            return
        }
    }
    loop1@ for (i in b.size - 1 downTo 0) {
        if (b[i] == 0) {
            b[i] = v2[0][i]
//            b[and - 1] += -1
            continue@loop1
        }
        if (b[i] > 0) {
            b[i] += -1
            break@loop1
        }
    }
    rec6(b)
}

fun rec5(krajevi: MutableList<Int>) {
    var a: Int = 0
    var b: MutableList<Int> = krajevi.toMutableList()
    var c: MutableList<Int> = b.toMutableList()
    v1.add(c)
    println(v1)
    for (kraj in krajevi) {
        a += kraj
    }
    if (a == 0) {
        return
    }
    loop1@ for (i in b.size - 1 downTo 0) {
        if (b[i] > 0) {
            b[i] += -1
            break@loop1
        }
    }
    rec5(b)
}


/**
 * Unazad - prirodnije za sumaciju, makar mogu and upotrijebiti funkciju nad listama reverse()
 */
fun rec3(krajevi: MutableList<Int>) {
    var a: Int = 0
    var b: MutableList<Int> = krajevi.toMutableList()
    println(b)
    for (kraj in krajevi) {
        a += kraj
    }
    if (a == 0) {
        return
    }
    loop1@ for (i in krajevi.size - 1 downTo 0) {
        if (b[i] != 0) {
            b[i] += -1
            break@loop1
        }
    }
    rec3(b)
}

/**
 * Trik sa break naredbom je brutalan
 * TODO break and continue su ovdje u rekurziji krucijalni
 */
fun rec2(krajevi: MutableList<Int>) {
    var a: Int = 0
    var b: MutableList<Int> = krajevi.toMutableList()
    println(b)
    for (kraj in krajevi) {
        a += kraj
    }
    if (a == 0) {
        return
    }
    loop1@ for (i in 0 until b.size) {
        if (b[i] != 0) {
            b[i] += -1
            break@loop1
        }
    }
    rec2(b)
}

/**
 * a je pomocna varijabla koja nam govori ima li koji element veci od nula u listi
 * b je pomocna varijabla za prvi and zadnji uvjet
 * c je pomocna varijabla za rekurziju
 * v3 je pomocna varijabla za krajnji return
 */
fun rec1(krajevi: MutableList<Int>): MutableList<Int> {
    var a: Int = 0
    var b: MutableList<Int> = krajevi.toMutableList() //2,2,2   1,1,1   0,0,0
    for (kraj in krajevi) {
        a += kraj
    }
    if (a == 0) {   //6   4   0
        return b
    } else {
        var c: MutableList<Int> = krajevi.toMutableList()   // 2,2,2
        var d: MutableList<Int> = krajevi.toMutableList()   // 2,2,2
        for (i in 0 until c.size) {
            c[i] += -1      //1,1,1
        }
        for (i in 0 until c.size) {
            d.add(b[i] + c[i])      //2+1*7
        }
//        v1.add(v3)
        return rec1(c)      //1,1,1     0,0,0
    }
}

/*fun swap2(L: MutableList<Int>) {
    swap(L, L.size - 1, 0)
    println(L)
}*/

/**
 * Suma proizvoljnog niza
 * Rekurzija and Lambda
 */
fun sumaProizvoljnogNiza2(n: Int, L: MutableList<Int>, f: (Int) -> Int): Int {
    return if (n == 0) f(L[0]) else f(L[n]) + ostalo.proba.sumaProizvoljnogNiza(n - 1, L, f)
}


