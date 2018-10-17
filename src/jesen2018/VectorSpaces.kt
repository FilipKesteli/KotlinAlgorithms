package jesen2018

import matematika.linearna_algebra.matrice.transponiranjeMatrice

fun main(args: Array<String>) {
    var x: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(1.0, 2.0, 3.0), mutableListOf(4.0, 5.0, 6.0))
    println(transponiranjeMatrice(x))
    println(x)
    println(isSetLinearIndependent(x))
}

/**
 * Algoritam za prepoznavanje da li je neki skup linearno nezavisan
 * INPUT: skup vektora istog broja koordinata (skup lista)
 * TODO KORAK1: Postavim linearne jednadžbe i izjednacim zbroj s 0 - zapravo ni ne moram
 * jedino sto algoritamski gledano moram, je napraviti Gaussovu eliminaciju - od prvog elementa na dalje kratiti
 * dok ne skratim jednu jednadzbu u potpunosti - sto znaci da je skup linearno zavisan
 * ako se ne da skratiti, odnosno ako kod skupa npr. 4 vektora, ostane 4,3,2,1 varijabli => skup je linearno nezavisan!
 * TODO KORAK2: Redak matrice a jesu koordinate vektora, a retci vektora b jesu koeficijenti jednadžbi
 * i,j idu po jednadžbama, odnosno koeficijentima kojima kratimo,
 * a k,l idu po jednadzbama, odnosno koeficijentima koje kratimo
 * TODO KORAK3: provjera b[i][j] != 0.0 ide jer ne želimo dijeliti s nulom - to je čitava poanta ovog algoritma
 * TODO KORAK4: ako postoji jednadzba jednaka 0, odnosno redak onda je to
 */
fun isSetLinearIndependent(a: MutableList<MutableList<Double>>): MutableList<MutableList<Double>> {
    var b: MutableList<MutableList<Double>> = transponiranjeMatrice(a)
    for (i in 0 until b.size) {
        for (j in 0 until b[0].size) {
            if (b[i][j] != 0.0) {
                for (s in j until b[0].size) {2
                    var c: Double = b[i][j]
                    b[i][s] *= 1 / c
                }
                for (k in i + 1 until b.size) {
                    for (l in 0 until b[0].size) {
                        b[k][l] = b[k][l] - b[i][l] * b[k][l]
                    }
                }
            }
        }
    }
    for (i in 0 until b.size) {
        for (j in 0 until b[0].size) {

        }
    }
    return b
}
