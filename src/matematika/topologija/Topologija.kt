package matematika.topologija

fun main(args: Array<String>) {
    var X: MutableSet<String> = mutableSetOf("a", "b")
    var T: MutableSet<MutableSet<String>> = mutableSetOf(mutableSetOf("a", "b"), mutableSetOf("a"), mutableSetOf(), mutableSetOf("b"))
    println(presjekSkupovaUSkupuSkupova(T))
    println(unijaSkupovaUSkupuSkupova(T))
    println(isTopologija(T, X))
}

/**
 * Imamo 3 uvjeta za topologiju T nad skupom X:
 * (1) prazan skup and citav skup jesu topologija
 * (2) presjek konacno mnogo skupova je topologija
 * (3) unija beskonacno mnogo skupova je topologija
 * c je pomocna lista koja govori je li nesto topologija or ne -> dobro je znati koji od 3 uvjeta nisu ispunjeni
 * Uociti kako radim s listama, a ne setovima iz razloga sto je prakticnije and sto u analogno-matematicki na papiru,
 * algoritamski gledano razmisljamo na ovakav nacin
 * a je prazan skup
 */
fun isTopologija(T: MutableSet<MutableSet<String>>, X: MutableSet<String>): Boolean {
    var a: MutableSet<String> = mutableSetOf()
    var c: MutableList<Boolean> = mutableListOf(false, false, false, false)
    for (i in T) {
        if (i == a) {
            c[0] = true
            break
        }
    }
    for (i in T) {
        if (i == X) {
            c[1] = true
            break
        }
    }
    for (i in T) {
        if (presjekSkupovaUSkupuSkupova(T) == i) {
            c[2] = true
            break
        }
    }
    for (i in T) {
        if (unijaSkupovaUSkupuSkupova(T) == i) {
            c[3] = true
            break
        }
    }
    for (i in c) {
        if (i == false) {
            return false
        }
    }
    return true
}

private fun presjekSkupovaUSkupuSkupova(T: MutableSet<MutableSet<String>>): Set<String> {
    var a: Set<String> = mutableSetOf()
    a = T.elementAt(0)
    for (i in T) {
        a = a.intersect(i)
    }
    return a
}

private fun unijaSkupovaUSkupuSkupova(T: MutableSet<MutableSet<String>>): Set<String> {
    var a: Set<String> = mutableSetOf()
    a = T.elementAt(0)
    for (i in T) {
        a = a.union(i)
    }
    return a
}