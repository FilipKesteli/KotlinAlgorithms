package matematika.linearna_algebra.vektori

import matematika.linearna_algebra.matrice.Matrica

/**
 * TODO Vektor redak (zapravo vektor stupac...)
 * TODO Treba se jos usuglasiti s DIJALEKTALNOM teorijom
 * TODO Nema potrebe za varijablom dimanzija - sve se moze rijesiti s redak.size - zbog nepotrebnih exceptiona prilikom instanciranja objekta
 */
class Vektor(var dimenzija: Int, var redak: MutableList<Double>) {
    init {
        require(dimenzija == redak.size)
    }

    /**
     * Transponirani vektor ima smisla tek kad se uvede matrica kao objekt (intuitivno, ne formalno)
     * Tajna je u scope-u -> prilikom stavljanja varijable u drugu varijablu, umjesto da ju brisemo, smanjujemo joj scope!!!
     */
    fun transponiranje(): Matrica {
        var a: MutableList<MutableList<Double>> = mutableListOf()
        for (i in 0 until dimenzija) {

        }
        for (i in redak) {
            val b: MutableList<Double> = mutableListOf()
            b.add(i)
            a.add(b)
        }
        return Matrica(dimenzija, 1, a)
    }

    fun isprintajVektor() {
        println(redak)
    }
}