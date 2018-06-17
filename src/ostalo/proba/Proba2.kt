package ostalo.proba

fun main(args: Array<String>) {
    println(varijacijaSPonavljanjem(2))
    println(varijacijaSPonavljanjem(3))
    println(zamjenaElemenataUListi())
    println(listaNula(7))
    println("*******************Provjera liste*********************")
    println(provjeraListe(mutableListOf(1, 1, 1, 4)))
}

/**
 * Treba paziti da stavimo b.toMutableList() (pass value, v1 ne address)!!! - zamijenjuje jednu for petlju
 * Ovdje ima hrpa trikova! Bitan algoritam!
 * Varijacije s ponavljanjem n^k
 */
fun varijacijaSPonavljanjem(n: Int): MutableList<MutableList<Int>> {
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

fun provjeraListe(L: MutableList<Int>) {
    var a: MutableList<Int> = L.toMutableList()
    println(a)
    for (i in 0 until a.size) {
        for (j in i + 1 until a.size) {
            if (a[i] == a[j]) {
                println("da")
                a[j] = -1
//                println(v1[j])
            }
            println(a[i])
//            println(v1[j])
        }
    }
    println(a)
}

fun varijacijeBezPonavljanja(n: Int) {
    val a: MutableList<MutableList<Int>> = varijacijaSPonavljanjem(n)
    for (i in 0 until a.size) {
        for (j in 0..2) {
            if (false) {
            }
        }
    }
}

fun zamjenaElemenataUListi(): MutableList<Int> {
    var a: MutableList<Int> = mutableListOf(1, 2, 3, 4)
    a[2] = 3532
    return a
}

fun listaNula(n: Int): MutableList<Int> {
    var a: MutableList<Int> = mutableListOf()
    for (i in 1..n) {
        a.add(0)
    }
    return a
}

/*
for (j in 1..n) {
    if (b.size < 2) {
        b.add(j)
    } else {
        b[1] = j
    }
    for (k in 1..n) {
        if (b.size < 3) {
            b.add(k)
            v1.add(b)
        } else {
            b[2] = k
            v1.add(b)
        }
    }
}*/
