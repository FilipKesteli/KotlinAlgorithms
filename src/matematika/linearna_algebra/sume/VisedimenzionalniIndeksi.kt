package matematika.linearna_algebra.sume

private var v1: MutableList<MutableList<Int>> = mutableListOf()
private var vSuma: Int = 0
private var vUmnozak: Int = 1

fun main(args: Array<String>) {
    nIndeksa(mutableListOf(2, 1, 2, 1))
    println(v1.size)
    v1.clear()
    println("**************************************")
    var g: (MutableList<Int>) -> Int = { L -> sumaUListi(0, 1, L) }
    println(nIndeksaSumaIUmnozak(mutableListOf(1, 1, 1), g))
    println(v1.size)
    println(vSuma)
    println(vUmnozak)
}

/**
 * Ovo je algoritam za stvaranje liste koja ima sve moguće kombinacije indeksa
 * Ključ je u listi v1
 * TODO Napraviti posebnu datoteku za ovaj algoritam OK
 * TODO Umetnuti funkciju kao parametar and napraviti algoritam za općenito množenje and zbrajanje elemenata matematika.funkcije proizvoljno varijabli
 * TODO Poopćiti na tenzore kad složim permutacije - složiti permutacije indeksa, odnosno ovih lista
 * TODO Poopćiti na Double
 * TODO Krenuti na slučajne varijable
 */
fun nIndeksa(krajevi: MutableList<Int>) {
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
    for (i in 1 until v1[v1.size - 1].size) {
        if (v1[v1.size - 1][i] < 0) {
            return
        }
    }
    loop1@ for (i in b.size - 1 downTo 0) {
        if (b[i] == 0) {
            b[i] = v1[0][i]
//            b[and - 1] += -1
            continue@loop1
        }
        if (b[i] > 0) {
            b[i] += -1
            break@loop1
        }
    }
    nIndeksa(b)
}

/**
 * Funkciju ovdje držim konstantnom
 * Suma niza više varijabli
 * Ovu funkciju koristimo kad već imamo definiran niz
 */
fun nIndeksaSumaIUmnozak(krajevi: MutableList<Int>, f: (MutableList<Int>) -> Int) {
    var a: Int = 0
    var b: MutableList<Int> = krajevi.toMutableList()
    var c: MutableList<Int> = b.toMutableList()
    v1.add(c)
    println(v1)
    vSuma += f(c)
    vUmnozak *= f(c)
    for (kraj in krajevi) {
        a += kraj
    }
    if (a == 0) {
        return
    }
    for (i in 1 until v1[v1.size - 1].size) {
        if (v1[v1.size - 1][i] < 0) {
            return
        }
    }
    loop1@ for (i in b.size - 1 downTo 0) {
        if (b[i] == 0) {
            b[i] = v1[0][i]
//            b[and - 1] += -1
            continue@loop1
        }
        if (b[i] > 0) {
            b[i] += -1
            break@loop1
        }
    }
    nIndeksaSumaIUmnozak(b, f)
}

/**
 * Krece od k
 * Step je s
 * Ovdje zapravo definiram matematika.funkcije posebnih vrsti koje su zapravo općeniti članovi
 * Ovo je zapravo pomoćna funkcija za definiranje lambda matematika.funkcije više varijabli
 */
fun sumaUListi(k: Int, s: Int, lista: MutableList<Int>): Int {
    var a: Int = 0
    if (k < lista.size) {
        for (i in k until lista.size step s) {
            a += lista[i]
        }
        return a
    } else {
        throw Throwable("!!!Treba popraviti argumente!!!")
    }
}

/**
 * Krece od k
 * Step je s
 * Ovo je kao faktorijela!
 */
fun umnozakUListi(k: Int, s: Int, lista: MutableList<Int>): Int {
    var a: Int = 1
    if (k < lista.size) {
        for (i in k until lista.size step s) {
            a *= lista[i]
        }
        return a
    } else {
        throw Throwable("!!!Treba popraviti argumente!!!")
    }
}