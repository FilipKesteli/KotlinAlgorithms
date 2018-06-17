package matematika.kombinatorika_vjerojatnost.permutacije

fun main(args: Array<String>) {
    heapPermutacije2(3, mutableListOf(1, 2, 3))
    println("*************************")
    println(heapPermutacije(3, mutableListOf(1, 2, 3)))
}

private var v: MutableList<MutableList<Int>> = mutableListOf()

/**
 * Heapov algoritam iz 1963. godine
 * B -> pomocna lista za kraj izvrsavanja algoritma
 */
fun heapPermutacije(n: Int, A: MutableList<Int>): MutableList<MutableList<Int>> {
    if (n == 1) {
        v.add(kreirajListByValue(A))
        var B: MutableList<MutableList<Int>> = v.toMutableList()
        if (v.size == faktoriela(A.size)) {
            v.clear()
        }
        return B
    } else {
        for (i in 0 until n - 1) {
            heapPermutacije(n - 1, A)
            if (isParan(n)) {
                swap(A, i, n - 1)
            } else {
                swap(A, 0, n - 1)
            }
        }
        return heapPermutacije(n - 1, A)
    }
}

fun heapPermutacije2(n: Int, A: MutableList<Int>) {
    var c: MutableList<Int> = mutableListOf()
    for (i in 0 until n) {
        c.add(0)
    }
    println(A)
    var i: Int = 0
    while (i < n) {
        if (c[i] < i) {
            if (isParan(i)) {
                swap(A, 0, i)
            } else {
                swap(A, c[i], i)
            }
            println(A)
            c[i] += 1
            i = 0
        } else {
            c[i] = 0
            i += 1
        }
    }
}

private fun isParan(n: Int): Boolean {
    return n.rem(2) == 0
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

private fun faktoriela(n: Int): Int {
    return if (n == 1) 1 else n * faktoriela(n - 1)
}

fun kreirajListByValue(A: MutableList<Int>): MutableList<Int> {
    var B: MutableList<Int> = mutableListOf()
    for (i in 0 until A.size) {
        B.add(A[i])
    }
    return B
}

fun kreirajListByValueDouble(A: MutableList<Double>): MutableList<Double> {
    var B: MutableList<Double> = mutableListOf()
    for (i in 0 until A.size) {
        B.add(A[i])
    }
    return B
}



