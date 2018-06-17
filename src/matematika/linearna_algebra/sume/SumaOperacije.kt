package matematika.linearna_algebra.sume

fun main(args: Array<String>) {
    val a: MutableList<Int> = mutableListOf(1, 2, 3)
    println(suma(0, 1, a))
    println(suma(0, 2, a))
    // Vektorska funckija jedne varijable
    /*val g_n: (Int) -> Int = { n -> 3 * n }
    val f_n: (Int, Double, (Int) -> Int) -> Int = { n, a1, g -> (a1 * 3.0 * n.toDouble() * g(n).toDouble()).toInt() }
    jednoRekurzivnaFunkcija(7, mutableListOf(1.0, 2.0), g_n, f_n)*/
    val g: (Int, Int) -> Int = { i, j -> i + j }
    println(dvoAritmetickiNiz(3, 4, g))
    println(umnozak(0, 1, mutableListOf(1, 2, 3, 4, 5)))
    val listaKraja: MutableList<Int> = mutableListOf(1, 2, 3, 4)
    val h: (MutableList<Int>) -> Int = { listaSimbola -> suma(0, 1, listaSimbola) } //normalno slijepi parametri kao da imam funkciju promijenjivog broja parametara
    println(nAritmetickiNiz(listaKraja, h))
}

/**
 * Dok zelimo znati diskretni nčlani niz - sve kombinacije
 * TODO Problem imam s promjenjivočću argumenata matematika.funkcije
 * TODO problem: Higher Order Function pass v1 function with variable number of arguments as the parameter
 * TODO Također je problem kad imam listu kao parametar u lambdi pa ne znam što s njom
 * TODO Lijepo je kad imamo listu po listu, ali kad trebamo kombinirati lista, onda je to izuzetno prtljavo
 */
fun nAritmetickiNiz(listaKraja: MutableList<Int>, f: (L: MutableList<Int>) -> Int): MutableList<Int> {
    var a = 0
    var b: MutableList<Int> = mutableListOf()
    for (kraj in listaKraja) {
        val c: MutableList<Int> = mutableListOf()
        for (i in 1..kraj) {

            b.add(f(listaKraja))
        }
    }
    return b
}

/**
 * Ovo bi trebalo biti u main-u - nema smisla nesto definirati bezveze
 */
fun obicnaFunkcija(vararg x: Int) {
    return
}

/**
 * Ne vidim razliku između promijenjivog broja parametara and liste parametara - ionako prilikom pozivanja matematika.funkcije,
 * imamo normalno slijepe parametre kao and da imamo promijenjiv broj njih - samo moramo znati što točno s listom!!
 * Moramo posebno definirati funkciju za manipuliranje listom!
 */
fun probnaFja(f: (MutableList<Int>) -> Int): (MutableList<Int>) -> Int {
    return f
}

/**
 * Ovo je kao faktorijela!
 */
fun umnozak(k: Int, s: Int, lista: MutableList<Int>): Int {
    var a: Int = 1
    if (k < lista.size) {
        for (i in k until lista.size step s) {
            a *= lista[i]
        }
        return a
    } else {
        throw Throwable("!!!Treba popraviti argumente!!!")
    }
}

fun troAritmetickiNiz(listaKraja: MutableList<Int>, f: (Int, Int, Int) -> Int) {
    var a: Int = 0
    var b: MutableList<Int> = mutableListOf()
    for (k in listaKraja) {
        for (i in 1..k) {
//            ... // TODO Napraviti nesto s toga
        }
    }
}

/**
 * Dok zelimo znati diskretni dvočlani niz - sve kombinacije
 */
fun dvoAritmetickiNiz(k1: Int, k2: Int, f: (Int, Int) -> Int): MutableList<Int> {
    var a = 0
    var b: MutableList<Int> = mutableListOf()
    for (i in 1..k1) {
        for (j in 1..k2) {
            b.add(f(i, j))
        }
    }
    return b
}

fun dvoAritmetickiNiz(k: MutableList<Int>, f: (Int, Int) -> Int): MutableList<Int> {
    var a = 0
    var b: MutableList<Int> = mutableListOf()
    for (i in k) {
        for (j in 1..i) {
            b.add(f(j, j + 1))
        }
    }
    return b
}

/**
 * Dok god imamo neku sumu, samo posložimo članove sume najprije u listu and onda samo zbrojimo
 * Ovo je fleksibilna suma jer korisnik može sam odrediti početak and step sume
 */
fun suma(k: Int, s: Int, lista: MutableList<Double>): Double {
    var a: Double = 0.0
    if (k < lista.size) {
        for (i in k until lista.size step s) {
            a += lista[i]
        }
    }
    return a
}

/**
 * Ne isplati se Generics u ovakvim slučajevima kad imamo samo Int and Double -
 * zbog compilera koji tek kasnije čita tip genericsa <T>
 * Overloading matematika.funkcije
 */
fun suma(k: Int, s: Int, lista: MutableList<Int>): Int {
    var a: Int = 0
    if (k < lista.size) {
        for (i in k until lista.size step s) {
            a += lista[i]
        }
        return a
    } else {
        throw Throwable("!!!Treba popraviti argumente!!!")
    }
}

/**
 * Nema potrebe za ovom sumom!
 */
fun suma(n: Int, f_n: (g: (Double) -> Double) -> Double) {
    var a: Double = 0.0
    for (i in 0 until n) {

    }
}

/**
 * v3 -> diferencija niza
 */
fun aritmetickiNiz(n: Int, d: Int, a1: Int): MutableList<Int> {
    val a: MutableList<Int> = mutableListOf()
    for (i in 1 until n) {
        a.add(a1 + (n - 1) * d)
    }
    return a
}

fun geometrijskiNiz(n: Int, a0: Double, q: Double): MutableList<Double> {
    val a: MutableList<Double> = mutableListOf()
    a.add(a0)
    for (i in 1 until n) {
        a.add(a0 * Math.pow(q, n.toDouble()))
    }
    return a
}

fun jednoRekurzivnaFunkcija(n: Int,
                            a1_lista: MutableList<Double>,
                            g_n: (n: Int) -> Int,
                            f_n: (n: Int, a1: Double, g_n: (n: Int) -> Int) -> Int): MutableList<Int> {
    val a: MutableList<Int> = mutableListOf()
    for (i in 0 until n) {
        a.add(f_n(n, a1_lista[i], g_n))
    }
    return a
}

/**
 * Rekurzivna funkcija koja ovisi o dvije rekurzivne matematika.funkcije
 * Ako želimo imati funkciju od istovijetne matematika.funkcije, moramo se pobrinuti za to prilikom deklariranja
 */
fun dvoRekurzivnaFunkcija(n: Int,
                          a1_lista: MutableList<Double>,
                          a2_lista: MutableList<Double>,
                          g_n: (n: Int) -> Int,
                          h_n: (n: Int) -> Int,
                          f_n: (n: Int, a1: Double, a2: Double, g_n: (n: Int) -> Int, h_n: (n: Int) -> Int) -> Int): MutableList<Int> {
    val a: MutableList<Int> = mutableListOf()
    for (i in 0 until n) {
        a.add(f_n(n, a1_lista[i], a2_lista[i], g_n, h_n))
    }
    return a
}

/**
 * Ovdje stavljamo m rekurzivnih funkcija u listu
 */
fun mRekurzivnaFunkcija(n: Int,
                        m: Int,
                        am_lista: MutableList<MutableList<Double>>,
                        vararg gm_n: (n: Int) -> Int,
                        f_n: (n: Int, a1: Double, g_n: (n: Int) -> Int) -> Int): MutableList<Int> {
    val a: MutableList<Int> = mutableListOf()
    if (gm_n.size == m) {
        for (i in 0 until m) {
            for (j in 0 until n) {
                a.add(f_n(n, am_lista[i][j], gm_n[i]))
            }
        }
        return a
    } else {
        throw Throwable("!!!Nije dobra velicina gm_n niza!!!")
    }
}

