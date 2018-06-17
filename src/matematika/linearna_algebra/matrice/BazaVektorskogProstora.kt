package matematika.linearna_algebra.matrice

/**
 * Uvijek se krece od standardne baze E = ((1,0),(0,1))
 */
fun main(args: Array<String>) {
    var B1: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(1.0, 0.0), mutableListOf(0.0, 1.0))
    var B2: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(1.0, 1.0), mutableListOf(-1.0, 2.0))
    var T: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(3.0, 1.0), mutableListOf(2.0, 2.0))
    var x: MutableList<Double> = mutableListOf(1.0, 2.0)
    println(matricaPrijelaza(B1, B2))
    println(prelazakMatriceIzJedneUDruguBazu(T, B1, B2))
    println(prelazakVektoraIzJedneUDruguBazu(x, B1, B2))
}

/**
 * Matrica prijelaza iz baze B u bazu B'
 * B1 -> Stara baza
 * B2 -> Nova baza
 * TODO Složiti prijelaz vektora iz jedne u drugu bazu, matrice iz jedne u drugu bazu, svojstvene vrijednosti and vektore
 * TODO Sve to upotrijebiti u statistici, teoriji grafova. čak and u topologiji, kompleksnoj analizi - karakteristični polinom
 * TODO Markovljevim lancima, sustavima diferencijalnih and diferencijskih jednadžbi, strojnom učenju
 * TODO Složiti za općeniti mxn slučaj preslikavanja -> ovo je za nxn, no svejedno ima mnogo implikacija
 */
fun matricaPrijelaza(B1: MutableList<MutableList<Double>>, B2: MutableList<MutableList<Double>>): MutableList<MutableList<Double>> {
    var a: MutableList<MutableList<Double>> = mutableListOf()
    for (i in 0 until B1.size) {
        var c: MutableList<Double> = sustavNJednadzbiEchelon(transponiranjeMatrice(B1), B2[i])
        a.add(c)
    }
    return transponiranjeMatrice(a)
}

/**
 * B1 -> stara baza
 * B2 -> nova baza
 * T -> stara matrica
 * return nova matrica
 */
fun prelazakMatriceIzJedneUDruguBazu(T: MutableList<MutableList<Double>>, B1: MutableList<MutableList<Double>>, B2: MutableList<MutableList<Double>>): MutableList<MutableList<Double>> {
    var P: MutableList<MutableList<Double>> = matricaPrijelaza(B1, B2)
    var Pinverz: MutableList<MutableList<Double>> = inverznaMatrica(P)
    return umnozakMatrica(umnozakMatrica(Pinverz, T), P)
}

fun prelazakVektoraIzJedneUDruguBazu(x: MutableList<Double>, B1: MutableList<MutableList<Double>>, B2: MutableList<MutableList<Double>>): MutableList<Double> {
    var P: MutableList<MutableList<Double>> = matricaPrijelaza(B1, B2)
    var Pinverz: MutableList<MutableList<Double>> = inverznaMatrica(P)
    return umnozakMatriceIVektora(Pinverz, x)
}