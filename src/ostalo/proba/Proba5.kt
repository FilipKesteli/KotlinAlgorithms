package ostalo.proba

private var v1: MutableList<MutableList<Int>> = mutableListOf()

fun main(args: Array<String>) {
//    swap2(mutableListOf(1, 2, 3, 4))
//    rec1(mutableListOf(2, 2, 2, 2, 2, 2, 2))
//    println(v1)
    rec2(mutableListOf(4, 1, 2))
    println("*******************************")
    rec3(mutableListOf(4, 1, 2))
    println("*******************************")
//    rec4(mutableListOf(4, 1, 2))
}

fun rec4(krajevi: MutableList<Int>) {
    var a: Int = 0
    var b: MutableList<Int> = krajevi.toMutableList()
    println(b)
    for (i in 0 until b.size) {
        if (b[i] == 1) {
            a += 1
        }
    }
    if (a == b.size) {
        return
    }
    loop1@ for (i in 0 until krajevi.size) {
        if (krajevi[i] != 0) {
            b[i] += -1
            break@loop1
        }
    }
    rec4(b)
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
        v1.add(d)
        return rec1(c)      //1,1,1     0,0,0
    }
}

fun swap2(L: MutableList<Int>) {
    swap(L, L.size - 1, 0)
    println(L)
}

/**
 * Suma proizvoljnog niza
 * Rekurzija and Lambda
 */
fun sumaProizvoljnogNiza2(n: Int, L: MutableList<Int>, f: (Int) -> Int): Int {
    return if (n == 0) f(L[0]) else f(L[n]) + sumaProizvoljnogNiza(n - 1, L, f)
}
