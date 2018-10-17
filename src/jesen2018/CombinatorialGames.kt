package jesen2018

fun main(args: Array<String>) {

}

/**
 * Prvo je jedan igrač na redu, onda drugi
 * Tko zadnji pokupi ciglu je pobjednik
 * Rjesenje slazem preko remaindera
 */
fun pickUpBricks(n: Int) {
    var a: Int = 0
    var b: Int = 0
    var m: Int = n
    var aa: MutableList<Int> = mutableListOf(1, 2, 2, 1, 2)
    var bb: MutableList<Int> = mutableListOf(2, 1, 1, 2, 2)
    for (i in 0 until m) {
        if (i.rem(2) == 1) {
            m -= aa[i]
        } else {
            m -= bb[i]
        }
        if (m == 0) {
            if (i.rem(2) == 1) {
                println("Pobjednik je igrac a")
            } else {
                println("Pobjednik je igrac b")
            }
            return
        }
        if (m == 1 || m == 2) {
            if (i.rem(2) == 1) {
                println("Pobjednik je igrac b")
            } else {
                println("Pobjednik je igrac b")
            }
            return
        }
    }
}