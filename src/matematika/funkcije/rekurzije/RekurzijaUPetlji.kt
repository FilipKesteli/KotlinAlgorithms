package matematika.funkcije.rekurzije

fun main(args: Array<String>) {
    rec(3)
    println(q1.size)
    q1.clear()
    println(q2.size)
    q2.clear()
}

var q1: MutableList<Int> = mutableListOf()
var q2: MutableList<Int> = mutableListOf()

/**
 * Primjetiti da rekurzija mora imati nekog izbacitelja ili više njih - ovdje je to uvjet if
 */
private fun proba(n: Int) {
    if (n == 1) { //*
        return
    }
    for (i in 0 until n) {
        println(i)
        proba(n - 1) //*
        q1.add(i)
    }
}

var q3: Int = 0

private fun rec(n: Int) {
    q3 += 1
    if (n == 1) {
        q2.add(1)
        return
    }
    for (i in 0 until n) {
        rec(n - 1)
    }
}


