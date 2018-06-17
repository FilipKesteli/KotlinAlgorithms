package ostalo.proba

fun main(args: Array<String>) {
    var a: MutableList<MutableList<Int>> = mutableListOf()
    a.add(mutableListOf(1, 2, 3))
    a.add(mutableListOf(1, 3, 3))
    a.add(mutableListOf(1, 2, 2))
    var b: MutableList<Int> = mutableListOf(1, 2, 2)
    var c: MutableList<MutableList<Int>> = mutableListOf()
    for (i in a) {
        if (b.intersect(i) == null) {
            c.add(i)
        }
    }
    println(c)

    var d: MutableList<MutableList<Int>> = mutableListOf(mutableListOf(1, 2, 3), mutableListOf(1, 2, 1))
    var e: MutableList<Int> = mutableListOf(1, 2, 3)
    println(e.intersect(d[0]))
    if (e.intersect(d[0]) != null) {
        println(e)
    }
    if (e.intersect(d[1]).size == e.size) {
        println(e)
    }
    var f: MutableList<Int> = mutableListOf(1, 2, 3)
    var g: MutableList<Int> = mutableListOf(3, 1, 2)
    var h: MutableList<Int> = mutableListOf(3, 1, 2)
    var m: MutableList<Int> = mutableListOf(8, 8)
//    println(f.intersect(g))
    println(f == g)
    println(g == h)
    println(m.intersect(m))
}



