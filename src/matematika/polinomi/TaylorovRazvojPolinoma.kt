package matematika.polinomi

fun main(args: Array<String>) {
    var a: MutableList<Double> = mutableListOf(1.0, 0.0, 4.0, -1.0, 0.0, 2.0)
    println(taylorovRazvojPolinoma(a, -1.0))
}

/**
 * Dobivamo koeficijente uz polinom koji se razvija oko x0
 */
fun taylorovRazvojPolinoma(a: MutableList<Double>, x0: Double): MutableList<Double> {
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

fun kreirajListByValueDouble(A: MutableList<Double>): MutableList<Double> {
    var B: MutableList<Double> = mutableListOf()
    for (i in 0 until A.size) {
        B.add(A[i])
    }
    return B
}
