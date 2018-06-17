package izlozba

fun main(args: Array<String>) {

}

/**
 * input je samo 0 or 1
 */
fun nAnd(a: MutableList<Int>): Int {
    var b: Int = 1
    for (i in 0 until a.size - 1) {
        b = and(a[i], a[i + 1])
    }
    return b
}

fun nOr(a: MutableList<Int>): Int {
    var b: Int = 1
    for (i in 0 until a.size - 1) {
        b = or(a[i], a[i + 1])
    }
    return b
}

fun nAkoOnda(a: MutableList<Int>): Int {
    var b: Int = 1
    for (i in 0 until a.size - 1) {
        b = akoOnda(a[i], a[i + 1])
    }
    return b
}

fun nAkko(a: MutableList<Int>): Int {
    var b: Int = 1
    for (i in 0 until a.size - 1) {
        b = akko(a[i], a[i + 1])
    }
    return b
}
