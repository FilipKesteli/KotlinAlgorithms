package ostalo.proba

fun main(args: Array<String>) {
    var a: MutableList<Int> = mutableListOf(7, 7)
    var b: MutableList<Int> = mutableListOf(7, 7)
    println(a.intersect(a))
//    pr8()
//    pr81()
}

/**
 * Ovdje imamo staticnu varijablu, nepromijenjivu and moramo mijenjati unutar koda
 */
fun pr8() {
    var a: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6)
    for (i in 0 until a.size) {
        a.removeAt(i)
        println(a)
    }
}

fun pr81() {
    for (i in 3 until 2) {
        println(2)
    }
}