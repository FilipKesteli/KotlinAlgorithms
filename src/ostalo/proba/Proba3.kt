package ostalo.proba

fun main(args: Array<String>) {
    println("**************Presjek lista*****************")
    var b1: MutableList<Int> = mutableListOf(1, 2, 2)
    var b2: MutableList<Int> = mutableListOf(1, 1, 2)
    println(b1)
    println(b1.intersect(b2))
    println(b1.intersect(b1))

    println("*************Proba lambda izraza*****************")
    var c1: MutableList<Int> = mutableListOf(1, 1, 2)
    var c2: MutableList<Int> = mutableListOf(1, 1, 2)
    println(c1)
    println(c1.distinct())

    println("*************Aritmeticki niz*****************")
    var d1: MutableList<Int> = mutableListOf(5, 6, 4, 8)
    var f1: (MutableList<Int>) -> Int = { simboli -> 3 }
    println(nAritNiz(d1, f1))

    println("*************Rekurzija rec*****************")
    recProba2(5)
}

fun recProba2(n: Int): Int {
    var a: Int = 0
    return if (n == 1) n else {
        for (i in 1..5) {
            a += i
        }
        println(a)
        n * factorial(n - 1)
    }
}

/**
 * v1 je veličina liste krajevi - korisnik treba paziti!
 * Na temelju danih krajeva, izbrojati koliko je koja lista velika and na temelju toga izraditi algoritam
 */
fun recAritNiz(a: Int, b: Int, krajevi: MutableList<Int>): Int {
    var c: MutableList<MutableList<Int>> = mutableListOf()
    var d: Int = krajevi.size
    if (a < 0) {
        return b
    } else {
        for (s1 in krajevi) {
            for (s2 in krajevi) {
                for (i in 0 until s1) {
                    for (j in 0 until s2) {

                    }
                    c[b].add(2)
                }
            }
        }
        return recAritNiz(a, b - 1, krajevi)
    }
}

fun factorial(n: Int): Int {
    return if (n == 1) n else n * factorial(n - 1)
}

fun recProba(n: Int): Int {
    return if (n == 1) n else n * factorial(n - 2)
}

/**
 * krajevi.size je broj suma!!
 */
fun forPetlja2(krajevi: MutableList<Int>): MutableList<MutableList<Int>> {
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

fun nAritNiz(krajevi: MutableList<Int>, f: (MutableList<Int>) -> Int): MutableList<MutableList<Int>> {
    var a: MutableList<MutableList<Int>> = mutableListOf()
    for (kraj in krajevi) {
        var b: MutableList<Int> = mutableListOf()
        for (i in 0 until kraj) {
            b.add(i)
        }
        a.add(b)
    }

    for (i in a) {
        for (j in i) {

        }
    }

    return a
}

fun varijacijaSPonavljanjem2(n: Int): MutableList<MutableList<Int>> {
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
