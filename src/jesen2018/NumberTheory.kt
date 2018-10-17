package jesen2018

fun main(args: Array<String>) {

}

fun findingSquareRoot(n: Int): Double {
    return Math.sqrt(n.toDouble())
}

/**
 * TODO Treba pronaci bolji algoritam za trazenje korijena, gdje nema upotrebe Double tipa podataka
 * Trik preko pow metode trazimo korijen broja
 */
fun fermatLastTheorem(n: Long, m: Long, k: Long): Double {
    var a: Double = Math.pow(n.toDouble(), k.toDouble()) + Math.pow(m.toDouble(), k.toDouble())
    var b: Double = Math.pow(a, 1.0 / k.toDouble())
    var e: Double = 0.01
    if (Math.abs(b - b.toInt().toDouble()) < e) {
        return b
    } else {
        return -1.0
    }
}
