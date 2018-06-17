package matematika.kombinatorika_vjerojatnost.permutacije

private var v: Int = 1
private var w: Int = 1

fun main(args: Array<String>) {
    println(swapIJPermutacijaPomicanje(mutableListOf(1, 2, 3, 4), 1, 2))
    println("************************************************")
    println(swapIJPermutacija(mutableListOf(0, 1, 2, 3, 4, 5, 6), 5, 2))
    println("************************************************")
    println(sortListFromMinToMax(mutableListOf(3, 1, 5, 4, 2)))
    println("************************************************")
    println(parnostPermutacije(mutableListOf(2, 3, 4, 1)))
}

/**
 * Swap-ati s and na j
 */
private fun swap(L: MutableList<Int>, i: Int, j: Int) {
    var a: Int = L[i]
    L[i] = L[j]
    L[j] = a
//    println(L)
}

/**
 * Ovdje je bas zamjena
 * returna se -1 or 1, ovisno o permutaciji
 * Ovdje je nuzno da permutacija bude oblika [0,1,2,3,4,5...], a ne recimo [1,4,7,14] -> nije istina
 */
private fun swapIJPermutacija(L: MutableList<Int>, i: Int, j: Int): Int {
    if (i > j) {
        for (k in 0 until i - j) {
            swap(L, i - k, i - k - 1)
            w *= -1
        }
        for (k in 0 until i - j - 1) {
            swap(L, j + 1 + k, j + 2 + k)
            w *= -1
        }
    } else if (j > i) {
        for (k in 0 until j - i) {
            swap(L, j - k, j - k - 1)
            w *= -1
        }
        for (k in 0 until j - i - 1) {
            swap(L, i + 1 + k, i + 2 + k)
            w *= -1
        }
    }
    var a: Int = w
    w = 1
    return a
}

/**
 * Swap-ati s and na j, ali tako da se zadrži poredak
 * [1,2,3,4,5] -> [5,1,2,3,4] or [2,3,4,5,1]
 * Ovdje je samo pomicanje na neko mjesto
 * returna se -1 or 1, ovisno o permutaciji
 */
private fun swapIJPermutacijaPomicanje(L: MutableList<Int>, i: Int, j: Int): Int {
    if (i > j) {
        for (k in 0 until i - j) {
            swap(L, i - k, i - k - 1)
            v *= -1
        }
    } else if (j > i) {
        for (k in 0 until j - i) {
            swap(L, i + k, i + k + 1)
            v *= -1
        }
    }
    var a: Int = v
    v = 1
    return a
}

private fun sortListFromMinToMax(L: MutableList<Int>): MutableList<Int> {
    for (i in 0 until L.size) {
        for (j in i + 1 until L.size) {
            if (L[i] > L[j]) {
                swapIJPermutacija(L, i, j)
            }
        }
    }
    return L
}

/**
 * Prema prvom retku sve sortiramo
 * From min to max sortiranje
 * Koristi se kod MnozenjePermutacijaa
 */
fun sortStupciMatricePermutacije(L: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    for (i in 0 until L[0].size) {
        for (j in i + 1 until L[0].size) {
            if (L[0][i] > L[0][j]) {
                for (k in 0 until L.size) {
                    swapIJPermutacija(L[k], i, j)
                }
            }
        }
    }
    return L
}

/**
 * Dakle, o parnosti permutacije reci ce nam koliko swapova moramo odraditi da se vratimo na sortirani niz od min do max
 * Ako je broj swapova paran, onda je permutacija parna, ako je neparan, onda je permutacija neparna!
 */
fun parnostPermutacije(L: MutableList<Int>): Int {
    var a: Int = 1
    for (i in 0 until L.size) {
        for (j in i + 1 until L.size) {
            if (L[i] > L[j]) {
                a *= swapIJPermutacija(L, i, j)
            }
        }
    }
    return a
}

private fun provjeraPermutacije(L: MutableList<Int>) {
    var a: MutableList<Int> = sortListFromMinToMax(L)
    for (i in 0 until a.size) {

    }
}
