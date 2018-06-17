package ostalo.proba

/**
 * Brojimo koliko se koraka izvrsi, ovisno o algoritmu
 */
fun main(args: Array<String>) {
    println(factorial1(5))
    println(euclid(30, 20))
    println(expon(6))
    println(fibbonacci1(5))
    println(fibbonacci2(7))
    println(v)
    v.clear()
}

/**
 * Faktorijela
 */
private fun factorial1(n: Int): Int {
    return if (n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

/**
 * Najveci djelitelj
 */
private fun euclid(n: Int, m: Int): Int {
    return if (m == 0) {
        n
    } else {
        euclid(m, n % m)
    }
}

/**
 * T(n) = 2 * T(n-1)
 */
private fun expon(n: Int): Int {
    return if (n == 1) {
        1
    } else {
        2 * expon(n - 1)
    }
}

/**
 * Obican rekurzivni algoritam
 */
private fun fibbonacci1(n: Int): Int {
    return if (n == 0) {
        0
    } else if (n == 1) {
        1
    } else {
        fibbonacci1(n - 1) + fibbonacci1(n - 2)
    }
}

private var v: MutableList<Int> = (-50..0).toMutableList()

/**
 * Dynamic programming
 */
private fun fibbonacci2(n: Int): Int {
    return when {
        n == 0 -> 0
        n == 1 -> 1
        v[n] > 0 -> v[n]
        else -> {
            v[n] = fibbonacci2(n - 1) + fibbonacci2(n - 2)
            v[n]
        }
    }
}