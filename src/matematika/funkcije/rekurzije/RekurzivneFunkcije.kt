package matematika.funkcije.rekurzije

fun main(args: Array<String>) {
    println(mTeroNfaktorijela(5, 1))
    println(nQfaktorijela(3.0))
    println(faktorijelaForPetlja(5))
    println(faktorijela(6))
    println(recBrojVarijacijaBezPonavljanja(5, 3))
    println(recLista(5))
    println(factorial(6))
//    println(fibonacci(5, 0, 1))
}

fun faktorijela(n: Int): Int {
    tailrec fun fact2tail(i: Int, j: Int): Int {
//        println(and)
        return if (i <= 0) j
        else fact2tail(i - 1, i * j)
    }
    return fact2tail(n, 1)
}

fun factorial(n: Int): Int {
    return if (n == 1) n else n * factorial(n - 1)
}

/*fun fibonacci(n: Int, v1: Int, b: Int): Int {
    return if (n == 0) b else fibonacci(n - 1, v1 + b, v1)
}*/

fun faktorijelaForPetlja(n: Int): Int {
    var a: Int = 1
    for (i in n downTo 1) {
        a *= i
    }
    return a
}

fun mTeroNfaktorijela(n: Int, m: Int): Int {
    tailrec fun fact2tail(i: Int, j: Int): Int {
//        println(and)
        return if (i <= 0) j
        else fact2tail(i - m, i * j)
    }
    return fact2tail(n, 1)
}

/**
 * Jos nije kak se spada
 */
fun nQfaktorijela(n: Double): Double {
    tailrec fun fact2tail(i: Double, j: Double): Double {
        println(i)
        return if (i == (n / 1.0)) j
        else fact2tail((i / (i - 1)), i * j)
    }
    return fact2tail(n, 1.0) / n
}

fun nPutaForPetlja(i: Int, k: Int, n: Int, L: MutableList<Int>) {
    var a: MutableList<MutableList<Int>> = mutableListOf()
    tailrec fun rec(a1: Int, a2: Int) {
        return if (false) {
            for (j in i..k) {

            }
        } else return rec(n, 1)
    }
    return rec(n, 1)
}

/**
 * n! / k!
 */
fun recBrojVarijacijaBezPonavljanja(n: Int, k: Int): Int {
    println("**********************************")
    tailrec fun rec(i: Int, j: Int): Int {
        println(i)
        return if (i <= k) j
        else rec(i - 1, i * j)
    }
    return rec(n, 1)
}

fun recLista(n: Int): Int {
    println("**********************************")
    var b: MutableList<MutableList<Int>> = mutableListOf()
    tailrec fun rec(i: Int, j: Int): Int {
        var a: MutableList<Int> = mutableListOf()
        if (i <= 0) {
            return j
        } else {
            a.add(i)
            b.add(a)
            println(b)
            return rec(i - 1, i * j)
        }
    }
    return rec(n, 1)
}

