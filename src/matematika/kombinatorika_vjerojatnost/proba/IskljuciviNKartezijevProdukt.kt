package matematika.kombinatorika_vjerojatnost.proba

private var v: MutableList<MutableList<Int>> = mutableListOf()

fun main(args: Array<String>) {
    permutacijeBezP(mutableListOf(3, 3, 3, 3))
    println(v.size)
    println(v)
    v.clear()
}

fun permutacijeBezP(krajevi: MutableList<Int>) {
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
    permutacijeBezP(b)
}

/**
 * Algoritam za permutacije indeksa
 * Ovaj n je samo indikativan parametar koji podsjeća da algoritam treba vratiti permutacije,
 * a ne poseban tip varijacija s ponavljanjem
 * a nam govori da smo došli do zadnjeg elementa u listi liste [0,0,0,0,...,0] jer je jedino zbroj njegovih elemenata jednak 0!
 * Treba mi još jedna varijabla, koju nazivam c kako ne bih imao pointere... koji su ovdje na b
 * v[0][i] zapravo govori da je
 * parametar krajevi mora sadržavati posljednji element, recimo [3,3,3,3,3]
 */
fun iskljuciviNKartezijevProdukt(n: Int, krajevi: MutableList<Int>) {
    var a: Int = krajevi.sum()
    var b: MutableList<Int> = krajevi.toMutableList()
    var c: MutableList<Int> = b.toMutableList()
    var d = (1..n).toMutableList()
    println(d)
    /*for (and in 0 until c.size) {
        for (j in 0 until c.size) {
            if (and != j && c[and] == c[j] && a != d.sum()) {
                return
            }
        }
    }*/
    /*if (a != d.sum()) {
    }*/
    v.add(c)
    println(v)
    if (a == n) {
        return
    }
    loop1@ for (i in b.size - 1 downTo 0) {
        if (b[i] == 1) {
            b[i] = v[0][i]
            continue@loop1
        }
        if (b[i] > 1) {
            b[i] += -1
            break@loop1
        }
    }
    iskljuciviNKartezijevProdukt(n, b)
}





