package matematika.kombinatorika_vjerojatnost.kombinacije

fun main(args: Array<String>) {
//    kombinacijeBezPonavljanja2(3, mutableListOf(1, 2, 3, 4, 5))
    println(Comb.comb(3, 5))
    var a = Comb.comb(3, 5)
}

fun kombinacijeBezPonavljanja2(k: Int, L: MutableList<Int>) {
    var a: MutableList<Int> = mutableListOf()
    for (i in 0 until L.size - k + 2) {
        for (j in i until L.size) {

        }
    }
}