package ostalo.probaLjeto

fun main(args: Array<String>) {
    funk1()
}

/**
 * also -> najprije returna vrijednost od unutarnjeg dijela koda, pa od vanjskog
 */
fun funk1() {
    var a: (Int) -> (Int) = { x -> x * x }
    var b: (Int) -> (Int) = { x -> x * x }
    var c: (Int) -> (Int) = { x -> x * x * x }
    var d: (Double) -> (Double) = { x -> x * x }
    println(a(3))
    println(a.equals(b))
    println(a.equals(c))
    println(a.toString())
    println(a(3).toString())
    println(a.to(c))
    println(a.to(4))
    println(a(3))
    println(a.hashCode())
    println(a(3).hashCode())
    println(d(3.0).hashCode())
    println(a.invoke(3))
    println(d.invoke(3.0))
    println(a.javaClass)
    println(a(3).javaClass)
    println(a.also { println(2) })
    println(a.also { println(a) })
    println(a.also { println(d) })
}

fun funk2() {

}