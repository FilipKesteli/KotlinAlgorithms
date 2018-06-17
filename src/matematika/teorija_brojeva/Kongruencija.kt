package matematika.teorija_brojeva

fun main(args: Array<String>) {
    println(isKongruentniModuloM(7, 3, 2))
    println(isKongruentniModuloM(6, 3, 2))
}

/**
 * Dva su broja a i b mođusobno kongruentni modulo m ako je a-b mod m == 0
 * koristimo rem umjesto mod (remain)
 */
fun isKongruentniModuloM(a: Int, b: Int, m: Int): Boolean {
    return (a - b).rem(m) == 0
}