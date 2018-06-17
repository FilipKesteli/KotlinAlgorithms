package matematika.linearna_algebra.matrice

class MatricaVararg(val brojRedaka: Int, val brojStupaca: Int, vararg retci: MutableList<Double>) {
    init {
        var a: MutableList<MutableList<Double>> = mutableListOf()
        var b: MutableList<Double> = mutableListOf()
        for (i in retci) {
            a.add(i)
        }
        for (i in a) {
            for (j in i) {
                b.add(j)
            }
        }
        var c = brojRedaka * brojStupaca
        require(a.size == brojRedaka && b.size == c)
    }
}
