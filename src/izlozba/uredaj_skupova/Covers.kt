package izlozba.uredaj_skupova

fun main(args: Array<String>) {

}

fun isLowerCoverBroja(p: Int, q: Int, D: MutableSet<Int>): Boolean {
    if (p < q) {
        for (z in D) {
            if (z !in p..q) {
                return false
            }
        }
    }
    return true
}

fun isLowerCoverSkupa(p: Int, q: Int, D: MutableSet<Int>): Boolean {
    if (p < q) {
        for (z in D) {
            if (z !in p..q) {
                return false
            }
        }
    }
    return true
}

fun isUpperCoverSkupa(p: Int, q: Int, D: MutableSet<Int>) {

}

fun isUpperCoverBroja(p: Int, q: Int, D: MutableSet<Int>) {

}