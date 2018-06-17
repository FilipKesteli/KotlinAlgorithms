package izlozba

fun main(args: Array<String>) {

}

fun suma(a: MutableList<Double>): Double {
    var b: Double = 0.0
    for (i in 0 until a.size) {
        b += a[i]
    }
    return b
}

fun produkt(a: MutableList<Double>): Double {
    var b: Double = 1.0
    for (i in 0 until a.size) {
        b *= a[i]
    }
    return b
}

fun razlika(a: MutableList<Double>): Double {
    var b: Double = 1.0
    for (i in 0 until a.size) {
        b -= a[i]
    }
    return b
}

fun dijeljenje(a: MutableList<Double>): Double {
    var b: Double = 1.0
    for (i in 0 until a.size) {
        b /= a[i]
    }
    return b
}


