package matematika.jednadzbe

var v: MutableList<Double> = mutableListOf()

fun main(args: Array<String>) {
    var f: (Double) -> Double = { x -> Math.exp(-x) }
    transcendentalnaJednadzba(f, 20, 1.0)
    println(v)
}

fun transcendentalnaJednadzba(f: (Double) -> Double, n: Int, x0: Double): Double {
    var a: Double = x0
    for (i in 1..n) {
        a = f(a)
        v.add(a)
    }
    println(a)
    return a
}