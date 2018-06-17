package matematika.topologija

fun main(args: Array<String>) {
    var a: (Int) -> Double = { n -> (1 / n).toDouble() + 1.0 }
    println(limesNiza(a, 0.01, 105))
    var b: (Int) -> (Double) = { n -> (2.0 * Math.pow(n.toDouble(), 2.0) + 5.0 * n) / ((3.0 * Math.pow(n.toDouble(), 2.0) + 5.0 * n)) }
    println(limesNiza(b, 0.01, 105))
}

private fun lopta() {

}

/**
 * Za svaki e>0, postoji n0EN t.d. za svaki nEN, n>n0 => a(n)-a(n0) < e
 * Ovdje n0 biramo otprilike dok ga ne napipamo
 * b je pomocna varijabla koja indicira ima li limesa
 */
private fun limesNiza(a: (Int) -> (Double), e: Double, n0: Int): Double {
    var b: Int = 0
    for (i in n0 + 1 until n0 + 1000) {
        if (Math.abs(a(i) - a(n0)) < e) {
            b += 1
        }
    }
    if (b == 999) {
        return a(n0)
    } else {
        throw Throwable("!!!Nema limesa zadanog niza!!!")
    }
}