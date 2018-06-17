package matematika.kombinatorika_vjerojatnost

private var v: MutableList<MutableList<Int>> = mutableListOf()

fun main(args: Array<String>) {
    nKartezijevProdukt(mutableListOf(2, 1, 2, 1))
    println(v.size)
    v.clear()
}

/**
 * Ovo je algoritam za stvaranje liste koja ima sve moguće kombinacije indeksa
 * Ključ je u listi v1
 * TODO Napraviti posebnu datoteku za ovaj algoritam
 * TODO Umetnuti funkciju kao parametar and napraviti algoritam za općenito množenje and zbrajanje elemenata matematika.funkcije proizvoljno varijabli
 * TODO Poopćiti na tenzore kad složim permutacije - složiti permutacije indeksa, odnosno ovih lista
 * TODO Poopćiti na Double
 * TODO Krenuti na slučajne varijable
 * Ovdje je INPUT zapravo broj elemenata pojedine sume - genijalno!
 * OUTPUT je popis svih kartezijevih produkata
 */
fun nKartezijevProdukt(krajevi: MutableList<Int>) {
    var a: Int = 0
    var b: MutableList<Int> = krajevi.toMutableList()
    var c: MutableList<Int> = b.toMutableList()
    v.add(c)
    println(v)
    for (kraj in krajevi) {
        a += kraj
    }
    if (a == 0) {
        return
    }
    for (i in 1 until v[v.size - 1].size) {
        if (v[v.size - 1][i] < 0) {
            return
        }
    }
    loop1@ for (i in b.size - 1 downTo 0) {
        if (b[i] == 0) {
            b[i] = v[0][i]
//            b[and - 1] += -1
            continue@loop1
        }
        if (b[i] > 0) {
            b[i] += -1
            break@loop1
        }
    }
    nKartezijevProdukt(b)
}
