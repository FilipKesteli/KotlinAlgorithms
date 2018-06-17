package matematika.linearna_algebra.vektori

fun main(args: Array<String>) {
    println(crossProduct(mutableListOf(1.0, 1.0, -1.0), mutableListOf(1.0, 2.0, 1.0)))
}

/**
 * axb
 * Korisno kod racunanja povrsine and volumena paralelograma and opcenito n-dimenzionalnog paralelepipeda
 */
private fun crossProduct(a: MutableList<Double>, b: MutableList<Double>): MutableList<Double> {
    return mutableListOf(a[1] * b[2] - a[2] * b[1], a[2] * b[0] - a[0] * b[2], a[0] * b[1] - a[1] * b[0])
}