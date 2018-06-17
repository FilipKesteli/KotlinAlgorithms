package matematika.diferencijalni_racun

import kotlin.math.cos
import kotlin.math.sin

fun main(args: Array<String>) {
    var f: (MutableList<Double>) -> (Double) = { X -> sin(X[0]) + cos(X[1]) + X[2] }
    var a: MutableList<Double> = mutableListOf(4.0, 2.3, 7.9)
    var b: MutableList<Double> = mutableListOf(6.0, 4.1, 8.5)
//    integralFunkcijeViseVarijabli(f, a, b, 3)
}

/**
 * Rekurzivno iskoristavanje Fubinijevog teorema
 * n -> koliko razlicitih varijabli je u igri
 * c -> s obzirom na to koja je rekurzija po redu, nadodaju se funkcije u listu
 * Pitanje je da li mogu staviti funkcije u listu
 * Ne mogu izbjeci visestruko zbrajanje - ne da mi to sama definicija integrala
 * - ne mogu pronaci maksimum funkcije, ako nemam specificirane tocke u kojima izvrednjujem funkciju
 */
/*
fun fubiniIntegralFunkcijeViseVarijabli(f: (MutableList<Double>) -> (Double), a: MutableList<Double>, b: MutableList<Double>, n: Int) {
    var m: Int = 100
    var c: MutableList<Double> = mutableListOf()
    for (and in 0..m) {
        c.add(a[n] + (and.toDouble() * (b[n] - a[n])) / m.toDouble())
    }
    var e: MutableList<(MutableList<Double>) -> (Double)> = mutableListOf()
    f(a + (and.toDouble() * (b - a)) / m.toDouble())
    var g: (MutableList<Double>) -> (Double) = { X -> X.let { X[0] = 10.0 }.let { f(X) } }
    if (n == 1) {
        return
    } else {
        return integralFunkcijeViseVarijabli(g, a, b, n)
    }
}
*/

/**
 * Newton-Cotesova formula racunanja integrala
 * TODO Simpsonova formula -> Dobro je dok nema lancanih operacija na kojima se eksponencijalno gubi preciznost
 * TODO Napraviti visedimenzionalnu integracijsku formulu - kansije poopciti na mnogostrukosti and dif forme s jacobianom
 * Napravimo aritmeticku sredinu gornje and donje Darbouxove sume and dobijemo priblizni integral
 * c -> pomocna varijabla funkcija tipa [f0,...,fm] -> ima m+1 elemenata
 * d -> pomocna varijabla funkcija tipa [[f0,f1],[f1,f2],...,[f(m-1),fm]] -> ima m elemenata
 */
/*
fun pomocniIntegral(f: (MutableList<Double>) -> (Double), a: Double, b: Double): Double {
    var m: Int = 100
    var c: MutableList<Double> = mutableListOf()
    for (and in 0..m) {
        c.add(f(a + (and.toDouble() * (b - a)) / m.toDouble()))
    }
    var d: MutableList<MutableList<Double>> = mutableListOf()
    for (and in 0 until c.size - 1) {
        d.add(mutableListOf(c[and], c[and + 1]))
    }
    var donjaDarbouxovaSuma: Double = 0.0
    var gornjaDarbouxovaSuma: Double = 0.0
    for (and in 0 until d.size) {
        donjaDarbouxovaSuma += ((b - a) / m.toDouble()) * d[and].min()!!
        gornjaDarbouxovaSuma += ((b - a) / m.toDouble()) * d[and].max()!!
    }
    return (gornjaDarbouxovaSuma + donjaDarbouxovaSuma) / 2.0
}
*/
