package matematika.linearna_algebra.vektori

fun main(args: Array<String>) {
    val a = Vektor(4, mutableListOf(1.0, 2.0, 3.0, 4.0))
    val b = Vektor(4, mutableListOf(1.0, 2.0, 2.0, 2.0))
    val c = Vektor(2, mutableListOf(1.0, 2.0))
    println(a.dimenzija)
    println(a.redak)
    println(a.isprintajVektor())
    println(skalarniUmnozakVektora(a, a))
    println(skalarniUmnozakVektora(a, b))
//    println(skalarniUmnozakVektora(v1, c))
    println(a.transponiranje().isprintajMatricu())
}

/**
 * TODO Napraviti posebno umnozak vektora and transponiranog vektora kad slozim umnozak matrica
 */
fun skalarniUmnozakVektora(v1: Vektor, v2: Vektor): Double {
    var a: Double = 0.0
    return if (v1.dimenzija == v2.dimenzija) {
        for (i in v1.redak.indices) {
            a += v1.redak[i] * v2.redak[i]
        }
        a
    } else {
        throw Throwable("!!!Pokusaj ponovo - nije dobra dimenzija vektora!!!")
    }
}

fun zbrojVektora() {

}

fun vektorskiUmnozakVektora() {

}