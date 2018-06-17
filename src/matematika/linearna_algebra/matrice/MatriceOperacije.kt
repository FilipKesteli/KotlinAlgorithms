package matematika.linearna_algebra.matrice

fun main(args: Array<String>) {
    val m: MutableList<MutableList<Double>> =
            mutableListOf(
                    mutableListOf(1.0, 2.0, 3.0),
                    mutableListOf(4.0, 5.0, 7.0))
    val A: Matrica = Matrica(2, 3, m)
//    println(A)
    A.isprintajMatricu()
    A.transponiranje().isprintajMatricu()
    umnozakMatricaKlasa(A, A.transponiranje()).isprintajMatricu()
    val m1: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(1.0, 2.0, 3.0), mutableListOf(4.0, 5.0, 6.0))
    val m2: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(1.0, 2.0), mutableListOf(3.0, 4.0), mutableListOf(5.0, 6.0))
    umnozakMatrica(m1, m2)

    var x: MutableList<Double> = mutableListOf(2.0, 3.0, 4.0)
    println(umnozakMatriceIVektora(m, x))
}

/**
 * Mogu sloziti po vektorima kao skalarni produkt, ali za sad idem po elementima
 */
fun umnozakMatrica(m1: MutableList<MutableList<Double>>, m2: MutableList<MutableList<Double>>): MutableList<MutableList<Double>> {
    var a: MutableList<MutableList<Double>> = mutableListOf() // Lista nad listom (matrica) iznad svih varijabli
    if (m1[0].size == m2.size) {
        for (i in 0 until m1.size) {
            val b: MutableList<Double> = mutableListOf() //Svaki put kad ide novi redak, varijabla se postavi na default
            for (k in 0 until m2[0].size) {
                var c: Double = 0.0 //Svaki put kad ide novi broj, varijabla se namijesti na 0.0
                for (j in 0 until m1[0].size) {
                    c += m1[i][j] * m2[j][k] //and-ti redak, k-ti stupac
                }
                b.add(c) //Nakon sto se petlja izvrsti, samo dodamo k listi
            }
            a.add(b) //Nakon sto se lista (redak) napuni dodamo k novoj matrici
        }
        println(a)
        return a
    } else {
        throw Throwable("!!!Nisu kompatibilne dimenzije matrica!!!")
    }
}

fun umnozakMatriceIVektora(A: MutableList<MutableList<Double>>, x: MutableList<Double>): MutableList<Double> {
    var d: MutableList<Double> = mutableListOf()
    for (i in 0 until A.size) {
        var c: Double = 0.0
        for (j in 0 until A[0].size) {
            c += A[i][j] * x[j]
        }
        d.add(c)
    }
    return d
}

/**
 * Mogu sloziti po vektorima kao skalarni produkt, ali za sad idem po elementima
 */
fun umnozakMatricaKlasa(m1: Matrica, m2: Matrica): Matrica {
    var a: MutableList<MutableList<Double>> = mutableListOf() // Lista nad listom (matrica) iznad svih varijabli
    if (m1.brojStupaca == m2.brojRedaka) {
        for (i in 0 until m1.brojRedaka) {
            val b: MutableList<Double> = mutableListOf() //Svaki put kad ide novi redak, varijabla se postavi na default
            for (k in 0 until m2.brojStupaca) {
                var c: Double = 0.0 //Svaki put kad ide novi broj, varijabla se namijesti na 0.0
                for (j in 0 until m1.brojStupaca) {
                    c += m1.retci[i][j] * m2.retci[j][k] //and-ti redak, k-ti stupac
                }
                b.add(c) //Nakon sto se petlja izvrsti, samo dodamo k listi
            }
            a.add(b) //Nakon sto se lista (redak) napuni dodamo k novoj matrici
        }
        println(a)
        return Matrica(m1.brojRedaka, m2.brojStupaca, a)
    } else {
        throw Throwable("!!!Nisu kompatibilne dimenzije matrica!!!")
    }
}

fun transponiranjeMatrice(A: MutableList<MutableList<Double>>): MutableList<MutableList<Double>> {
    var b: MutableList<MutableList<Double>> = mutableListOf()
    for (j in 0 until A[0].size) {
        val c: MutableList<Double> = mutableListOf()
        for (i in 0 until A.size) {
            c.add(A[i][j])
        }
        b.add(c)
    }
    return b
}

/**
 * Primjetiti kako kompjutor ne prepoznaje ako se radi o drugom tipu unutar liste
 */
fun transponiranjeMatriceInt(A: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    var b: MutableList<MutableList<Int>> = mutableListOf()
    for (j in 0 until A[0].size) {
        val c: MutableList<Int> = mutableListOf()
        for (i in 0 until A.size) {
            c.add(A[i][j])
        }
        b.add(c)
    }
    return b
}

/**
 * Ovdje iskoristiti funkciju permutacija1
 */
fun determinantaMatrice() {

}
