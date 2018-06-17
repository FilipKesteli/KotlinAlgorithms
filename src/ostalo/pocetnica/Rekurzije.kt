package ostalo.pocetnica

fun main(args: Array<String>) {
    println("5! = ${fact(5)}")
    println(dvofaktorijela(5))
    println(dvofaktorijela(6))
    println(trofaktorijela(6))
    println(m_terofaktorijela(6, 4))
    println(m_terofaktorijela(17, 7))
}

/**
 * Ovo je funkcija unutar koje je rekurzivna funkcija
 */
fun fact(x: Int): Int {
    tailrec fun factTail(y: Int, z: Int): Int {
        if (y == 0) return z
        else return factTail(y - 1, y * z)
    }
    return factTail(x, 1)
}

//fun fact1(x: Double, )

fun dvofaktorijela(n: Int): Int {
    tailrec fun fact2tail(i: Int, j: Int): Int {
        println(i)
        return if (i <= 0) j
        else fact2tail(i - 2, i * j)
    }
    return fact2tail(n, 1)
}

fun trofaktorijela(n: Int): Int {
    tailrec fun fact2tail(i: Int, j: Int): Int {
        println(i)
        return if (i <= 0) j
        else fact2tail(i - 3, i * j)
    }
    return fact2tail(n, 1)
}

fun m_terofaktorijela(n: Int, m: Int): Int {
    tailrec fun fact2tail(i: Int, j: Int): Int {
        println(i)
        return if (i <= 0) j
        else fact2tail(i - m, i * j)
    }
    return fact2tail(n, 1)
}

