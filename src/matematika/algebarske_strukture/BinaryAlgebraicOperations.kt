package matematika.algebarske_strukture

fun main(args: Array<String>) {
    println(isPartition(*arrayOf(mutableSetOf(1, 2, 3), mutableSetOf(1, 2, 3, 4, 5))))
    println(isPartition(*arrayOf(mutableSetOf(1, 2, 3), mutableSetOf(4, 5))))
    println(isPartition(mutableSetOf(1, 2, 3), mutableSetOf(4, 5), mutableSetOf(6, 7, 8)))
    println(isPartition(mutableSetOf(1, 2, 3), mutableSetOf(4, 5), mutableSetOf(1, 6, 7, 8)))

    var S: MutableList<Int> = mutableListOf(1, 2, 3)
    println(isSymmetric(S, mutableListOf(mutableListOf(1, 2), mutableListOf(3, 2), mutableListOf(2, 1), mutableListOf(2, 3))))
    println(isSymmetric(S, mutableListOf(mutableListOf(1, 2), mutableListOf(3, 2), mutableListOf(2, 1), mutableListOf(2, 3), mutableListOf(1, 4))))
    println(isSymmetric(S, mutableListOf(mutableListOf(1, 2), mutableListOf(3, 2), mutableListOf(2, 1), mutableListOf(2, 3), mutableListOf(1, 3), mutableListOf(3, 1))))
}

/**
 * Skup svih binarnih relacija je input (zapravo uređeni parovi)
 * Zapravo se pitamo je li neki skup R s nekom definiranom relacijom simetričan
 * TODO Moram najprije odrediti neke stvari prije računanja tih relacija
 */
fun isSymmetric(S: MutableList<Int>, R: MutableList<MutableList<Int>>): Boolean {
    /*for (and in 0 until S.size) {
        if (S[and]) {
        }
    }*/
    var b: Int = 0
    loop1@ for (i in 0 until R.size) {
        loop2@ for (j in 0 until R.size) {
            if (i != j && R[i][0] == R[j][1] && R[i][1] == R[j][0]) {
                b += 1
                break@loop2
            }
        }
    }
    return b == R.size
}

/**
 * Provjera je li skup integera particija
 */
fun isPartition(vararg A: MutableSet<Int>): Boolean {
    var b: MutableSet<Int> = mutableSetOf()
    for (i in 0 until A.size) {
        for (j in 0 until A.size) {
            if (i != j && A[i].intersect(A[j]) != b) {
                return false
            }
        }
    }
    return true
}

fun isReflexive() {

}

fun postoji() {

}

/**
 * Trebao bih imati Boolean izraze kao output
 */
fun zaSvaki(a: MutableList<Int>) {
    for (i in a) {

    }
}

fun isAntisymmetric() {

}

fun isTransitive() {

}

fun isEquivalenceRelation() {

}