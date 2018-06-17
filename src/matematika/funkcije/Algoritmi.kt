package matematika.funkcije

fun main(args: Array<String>) {
    println(rekurzijaPlusLista(4, 2))
    println(rekurzijaListSetMapWhenGenerics(6, 2))
    println(rekurzijaListSetMapWhenGenerics2(6.5, 3.1))

    val multiply = { num1: Int -> num1 * 2 }
    val numList = arrayOf(1, 2, 3, 4, 5)
    mathOnList(numList, multiply)

    val mul1 = { num1: Int -> num1 * 2.0 }
    val mul2 = { num1: Int -> num1 * 2 }
    val nLista = arrayOf(1, 2, 3, 4, 5)
    genericsFjaUFji(numList, 1.0, mul1)
    genericsFjaUFji(numList, 1.0, mul2)
}

fun ms_terofaktorijela(n: Int, m: Int): Int {
    tailrec fun fact2tail(i: Int, j: Int): Int {
        println(i)
        return if (i <= 0) j
        else fact2tail(i - m, i * j)
    }
    return fact2tail(n, 1)
}

/**
 * When ne ide jer ne moze pratiti izraze nejednakosti
 */
fun rekurzijaPlusWhen(n: Int, m: Int) {
    tailrec fun recWhen(i: Int, j: Int): Int {
        return when (i) {
            2 -> 5
//            <=0 -> 2
            else -> recWhen(2, 4)
        }
    }
}

fun rekurzijaPlusLista(n: Int, m: Int): Int {
    tailrec fun recList(i: Int, j: Int): Int {
        return if (i <= 0) j
        else recList(i - m, i * j)
    }
    return recList(n, 1)
}

fun <T> kvadratnaFunkcija(a: T, b: T, c: T): List<T> {
    var lista: List<T> = listOf(a, b, c)
    println("${a}x^2+${b}x+$c")
    return lista
}

fun n_terofaktorijela(n: Int, m: Int): Int {
    tailrec fun fact2tail(i: Int, j: Int): Int {
        println(i)
        return if (i <= 0) j
        else fact2tail(i - m, i * j)
    }
    return fact2tail(n, 1)
}

fun <T> rekurzijaListSetMapWhenGenerics(n: T, m: T): Unit {
    val lista: MutableList<T> = mutableListOf(n, m)
    val skup: MutableSet<T> = mutableSetOf()
    val mapa: MutableMap<String, T> = mutableMapOf()
    if ((n is Int) && (m is Int)) {
        n_terofaktorijela(n, m)
    } else {
        println("$n and $m nisu tipa int or double")
    }
}

fun <T> rekurzijaListSetMapWhenGenerics2(n: T, m: T): Int {
    val lista: MutableList<T> = mutableListOf(n, m)
    val skup: MutableSet<T> = mutableSetOf()
    val mapa: MutableMap<String, T> = mutableMapOf()
    val x: Int
    x = if ((n is Int) && (m is Int)) {
        tailrec fun fact2tail(i: Int, j: Int): Int {
            println(i)
            return if (i <= 0) j
            else fact2tail(i - m, i * j)
        }
        fact2tail(n, 1)
    } else {
        println("$n and $m nisu tipa int or double")
        -1
    }
    return x
}

fun mathOnList(numList: Array<Int>, myFunc: (Int) -> Int) {
    for (num in numList) {
        println("MathOnList ${myFunc(num)}")
    }
}

fun <T1, T2> genericsFjaUFji(numList: Array<T1>, flag: T2, f: (T1) -> (T2)): T2 {
    return if (!numList.isEmpty() && numList[0] is Int && f(numList[0]) is Double) {
        for (num in numList) {
            println("$num-ti broj u funkciji od liste: ${f(num)}")
        }
        f(numList[0])
    } else {
        println("Nije dobar unos")
        flag
    }
}