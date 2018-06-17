package matematika.funkcije

fun main(args: Array<String>) {

}

// Obicna skalarna funckija jedne varijable ()
fun f(x: Double): Double {
    return Math.abs(x) + Math.cos(x)
}

// Funkcija više varijabli
fun ff(v: Array<Double>): Double {
    val k: Double = v.sum()
    /*for (and in v1) {
        k += and
    }*/
    return k
}

// Vektorska funckija jedne varijable
fun fff(x: Double): Array<Double> {
    return arrayOf(Math.pow(x, 2.0), Math.pow(x, 3.0), Math.pow(x, 4.0))
}

// Vektorska funckija više varijabli
fun ffff(v: Array<Double>): Array<Double> {
    var k1: Double = 0.0
    var k2: Double = 0.0
    var k3: Double = 0.0
    for (i in v) {
        k1 += 2.0
        k2 -= 2.0
        k3 += i
    }
    return arrayOf(k1, k2, k3)
}