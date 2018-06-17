package matematika.statistika

import matematika.kombinatorika_vjerojatnost.povrh

fun main(args: Array<String>) {

}

fun binomnaEkspanzija(n: Int, a: Double, b: Double): Double {
    var c: Double = 0.0
    for (k in 0 until n) {
        c += povrh(n, k) * Math.pow(a, k.toDouble()) * Math.pow(b, (n - k).toDouble())
    }
    return c
}

/**
 * Nemoguce je sloziti generalnu formulu za sumu...?
 * Mogu, ali onda ionako moram raditi petlju za uvrstavanje a_k u listu pribrojnika
 */
fun suma1() {

}

