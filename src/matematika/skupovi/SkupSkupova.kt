package matematika.skupovi

import matematika.kombinatorika_vjerojatnost.kKombinacijeBezPonavljanja

fun main(args: Array<String>) {
    println(particijskiSkup(mutableListOf(1, 2, 3)))
    println(particijskiSkup(mutableListOf(1, 2, 3, 4, 5)))
}

/**
 * TODO Imamo za sad jednoclane skupove, sad krecemo na dvoclane and viseclane
 */
private fun particijskiSkup(L: MutableList<Int>): MutableList<MutableList<Int>> {
    var b: MutableList<MutableList<Int>> = mutableListOf()
    for (i in L.size downTo 1) {
        var a: MutableList<MutableList<Int>> = kKombinacijeBezPonavljanja(i, L)
        for (j in a) {
            b.add(j)
        }
    }
    b.add(mutableListOf())
    return b
}