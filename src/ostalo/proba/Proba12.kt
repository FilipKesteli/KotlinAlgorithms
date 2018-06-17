package ostalo.proba

import matematika.kombinatorika_vjerojatnost.kVarijacijeSPonavljanjem

fun main(args: Array<String>) {
//    println(kVarijacijeBezPonavljanja(3, mutableListOf(1, 2, 3, 4)))
//    println(kVarijacijeBezPonavljanja(2, mutableListOf(1, 2, 3, 4)))

//    println(komb(kVarijacijeSPonavljanjem(2, mutableListOf(1, 2, 3))))
    println(komb(kVarijacijeSPonavljanjem(3, mutableListOf(0, 1))))
    println(komb(kVarijacijeSPonavljanjem(3, mutableListOf(1, 2, 7, 10))))

    println(komb2(kVarijacijeSPonavljanjem(3, mutableListOf(0, 1))))

//    probaMap()
//    probaList()
    probaFor()
}

/**
 * Gledam svaku listu u listi and onda posebno elemente u toj listi
 * TODO Sloziti da nemam null pointer exception - provjera
 * Za sad - provjeri da li je
 */
fun komb(L: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    loop1@ for (i in 0 until L.size) {
        var h: Int = 0
        loop2@ for (j in 0 until L.size) {
            if (i < L.size) {
                if (L[i] != L[j - h]) {
                    var a: MutableMap<Int, Int> = mutableMapOf()
                    var b: MutableMap<Int, Int> = mutableMapOf()
                    for (k in 0 until L[0].size) {
                        if (!a.containsKey(L[i][k])) {
                            a.put(L[i][k], 1)
                        } else {
                            var c: Int? = a.get(L[i][k])!! + 1
                            a.put(L[i][k], c!!)
                        }
                        if (!b.containsKey(L[j - h][k])) {
                            b.put(L[j - h][k], 1)
                        } else {
                            var c: Int? = b.get(L[j - h][k])!! + 1
                            b.put(L[j - h][k], c!!)
                        }
                    }
                    if (a == b) {
                        L.removeAt(j - h)
                        h += 1
                    }
                }
            }
        }
    }
    return L
}

fun komb2(L: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    loop1@ for (i in 0 until L.size) {
        loop2@ for (j in 0 until L.size) {
            if (L[i] != L[j]) {
                var a: MutableMap<Int, Int> = mutableMapOf()
                var b: MutableMap<Int, Int> = mutableMapOf()
                for (k in 0 until L[0].size) {
                    if (!a.containsKey(L[i][k])) {
                        a.put(L[i][k], 1)
                    } else {
                        var c: Int? = a.get(L[i][k])!! + 1
                        a.put(L[i][k], c!!)
                    }
                    if (!b.containsKey(L[j][k])) {
                        b.put(L[j][k], 1)
                    } else {
                        var c: Int? = b.get(L[j][k])!! + 1
                        b.put(L[j][k], c!!)
                    }
                }
                if (a == b) {
                    L.removeAt(j)
                    return komb2(L)
                }
            }
        }
    }
    return L
}

/**
 * Dakle, dvije mape su usporedive - to je odlicno!!
 */
fun probaMap() {
    var a: MutableMap<Int, Int> = mutableMapOf()
    var b: MutableMap<Int, Int> = mutableMapOf()
    a.put(1, 2)
    a.put(3, 7)
    b.put(3, 7)
    b.put(1, 2)
    if (a == b) {
        println("ok")
    }
    println(a.keys)
    println(a.values)
}

fun probaList() {
    var a: MutableList<Int> = mutableListOf(1, 2, 3)
    var b: MutableList<Int> = mutableListOf(3, 2, 1)
    if (a == b) {
        println("ok lista")
    }
}

fun probaFor() {
    var L: MutableList<Int> = mutableListOf(1, 2, 3)
    for (i in 0 until L.size) {
        for (j in 0 until L.size) {
            L.add(259)
        }
    }
}
