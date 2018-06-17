package matematika.linearna_algebra.matrice

fun main(args: Array<String>) {
    var A: MutableList<MutableList<Double>> = mutableListOf(mutableListOf(6.0, 2.0, 4.0), mutableListOf(0.0, 2.0, 7.0), mutableListOf(-5.0, -1.0, -3.0))
    println(zamjenaRedaka(A, 0, 2))
    println(zamjenaStupaca(A, 0, 2))
}

private fun zamjenaRedaka(A: MutableList<MutableList<Double>>, i: Int, j: Int): MutableList<MutableList<Double>> {
    var B: MutableList<Double> = mutableListOf()
    B = A[i]
    A[i] = A[j]
    A[j] = B
    return A
}

private fun zamjenaStupaca(A: MutableList<MutableList<Double>>, i: Int, j: Int): MutableList<MutableList<Double>> {
    for (k in 0 until A.size) {
        var d: Double = A[k][i]
        A[k][i] = A[k][j]
        A[k][j] = d
    }
    return A
}




