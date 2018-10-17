package matematika.complex_analysis.kompleksni_polinomi

fun main(args: Array<String>) {
    var a: MutableList<Double> = mutableListOf(1.0, 0.0, 8.0, 1.0)
    var x0 = 2.0
    var y0 = 1.0
    println(hornerKompleksniPolinomi(x0, y0, a))
}

fun hornerKompleksniPolinomi(x0: Double, y0: Double, a: MutableList<Double>): MutableList<Double> {
    var p = -2.0 * x0
    var q = Math.pow(x0, 2.0) + Math.pow(y0, 2.0)
    var b1 = 0.0
    val n = a.size - 1
    var b0 = a[n]
    for (i in n - 1 downTo 0) {
        var b2 = b1
        b1 = b0
        b0 = a[i] - p * b1 - q * b2
    }
    val c: MutableList<Double> = mutableListOf(b0 - x0 * b1, y0 * b1)
    return c
}