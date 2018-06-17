package matematika.funkcije

// U Genericsu je caka da prilikom definiranja matematika.funkcije
// za koju ne znam kojeg je tipa, moram dati korisniku do znanja
// da mora upisati primjer tipa
// Recimo da imam skup T kao strukturu podataka.
// Tada osim što je prije poziva matematika.funkcije definirano kako je T nešto
// Moram još dodatno reći što je taj T
// i to najbolje u parametru matematika.funkcije
// Na primjer, napravim klasu Struktura1 koja predstavlja
// strukturu podataka. Tada osim toga što moram reći
// kakvog je tipa ta klasa, moram napisati jedan primjer, točnije
// objekt te ostalo.klase

fun main(args: Array<String>) {

}

/**
 * Ne prepoznaje x u returnu - to je lose!
 * Generics mi ovdje moze pomoci jedino kao sredstvo za provjeru
 * Ono sto moram sloziti jesu konkretne ostalo.klase i njihove podklase
 * Nemam sto tu filozofirati s Genericsima - to je jako daleki korak
 */
fun <T> genAlg(x: T): Double {
    return when (x) {
        Int -> 2.0
        Double -> 3.1
        else -> 2.4
    }
}






