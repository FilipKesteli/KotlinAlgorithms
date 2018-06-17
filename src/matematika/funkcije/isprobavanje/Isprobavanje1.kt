package matematika.funkcije.isprobavanje

/**
 * Radim s integerima! To treba naglasiti!
 */
fun main(args: Array<String>) {

}

/**
 * D je domena
 */
fun isZaSvakiIzjava(D: MutableSet<Int>, P: (Int) -> (Int)): Boolean {
    for (x in D) {
        if (P(x) == 0) {
            return false
        }
    }
    return true
}

fun isPostojiIzjava(D: MutableSet<Int>, P: (Int) -> Int): Boolean {
    var a: Int = 0
    for (x in D) {
        if (P(x) == 0) {
            a++
        }
    }
    if (D.size == a) {
        return false
    } else {
        return true
    }
}

fun isZaSvakiIzjavaNegacijska(D: MutableSet<Int>, P: (Int) -> (Int)): Boolean {
    for (x in D) {
        if (P(x) == 1) {
            return false
        }
    }
    return true
}

fun isPostojiIzjavaNegacijska(D: MutableSet<Int>, P: (Int) -> Int): Boolean {
    var a: Int = 0
    for (x in D) {
        if (P(x) == 1) {
            a++
        }
    }
    if (D.size == a) {
        return false
    } else {
        return true
    }
}

fun isRedukcija(P: (Int) -> (Int), D: MutableSet<Int>) {

}

