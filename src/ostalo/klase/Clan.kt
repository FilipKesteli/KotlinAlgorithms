package ostalo.klase

/**
 * zlato - pomoć nekome nemoćnom
 * srebro - obična razmjena usluga
 * bronca - management (pronađen netko tko može napraviti posao)
 */
open class Clan(val imeClana: String,
                val prezimeClana: String,
                val godine: Int,
                val OIB: Int,
                val zanimanja: List<String>,
                val godineIskustva: List<Int>,
                val ocijenaZanimanja: List<Double>,
                val brojIzvrsenihRadnji: List<Int>,
                val trebam: List<String>,
                val znam: List<String>,
                val imam: List<String>,
                val zlato: Int = 0,
                val srebro: Int = 0,
                val bronca: Int = 0) : ZakonORadu {
    init {
        require(zanimanja.size == godineIskustva.size)
        require(zanimanja.size == ocijenaZanimanja.size)
        require(brojIzvrsenihRadnji.size == ocijenaZanimanja.size)
        require(godine > 18)
    }
}

interface ZakonORadu {

}

open class Transakcija() {

}

interface ZakonOTransakcijama {
    fun clanak1()
    fun obaviTransakciju()
    fun iznesiNaRacun()
}