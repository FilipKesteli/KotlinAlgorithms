package izlozba.uredaj_skupova

fun main(args: Array<String>) {

}

/**
 * Trik negacijom
 */
fun isUredaj1(a: MutableSet<Int>, b: MutableSet<Int>): Boolean {
    for (i in a) {
        for (j in b) {
            if (i > j) {
                return false
            }
        }
    }
    return true
}

/**
 * Ovo je bas komplementaran slucaj gornjem - koliko mi je sad tu algoritam pojasnio stvari, stvarno nevjerojatno!
 * Ovdje ne idem negacijom
 */
fun isUredaj2(a: MutableSet<Int>, b: MutableSet<Int>): Boolean {
    for (i in a) {
        for (j in b) {
            if (i <= j) {
                return true
            }
        }
    }
    return false
}

/**
 * Ovdje ne ide bez brojaca
 * Takoder upotrebljavam trik negacije
 */
fun isUredaj3(a: MutableSet<Int>, b: MutableSet<Int>): Boolean {
    loop1@ for (i in a) {
        var c: Int = 0
        loop2@ for (j in b) {
            if (j < i) {
                c++
            }
        }
        if (c == b.size) {
            return false
        }
    }
    return true
}

fun isUredaj4(a: MutableSet<Int>, b: MutableSet<Int>): Boolean {
    loop1@ for (i in a) {
        var c: Int = 0
        loop2@ for (j in b) {
            if (j >= i) {
                c++
            }
        }
        if (c == b.size) {
            return true
        }
    }
    return false
}

fun isUredaj5(a: MutableSet<Int>, b: MutableSet<Int>): Boolean {
    return isUredaj3(a, b) && isUredaj3(b, a)
}

fun isUredaj6(a: MutableSet<Int>, b: MutableSet<Int>): Boolean {
    return isUredaj4(a, b) && isUredaj4(b, a)
}

fun isUredaj7(a: MutableSet<Int>, b: MutableSet<Int>): Boolean {
    return isUredaj4(a, b) && isUredaj3(b, a)
}

fun isUredaj8(a: MutableSet<Int>, b: MutableSet<Int>): Boolean {
    return isUredaj3(a, b) && isUredaj4(b, a)
}