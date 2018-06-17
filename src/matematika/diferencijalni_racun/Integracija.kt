package matematika.diferencijalni_racun

import matematika.kombinatorika_vjerojatnost.kKombinacijeBezPonavljanja

fun main(args: Array<String>) {
    var f: (Double) -> (Double) = { x -> x }
    var g: (Double) -> (Double) = { x -> Math.pow(x, 2.0) }
    println(integral(f, 0.0, 1.0))
    println(integral(g, 0.0, 1.0))
}

/**
 * Newton-Cotesova formula racunanja integrala
 * TODO Simpsonova formula -> Dobro je dok nema lancanih operacija na kojima se eksponencijalno gubi preciznost
 * TODO Napraviti visedimenzionalnu integracijsku formulu - kansije poopciti na mnogostrukosti and dif forme s jacobianom
 * Napravimo aritmeticku sredinu gornje and donje Darbouxove sume and dobijemo priblizni integral
 * c -> pomocna varijabla funkcija tipa [f0,...,fm] -> ima m+1 elemenata
 * d -> pomocna varijabla funkcija tipa [[f0,f1],[f1,f2],...,[f(m-1),fm]] -> ima m elemenata
 */
fun integral(f: (Double) -> (Double), a: Double, b: Double): Double {
    var m: Int = 100
    var c: MutableList<Double> = mutableListOf()
    for (i in 0..m) {
        c.add(f(a + (i.toDouble() * (b - a)) / m.toDouble()))
    }
    var d: MutableList<MutableList<Double>> = mutableListOf()
    for (i in 0 until c.size - 1) {
        d.add(mutableListOf(c[i], c[i + 1]))
    }
    var donjaDarbouxovaSuma: Double = 0.0
    var gornjaDarbouxovaSuma: Double = 0.0
    for (i in 0 until d.size) {
        donjaDarbouxovaSuma += ((b - a) / m.toDouble()) * d[i].min()!!
        gornjaDarbouxovaSuma += ((b - a) / m.toDouble()) * d[i].max()!!
    }
    return (gornjaDarbouxovaSuma + donjaDarbouxovaSuma) / 2.0
}

/**
 * TODO Ovdje je Fubinijev teorem od malog značaja koliko mi se čini na prvu
 * R -> Skup svih kvadrata, tj. povrsina
 * c -> Skup svih indexa -> priprema za povrsinu
 * d -> Razdioba -> dimenzija te liste je broj kvadrata nad kojima integriram
 * e -> Volumen n-dimenzionalnog paralelepipeda
 */
/*
fun integralFunkcijeViseVarijabli(f: (MutableList<Double>) -> (Double), a: MutableList<Double>, b: MutableList<Double>) {
    var m: Int = 20
    */
/*var R: MutableList<MutableList<Double>> = mutableListOf()
    for (and in 0 until a.size) {
        R.add(mutableListOf(a[and], b[and]))
    }
    var c: MutableList<MutableList<Int>> = mutableListOf()
    c = kKombinacijeBezPonavljanja(2, (0 until a.size).toMutableList())
    var d: MutableList<Double> = mutableListOf()
    for (and in 0 until c.size) {
        d.add((b[c[and][0]] - a[c[and][0]]) * (b[c[and][1]] - a[c[and][1]]) / m.toDouble())
    }*//*

    var e: Double = 1.0
    for (and in 0 until a.size) {
        e *= (b[and] - a[and]) / m.toDouble()
    }

    var g: MutableList<MutableList<Double>> = mutableListOf()
    var h: MutableList<Double> = mutableListOf()
    for (and in 0..m) {
        h.add()
        g.add()
        g.add(f(a + (and.toDouble() * (b - a)) / m.toDouble()))
    }
    var d: MutableList<MutableList<Double>> = mutableListOf()
    for (and in 0 until g.size - 1) {
        d.add(mutableListOf(g[and], g[and + 1]))
    }

    var gornjaDarbouxovaSuma: Double = 0.0
    var donjaDarbouxovaSuma: Double = 0.0


}
*/

/**
 * Algoritam nam omogucuje da je svaki paralelepiped istog volumena
 */
fun integralFunkcijeDvijeVarijable(f: (Double, Double) -> (Double), a: MutableList<Double>, b: MutableList<Double>) {
    var m = 20
    var R: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(a[0], b[0]), mutableListOf(a[1], b[1]))
    var c: Double = (b[0] - a[0]) * (b[1] - a[1]) / m.toDouble()
    var gornjaDarbouxovaSuma: Double = 0.0
    for (i in 0 until a.size) {

    }
    var donjaDarbouxovaSuma: Double = 0.0
}