package matematika.linearna_algebra.matrice

import matematika.kombinatorika_vjerojatnost.permutacije.heapPermutacije
import matematika.kombinatorika_vjerojatnost.permutacije.parnostPermutacije

private var w: Int = 1

/**
 * TODO Najprije sloziti liste permutacija - pripremiti sve za krajnji rezultat
 */
fun main(args: Array<String>) {
    var A: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(6.0, 2.0, 4.0), mutableListOf(0.0, 2.0, 7.0), mutableListOf(-5.0, -1.0, -3.0))
    var B: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(1.0, 2.0, 1.0), mutableListOf(-1.0, 1.0, 2.0), mutableListOf(2.0, 0.0, 3.0))
    println(determinantaMatrice(A))
}

/**
 * B je pomocna matrica za permutacije
 * determinanta je suma umnoska svih permutacija
 */
fun determinantaMatrice(A: MutableList<MutableList<Double>>): Double {
    var B: MutableList<Int> = (0 until A.size).toMutableList()
    var C: MutableList<MutableList<Int>> = heapPermutacije(B.size, B)
    var e: Double = 0.0
    for (i in 0 until C.size) {
        var d: Double = 1.0
        for (j in 0 until A.size) {
            d *= A[j][C[i][j]]
        }
        e += d * parnostPermutacije(C[i])
    }
    return e
//    permutacijeBez
}