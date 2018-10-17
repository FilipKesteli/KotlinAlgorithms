package ostalo

import matematika.kombinatorika_vjerojatnost.*

/**
 * Provjeravam vjerojatnosti za poker - nešto mi ne štima skroz
 */
fun main(args: Array<String>) {
//    println(povrh(30, 3))
//    println(povrh2(11, 3))
    println(povrh3(20, 3))
    println(povrh3(52, 7))
    println((povrh3(4, 3) * 13 * povrh3(4, 2) * 12 * 44 * 40 / faktorijela(2).toDouble()).toDouble() / povrh3(52, 7).toDouble())
    println((povrh3(4, 2) * 13 * povrh3(4, 2) * 12 / faktorijela(2).toDouble() * 44 * 40 * 36 / faktorijela(3).toDouble()).toDouble() / povrh3(52, 7).toDouble())
    println((povrh3(4, 2) * 13 * 48 * 44 * 40 * 36 * 32 / faktorijela(5).toDouble() / povrh3(52, 7).toDouble()))
//    println(faktorijela(30))
//    println(faktorijela(52) / faktorijela(45))
//    println(mTeroNfaktorijela(30, 1))
}


