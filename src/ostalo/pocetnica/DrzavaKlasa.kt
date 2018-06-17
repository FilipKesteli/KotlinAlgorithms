package ostalo.pocetnica

fun main(args: Array<String>) {
    dvofaktorijela(4)
    val gana = AfrickaDrzava("Gana", 10000000, 21677.4, false, 400, false)
    println(gana.brojLavova)
    println(gana.BDP)
    println(gana.brojStanovnika)
    println(gana.diktatura)
    println(gana.imeDrzave)
    println(gana.isEU)
    println(gana.getInfo())
    println(gana.prosjekRadnihSatiTjedno(200000, false))
    println(gana.prosjekRadnihSatiTjedno(200000, true))
}

open class Drzava(val imeDrzave: String, val brojStanovnika: Int, val BDP: Double, val isEU: Boolean) {
    init {
        require(brojStanovnika > 0) { "Broj stanovnika mora biti veci od 0" }
        require(BDP > 0) { "BDP mora biti veci od 0" }
    }

    open fun getInfo() {
        if (isEU) {
            println("ostalo.pocetnica.Drzava $imeDrzave je u EU.")
        } else {
            println("ostalo.pocetnica.Drzava $imeDrzave nije u EU.")
        }
    }
}

interface zakonORadu {
    var diktatura: Boolean
    fun prosjekRadnihSatiTjedno(brojNezaposlwenih: Int, diktatura: Boolean): Double
}

open class AfrickaDrzava constructor(imeDrzave: String,
                                     brojStanovnika: Int,
                                     BDP: Double,
                                     isEU: Boolean = false, var brojLavova: Int, override var diktatura: Boolean) : Drzava(imeDrzave, brojStanovnika, BDP, isEU), zakonORadu {
    override fun prosjekRadnihSatiTjedno(brojNezaposlwenih: Int, isDiktatura: Boolean): Double {
        return if (!isDiktatura) {
            (brojStanovnika - brojLavova - brojNezaposlwenih) / 10.0
        } else {
            0.0
        }
    }

    override fun getInfo() {
        super.getInfo()
        println("Africka drzava $imeDrzave ima $brojLavova lavova.")
    }
}



