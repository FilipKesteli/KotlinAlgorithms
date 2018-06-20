package matematika.polinomi

fun main(args: Array<String>) {
    var a: MutableList<Double> = mutableListOf(1.0, 0.0, 4.0, -1.0, 0.0, 2.0)
    println(dijeljenjePolinoma1(a, -1.0))
    println(nDijeljenjePolinoma(a, -1.0))
}

/**
 * a - koeficijenti polinoma
 * dijeli se s (x-x0)
 * TODO Odlicna podloga za Taylorov razvoj
 */
fun dijeljenjePolinoma1(a: MutableList<Double>, x0: Double): MutableList<Double> {
    var b: MutableList<Double> = mutableListOf()
    for (i in 0 until a.size) {
        if (i == 0) {
            b.add(a[a.size - 1])
        } else {
            b.add(a[a.size - 1 - i] + x0 * b[i - 1])
        }
    }
    b.reverse()
    return b
}

/**
 * OUTPUT: Koeficijenti r_i uz potenciju funkcije (x-x0)^i
 * str. 230., 231. - Numericka analiza - Hari
 */
fun nDijeljenjePolinoma(a: MutableList<Double>, x0: Double): MutableList<Double> {
    var b: MutableList<Double> = kreirajListByValueDouble(a)
    var c: MutableList<Double> = mutableListOf()
    b = dijeljenjePolinoma1(b, x0)
    c.add(b[0])
    b.removeAt(0)
    for (i in 0 until a.size - 1) {
        b = dijeljenjePolinoma1(b, x0)
        c.add(b[0])
        b.removeAt(0)
    }
    return c
}

