package matematika.diferencijalni_racun

import kotlin.math.pow

fun main(args: Array<String>) {
    var f: (Double) -> Double = { x -> x.pow(2) }
    println(lanczosDerivacija(f, 3.0))
    println(lanczosDrugaDerivacija(f, 3.0))

    var g: (Double) -> Double = { x -> x.pow(5) }
    println(nTaDerivacija(g, 2.0, 2))
    println(nTaDerivacija(g, 2.0, 3))
}

/**
 * Fantastičan primjer algoritma u kojem imamo više poželjnih return vrijednosti koje bi bile zbunjujuće da je return
 * Ako returnamo istu funkciju, onda je svejedno kojeg je tipa ta funkcija
 * Primjetiti prilikom debuggiranja da se program nakon izvodenja rekurzije uvijek vraca na istu
 */
fun nTaDerivacija(f: (Double) -> (Double), a: Double, n: Int): Double {
    var h: Double = 0.001
    var g: (Double) -> (Double) = { x -> (f(x + h) - f(x)) / h }
    if (n == 1) {
        return g(a)
    } else {
        return nTaDerivacija(g, a, n - 1)
    }
}

/**
 * TODO Ovdje mogu iskoristiti razne statističke metode
 */
fun lanczosDerivacija(f: (Double) -> (Double), a: Double): Double {
    var h: Double = 0.01
    var g: (Double) -> (Double) = { t -> a + t }
    var r: (Double) -> (Double) = { t -> t * f(g(t)) }
    var b: Double = 3.0 / (2.0 * Math.pow(h, 3.0)) * integral(r, -h, h)
    return b
}

/**
 * Idemo iznutra prema van
 */
/*
fun lanczosNtaDerivacija(f: (Double) -> (Double), a: Double, n: Int, m: Int = 1): Double {
    var h: Double = 0.01
    var g: (Double) -> (Double) = { t -> a + t }
    var r: (Double) -> (Double) = { t -> t * f(g(t)) }
    var b: Double = 3.0 / (2.0 * Math.pow(h, 3.0)) * integral(r, -h, h)
    if (m == 1) {
        return b
    } else {
        var c: Double = 3.0 / (2.0 * Math.pow(h, 3.0)) * integral(r, -h, h)
        return lanczosNtaDerivacija()
    }
}
*/

/**
 * TODO Napraviti algoritam za visestruko integriranje
 */
fun lanczosDrugaDerivacija(f: (Double) -> (Double), a: Double): Double {
    var h: Double = 0.01
    var g: (Double) -> (Double) = { t -> a + t }
    var q: (Double) -> (Double) = { t -> a + 2 * t }
    var r: (Double) -> (Double) = { t -> t * f(q(t)) }
    var b: Double = 3.0 / (2.0 * Math.pow(h, 3.0)) * integral(r, -h, h)
    var p: (Double) -> (Double) = { t -> t }
    var c: Double = 3.0 / (2.0 * Math.pow(h, 3.0)) * integral(p, -h, h) * b
    return c
}


