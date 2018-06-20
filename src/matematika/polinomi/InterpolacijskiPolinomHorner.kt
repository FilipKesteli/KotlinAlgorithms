package matematika.polinomi

fun main(args: Array<String>) {
    var a: MutableList<Double> = mutableListOf(1.0, 0.0, 4.0, -1.0, 0.0, 2.0)
    var x: MutableList<Double> = mutableListOf(1.0, 0.0, 4.0, -1.0, 2.0)
    println(interpolacijskiPolinomHorner(a, x, -1.0))
}

fun interpolacijskiPolinomHorner(a: MutableList<Double>, x: MutableList<Double>, s: Double): Double {
    var y: MutableList<Double> = mutableListOf()
    for (i in 0 until x.size) {
        y.add(s - x[i])
    }
    var b: Double = a[a.size - 1] * y[a.size - 2] + a[a.size - 2]
    for (i in 0 until a.size - 2) {
        b = b * y[a.size - 2 - i] + a[a.size - 2 - i]
    }
    return b
}
