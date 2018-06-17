package matematika.linearna_algebra.blok_matrice

fun main(args: Array<String>) {
    println(dimenzijaMatrice(mutableListOf(mutableListOf(1.0, 2.0, 3.0), mutableListOf(1.0, 2.0, 3.0))))
//    println(dimenzijaBlokMatrice(kroneckerProduct(jedinicnaMatrica(2), jedinicnaMatrica(2))))
    umnozakBlokMatrica(kroneckerProduct(jedinicnaMatrica(2), jedinicnaMatrica(2)), kroneckerProduct(jedinicnaMatrica(2), jedinicnaMatrica(2)))
}

fun umnozakBlokMatrica(A: MutableList<MutableList<MutableList<MutableList<Double>>>>, B: MutableList<MutableList<MutableList<MutableList<Double>>>>) {
    /*for () {
    }*/
}

/*
fun umnozakBlokMatrica(A: MutableList<MutableList<MutableList<Double>>>, B: MutableList<MutableList<MutableList<Double>>>) {
    for (i in 0 until) {

    }
}
*/

fun dimenzijaMatrice(A: MutableList<MutableList<Double>>): Int {
    return A.size * A[0].size
}

fun dimenzijaBlokMatrice(A: MutableList<MutableList<MutableList<Double>>>): Int {
    return A.size
}