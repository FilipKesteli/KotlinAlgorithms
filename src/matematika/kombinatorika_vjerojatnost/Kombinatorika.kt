package matematika.kombinatorika_vjerojatnost

// TODO Zanimljiva bi bila igrica pod nazivom Intuition
// TODO Kao igrač pogađa vjerojatnost ishoda nekog događaja...
// TODO Zanimaju me samo Int and Double
// TODO Raspodjele napraviti, v1 također and posebne vrste skupova u obliku objekata
// TODO od ostalo.klase koja sadrži posebne vrste metoda, od kojih su neke and faktorijela and povrh
// TODO Za svaki diskretno-vjerojatnosni problem složiti funkciju
// TODO S vremenom se proširiti na numeričku matematiku and rješavanje derivacija, integrala and diferencijalnih jednadžbi

fun main(args: Array<String>) {
    println(mTeroNfaktorijela(4, 1))
    println(povrh(4, 2))
    println(povrh(3, 2))
    println(faktorijela(6))
    println(permutacijaBezP(mutableListOf(1, 2, 3, 4, 5)))
}

/**
 * Probamo s obicnim 3! (faktorijela)
 */
fun permutacijaBezP(L: MutableList<Int>): MutableList<MutableList<Int>> {
    var a: MutableList<MutableList<Int>> = mutableListOf(L)
    for (i in L.size - 1 downTo 1) {
        var b: MutableList<Int> = L.toMutableList()
        var c = b[i - 1] //pomocna varijabla u swapu
        b[i - 1] = b[i]
        b[i] = c
        a.add(b)
    }

    for (i in L.size - 1 downTo 1) {
        var d: MutableList<Int> = L.toMutableList()
        var c = d[0] //pomocna varijabla u swapu
        d[0] = d[i]
        d[i] = c
        a.add(d)
    }
    return a
}

fun permutacijaRekurzijom(L: MutableList<Int>) {
    tailrec fun permutacija(L: MutableList<Int>) {

    }
}

/**
 * TODO Napraviti funkciju koja umjesto što oduzima, dijeli - Double brojevi...
 * TODO Iskoristiti mTeroNfaktorijela funkciju npr. kod kombinacija bez ponavljanja (problemi s kartama)
 */
fun mTeroNfaktorijela(n: Int, m: Int): Int {
    tailrec fun fact2tail(i: Int, j: Int): Int {
//        println(and)
        return if (i <= 0) j
        else fact2tail(i - m, i * j)
    }
    return fact2tail(n, 1)
}

fun faktorijela(n: Int): Int {
    tailrec fun fact2tail(i: Int, j: Int): Int {
//        println(and)
        return if (i <= 0) j
        else fact2tail(i - 1, i * j)
    }
    return fact2tail(n, 1)
}

fun povrh(n: Int, k: Int): Int {
    return mTeroNfaktorijela(n, 1) / (mTeroNfaktorijela(n - k, 1) * mTeroNfaktorijela(k, 1))
}

fun povrh2(n: Int, k: Int): Int {
    return faktorijela(n) / (faktorijela(n - k) * faktorijela(k))
}

/**
 * exception division by zero se stalno pojavljuje!...
 * moram staviti Long
 */
fun povrh3(n: Int, k: Int): Long {
    var a: Long = 1
    if (k < n - k) {
        for (i in n downTo n - k + 1) {
            a *= i
        }
        for (i in k downTo 1) {
            a /= i
        }
        return a
    } else {
        for (i in n downTo k + 1) {
            a *= i
        }
        for (i in n - k downTo 1) {
            a /= i
        }
        return a
    }
}

fun brojPermutacijaBezPonavljanja(n: Int): Int {
    return faktorijela(n)
}

fun brojPermutacijaSPonavljanjanjem(n: Int, K: List<Int>): Int {
    var a: Int = 1
    for (i in K) {
        a *= faktorijela(i)
    }
    return faktorijela(n) / a
}

/**
 * Biramo k elemenata od n
 * Bitan poredak (Kartezijev produkt) - uređene k-torke
 * Bez ponavljanja
 */
fun brojVarijacijaBezPonavljanja(n: Int, k: Int): Int {
    return faktorijela(n) / faktorijela(k)
}

fun varijacijeBezPonavljanja(n: MutableList<Int>, k: Int): MutableList<MutableList<Int>> {
    var a: MutableList<MutableList<Int>> = mutableListOf()

    return a
}


/**
 * Biramo k elemenata od n
 * Bitan poredak (Kartezijev produkt) - uređene k-torke
 * S ponavljanjem
 */
fun brojVarijacijaSPonavljanjem(n: Int, k: Int): Int {
    return Math.round(Math.pow(n.toDouble(), k.toDouble())).toInt()
}

/**
 * Treba paziti da stavimo b.toMutableList() (pass value, v1 ne address)!!! - zamijenjuje jednu for petlju
 * Ovdje ima hrpa trikova! Bitan algoritam!
 * Varijacije s ponavljanjem n^k
 * TODO Na temelju danih krajeva, izbrojati koliko je koja lista velika and na temelju toga izraditi algoritam
 */
fun bitnoVarijacijaSPonavljanjem(n: Int): MutableList<MutableList<Int>> {
    var a: MutableList<MutableList<Int>> = mutableListOf()
    for (i in 1..n) {
        var b: MutableList<Int> = mutableListOf(0, 0, 0)
        b[0] = i
        for (j in 1..n) {
            b[1] = j
            for (k in 1..n) {
                b[2] = k
                a.add(b.toMutableList())
            }
        }
    }
    return a
}

fun varijacijeSPonavljanjem() {

}

/**
 * Biramo k elemenata od n
 * NIJE bitan poredak (Kartezijev produkt) - neuređene k-torke (k-skupovi)
 * Bez ponavljanja
 */
fun brojKombinacijaBezPonavljanja(n: Int, k: Int): Int {
    return povrh(n, k)
}

/**
 * Biramo k elemenata od n
 * NIJE bitan poredak (Kartezijev produkt) - neuređene k-torke (k-skupovi)
 * S ponavljanjem
 */
fun brojKombinacijaSPonavljanjem(n: Int, k: Int): Int {
    return povrh(n + k - 1, k)
}

/**
 * Radimo podjelu n istih elemenata na s osoba
 * Zapravo imamo s skupova s istim elementima, ali različitih veličina (n_1,...,n_s)
 * NIJE bitan poredak (Kartezijev produkt) - neuređene n_j-torke (n_j-skupovi)
 * S ponavljanjem je po definiciji - nije relevantno pitanje
 */
fun brojNepostenaRazdiobaIstovrsnihPredmeta(n: Int, s: Int): Int {
    return povrh(n + s - 1, s - 1)
}

/**
 * Radimo podjelu n istih elemenata na s osoba
 * Zapravo imamo s skupova s istim elementima, ali različitih veličina (n_1,...,n_s)
 * NIJE bitan poredak (Kartezijev produkt) - neuređene n_j-torke (n_j-skupovi)
 * S ponavljanjem je po definiciji - nije relevantno pitanje
 * Ali za razliku od nepostene razdiobe, u postenoj razdiobi svaka osoba dobiva barem 1 element
 */
fun brojPostenaRazdiobaIstovrsnihPredmeta(n: Int, k: Int): Int {
    return povrh(n + k - 1, k)
}

/**
 * Radimo podjelu n istih elemenata na s osoba
 * Zapravo imamo s skupova s istim elementima, ali različitih veličina (n_1,...,n_s)
 * NIJE bitan poredak (Kartezijev produkt) - neuređene n_j-torke (n_j-skupovi)
 * S ponavljanjem je po definiciji - nije relevantno pitanje
 * Svaka osoba dobiva barem svoj broj elemenata
 * Ovdje mora biti zadovoljena nejednakost: n_1+...+n_s <= n
 * TODO Riješiti ovaj problem najprije na papiru
 */
fun brojVisestrukoPostenaRazdiobaIstovrsnihPredmeta(n: Int, K: List<Int>) {
    // Nije nista posebno!
}

/**
 * Radimo razdiobu n različitih predmeta u k kutija (dakako različitih)
 * tako da imamo n1 elemenata u prvoj kutiji, n2 u drugoj... nk u k-toj
 */
fun brojRazdiobaRazlicitihPredmeta(n: Int, K: List<Int>): Int {
    var a: Int = 1
    for (i in K) {
        a *= faktorijela(i)
    }
    return faktorijela(n) / a
}

/**
 * Kutije s ponavljanjem - jedna kutija može biti pridružena više predmeta
 * aaaa -> Jedna kutija na 4 predmeta
 * Varijacije s ponavljanjem u pozadini
 */
fun brojnRazlicitihPredmetaUkRazlicitihKutija(n: Int, k: Int): Int {
    return Math.pow(k.toDouble(), n.toDouble()).toInt()
}




