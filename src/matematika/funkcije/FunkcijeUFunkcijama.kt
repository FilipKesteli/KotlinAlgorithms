package matematika.funkcije

fun main(args: Array<String>) {
    val h: (Int) -> Int = { x -> Math.abs(x) }
    val v: List<Int> = arrayListOf(-2, 3, -4, 5)
    g(v, h)
    val h2: (Double) -> (Double) = { x -> Math.pow(x, 2.0) }
    val s = F_h2(h2)(2.9) // najvaznije svojstvo u Kotlinu
    println(s)
}

/**
 * Koristimo parametar unutar matematika.funkcije-parametra
 * Funkcija unutar matematika.funkcije
 * Returnamo broj
 */
fun g(v: List<Int>, h: (x: Int) -> Int): Int {
    for (i in v) {
        println("MathOnList ${h(i)}")
    }
    return h(5)
}

/**
 * Returnamo funkciju koja za parametar uzima funkciju
 * To je zapravo FUKCIONAL!!! - oznaka za funkcional bit će F_f
 */
fun F_h2(h2: (Double) -> (Double)): (Double) -> (Double) {
    return { x -> Math.cos(x) + h2(x) }
    /*val h3: (Double) -> (Double) = { x -> Math.cos(x) + h2(x) }
    return h3*/
}

