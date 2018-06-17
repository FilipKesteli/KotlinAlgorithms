package ostalo.proba

import matematika.kombinatorika_vjerojatnost.kVarijacijeBezPonavljanja

fun main(args: Array<String>) {
    pr9()
}

private fun pr9() {
    var a: MutableList<MutableList<Int>> =
            mutableListOf(
                    mutableListOf(1, 2),
                    mutableListOf(2, 1)
            )
    println(a.intersect(a))
}