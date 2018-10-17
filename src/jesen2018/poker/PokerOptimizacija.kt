package jesen2018.poker

fun main(args: Array<String>) {
//    println(stirlingApproximation(10))
//    println(stirlingFactorialError(10))
//    var a: Double = povrhStirlingDouble(52, 7)
//    println(a)
//    println(povrhObicanDouble(52, 7))

//    println((povrhStirlingDouble(47, 2) - povrhStirlingDouble(38, 2)) / povrhStirlingDouble(47, 2))
//    println((37 * 10 + povrhStirlingDouble(10, 2)) / povrhStirlingDouble(47, 2))
//    println(faktorijelaLong(20))
    var a: Long = povrhVelikiMaliLong(52, 7) //ukupan broj
    println(povrhVelikiMaliLong(52, 7))
    // todo 0.5% šansa da
    println((4 * 13 * 64 * povrhVelikiMaliLong(12, 3)).toDouble() / a.toDouble())
    // todo 27.8% šansa da ću dobiti dva para
    println((36 * 6 * 13 * povrhVelikiMaliLong(44, 3)).toDouble() / a.toDouble())
    // todo 6.4% šansa da ako imam dvije iste boje na početku, da ću imati boju (flush)
    println((povrhVelikiMaliLong(11, 3) * 39 * 19 + povrhVelikiMaliLong(11, 4) * 39 + povrhVelikiMaliLong(11, 5)).toDouble() / povrhVelikiMaliLong(50, 5).toDouble())
    // todo 19.6% šansa da ću imati boju ako čekam zadnju kartu, a imam 4 karte iste boje
    // todo 39% šansa da ću imati boju (flush), ako imam 4 karte iste boje, a čekam još 2 da izađu
    // todo 10% šansa da dobijem tris, ako već imam dvije karte istog znaka, a čekam njih 5 da izađu
}

fun povrhVelikiMaliLong(n: Long, k: Long): Long {
    var a: Long = 1
    for (i in n downTo n - k + 1) {
        a *= i
    }
    return a / faktorijelaLong(k)
}

/**
 * Prima integer za n koji zelimo faktorijelu - returna n!
 */
fun stirlingApproximation(n: Long): Double {
    return Math.sqrt(2.0 * Math.PI * n) * Math.pow(n.toDouble() / Math.E, n.toDouble())
}

fun stirlingFactorialError(n: Long): Double {
    return 1.0 - stirlingApproximation(n) / faktorijelaLong(n).toDouble()
}

/**
 * za velike brojeve
 * TODO Sad treba iskombinirati male i velike brojeve
 */
fun povrhStirlingDouble(n: Long, k: Long): Double {
    return stirlingApproximation(n) / (stirlingApproximation(n - k) * stirlingApproximation(k))
}

fun faktorijelaLong(n: Long): Long {
    tailrec fun fact2tail(i: Long, j: Long): Long {
//        println(and)
        return if (i <= 0) j
        else fact2tail(i - 1, i * j)
    }
    return fact2tail(n, 1)
}

fun povrhObicanDouble(n: Long, k: Long): Double {
    return faktorijelaLong(n).toDouble() / (faktorijelaLong(n - k).toDouble() * faktorijelaLong(k)).toDouble()
}
