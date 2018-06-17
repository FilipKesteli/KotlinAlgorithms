package matematika.kombinatorika_vjerojatnost.proba

import matematika.kombinatorika_vjerojatnost.kVarijacijeSPonavljanjem

fun main(args: Array<String>) {
    println(kKombinacijeSPonavljanjem(3, mutableListOf(0, 1)))
    println(kKombinacijeSPonavljanjem(4, mutableListOf(0, 1, 2, 3, 4)).size)
    println(kKombinacijeSPonavljanjemAlgoritam(kVarijacijeSPonavljanjem(3, mutableListOf(0, 1))))
}

/**
 * Gledam svaku listu u listi and onda posebno elemente u toj listi
 * TODO Sloziti da nemam null pointer exception - provjera
 * Za sad - provjeri da li je...
 * Algoritam koji pretvara varijacije s ponavljanjem u kombinacije s ponavljanjem
 * Algoritam za kreiranje multiskupa od zadanog skupa jednako velikih skupova
 */
fun kKombinacijeSPonavljanjemAlgoritam(L: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
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

/**
 * Rekurzivni algoritam za kombinacije s ponavljanjem
 * Odlicna caka dok imamo petlju promijenjive velicine kojoj se remove-aju or add-aju elementi s obzirom na uvjete
 * Brutalna caka za kombinacije - uvodenje mape u igru
 */
fun kKombinacijeSPonavljanjemAlgoritam2(L: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
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
                    return kKombinacijeSPonavljanjemAlgoritam2(L)
                }
            }
        }
    }
    return L
}

fun kKombinacijeSPonavljanjem(k: Int, L: MutableList<Int>): MutableList<MutableList<Int>> {
    return kKombinacijeSPonavljanjemAlgoritam(kVarijacijeSPonavljanjem(k, L))
}