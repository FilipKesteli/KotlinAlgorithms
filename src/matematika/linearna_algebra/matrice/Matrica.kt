package matematika.linearna_algebra.matrice

class Matrica(var brojRedaka: Int, var brojStupaca: Int, var retci: MutableList<MutableList<Double>>) {
    init {
        var c = brojRedaka * brojStupaca
        var d: MutableList<Double> = mutableListOf() //Pomocna lista za require - TODO Sloziti bolju klasu za matricu
        for (i in 0 until brojRedaka) {
            for (j in 0 until brojStupaca) {
                d.add(retci[i][j])
            }
        }
        require(retci.size == brojRedaka && d.size == c)
    }

    /**
     * Trebao sam paziti na scope varijable b
     * Kad stavim varijablu u drugu varijablu, onda zapravo stavljam adresu unutra
     * and promjenom varijable mijenja se and argument unutar druge varijable
     * TODO Trebam otkriti kako koristiti value od varijable
     */
    fun transponiranje(): Matrica {
        var a: MutableList<MutableList<Double>> = mutableListOf()
        for (j in 0 until brojStupaca) {
            val b: MutableList<Double> = mutableListOf()
            for (i in 0 until brojRedaka) {
                b.add(retci[i][j])
            }
            a.add(b)
        }
        return Matrica(brojStupaca, brojRedaka, a)
    }

    fun isprintajMatricu() {
        for (i in retci) {
            println(i)
        }
    }
}





