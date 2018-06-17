package matematika.polinomi

fun main(args: Array<String>) {
    var a = (1..6).toMutableList()
    var b: MutableList<Double> = mutableListOf()
    a.mapTo(b) { it.toDouble() }
    println(polinomPamcenjePotencija(5, mutableListOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0), 2.0))
    println(polinomPamcenjePotencija(5, b, 2.0))
    println(polinomPamcenjePotencija(2, mutableListOf(1.0, 2.0, 3.0), 2.0))
//    println(hornerAlgoritam(5, b, 2.0))
    println(hornerAlgoritam(2, mutableListOf(1.0, 2.0, 3.0), 2.0))
}

fun polinomPamcenjePotencija(n: Int, a: MutableList<Double>, x: Double): Double {
    var b: Double = a[0]
    var y = x
    for (i in 1..n) {
        b += a[i] * y
        y *= y
    }
    return b
}

fun hornerAlgoritam(n: Int, a: MutableList<Double>, x: Double): Double {
    var b: Double = a[a.size - 1]
    for (i in 0 until n) {
        b *= x
        b += a[n - 1 - i]
    }
    return b
}