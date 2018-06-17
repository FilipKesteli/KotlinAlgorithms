package matematika.kombinatorika_vjerojatnost.proba

private var v1: MutableList<MutableList<Int>> = mutableListOf()

fun main(args: Array<String>) {
    permutacija1(5)
    println(v2)
    v2.clear()
    println(v3)
    v3.clear()
    println("**************************************************")
    permutacija2(6, mutableListOf(1, 2, 3, 4, 5, 6))
    println(v4)
    println(v4.size)
    println(v4[v4.size - 1])
    println(v4[v4.size - 1].size)
    v4.clear()
}

var v2: MutableList<MutableList<Int>> = mutableListOf()
var v3: MutableList<MutableList<Int>> = mutableListOf()
/**
 * TODO Mogu uvesti pomocnu varijablu, break and continue u for petlji
 * TODO Možda složiti prazne liste od točnog broja elemenata koliko tražim, pa onda tek staviti elemente unutra!!!
 * v4 je gornja pomocna varijabla kojom se određuje kad se treba izaći van iz petlje
 * Idemo najprije izvrtjeti n! rekurzija, odnosno kreirati n! listi
 */
private fun permutacija1(n: Int) {
    if (n == 0) {
        return
    }
    var b: MutableList<Int> = mutableListOf()
    for (i in 1..n) {
        var a: MutableList<Int> = mutableListOf()
        a.add(i)
        v2.add(a)
        b.add(i - 1)
    }
    v3.add(b)
    permutacija1(n - 1)
}

var v4: MutableList<MutableList<Int>> = mutableListOf()
var v5: MutableList<MutableList<Int>> = mutableListOf()

/**
 * Svejedno hoćemo li staviti da rekurzija ide do n==1 or do n==2
 * L nam uopće nije ni potreban, dovoljan je v4
 * TODO Sada složiti algoritam koji iskorištava ovu pametnu rekurziju koja se vrti točno n! puta koliko ima and članova!
 * TODO Sada kada smo identificirali na koji se način rekurzija vrti točno n! puta, sad to iskoristiti
 * m je pomoćna fiksna varijabla koja služi za pamćenje pravog broja
 */
private fun permutacija2(n: Int, L: MutableList<Int>) {
    if (n == 1) {
        return
    }
    var a: MutableList<Int> = mutableListOf()
    for (i in 1..L.size) {
        for (j in 1..n - 1) {
            a.add(j)
        }
    }
    v4.add(a)
    permutacija2(n - 1, v4[v4.size - 1])
}

private fun permutacija3(n: Int, m: Int, L: MutableList<Int>) {
    if (n == 1) {
        return
    }
    var a: MutableList<Int> = mutableListOf()
    var b: MutableList<Int> = mutableListOf()
    for (i in 1..L.size) {
        for (k in m downTo 1) {
            b.add(k)/*if () {
            }*/

        }
        for (j in 1..n - 1) {
            a.add(j)
        }
    }
    v4.add(a)
    permutacija2(n - 1, v4[v4.size - 1])
}

private fun swap(L: MutableList<Int>, i: Int, j: Int) {
    var a: Int = L[i]
    L[i] = L[j]
    L[j] = a
}

private fun nIndeksa(krajevi: MutableList<Int>) {
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
    matematika.linearna_algebra.sume.nIndeksa(b)
}
