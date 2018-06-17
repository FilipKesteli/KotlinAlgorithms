package matematika.topologija

fun main(args: Array<String>) {

}

fun isRelacija(A: MutableSet<String>, x: String, y: String): Boolean {
    var relacija: MutableList<MutableSet<String>> = mutableListOf()
    if (x in relacija[0] && y in relacija[0]) {
        return true
    } else {
        return false
    }
}

fun isRelacijaEkvivalencije() {

}

fun isRelacijaOrder() {

}

/**
 * Ovdje promatram citavu domenu X[and][0] and kodomenu X[and][1]
 * Caka - ako nadem jedan takav element kartezijevog produkta ciji je 0. clan (x) jednak nekom drugom
 * kojem se y razlikuje od prvog, tada to nije relacija funkcije!!
 */
fun isRelacijaFunkcije(X: MutableSet<MutableList<String>>): Boolean {
    var relacija: MutableList<MutableSet<String>> = mutableListOf()
    for (i in X) {
        for (j in X) {
            if (i[0] != j[0] && i[1] != j[1]) {
                return false
            }
        }
    }
    return true
}

fun isFunkcijaInjekcija() {

}

fun isFunkcijaSurjekcija() {

}

fun isFunkcijaBijekcija() {

}

fun kartezijevProdukt() {

}

fun nKartezijevProdukt() {

}