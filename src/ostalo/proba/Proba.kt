package ostalo.proba

fun main(args: Array<String>) {
    forPetlja()
    listaFun()
}

fun forPetlja() {
    val lista: MutableList<Double> = mutableListOf(1.0, 4.0, 5.0, 9.0)
    for (i in lista.indices) {
        println(i)
    }
}

/**
 * Trebam paziti na scope!!
 */
fun listaFun() {
    var lista: MutableList<Double> = mutableListOf(1.0, 4.0, 5.0, 9.0)
    var lista2: MutableList<MutableList<Double>> = mutableListOf()
    val lista3: MutableList<MutableList<Double>> = mutableListOf()
    lista2.add(lista)
    lista3.add(lista)
    for (i in lista) {
        println(i)
    }
    for (i in lista2) {
        println(i)
    }
    for (i in lista3) {
        println(i)
    }
    lista.removeAll(lista)
    for (i in lista2) {
        println(i)
    }
    println("*****************************************************************************************+")
    for (i in lista3) {
        println(i)
    }
    println(lista2.size)
    println(lista2[0].size)
    if (lista.size == 0) {
        println("Dobro je")
    }
    lista.add(4.3)
    lista.add(9.7)
    println(lista)
}

fun forPetlja2(brojRedaka: Int, brojStupaca: Int) {
    for (i in 1..brojStupaca) {
        for (i in 1..brojRedaka) {
            println("ok")
        }
    }
}

fun listaFunkcijaUParametru(lista: MutableList<Double>) {

}

/*loop_i@ for (and in L) {
    loop_j@ for (j in 0 until and) {
        if (j <= and - j) {
            println(L[and + j])
        } else {
            break@loop_j
        }
    }
}*/

/*
fun transponiranjeMatrice() {
    var v1: Matrica = Matrica(brojStupaca, brojRedaka, mutableListOf())
    var b: MutableList<Double> = mutableListOf()
    var c: MutableList<MutableList<Double>> = mutableListOf()
    for (and in retci[0].indices) { //broj stupaca
        b.removeAll(b)
        for (j in retci.indices) { //broj redaka
            b.add(retci[and][j])
        }
//            c.add(b)
        v1.retci.add(b)
    }
}*/

/*fun transponiranjeMatrice(): Matrica {
//        var a: Matrica = Matrica(brojStupaca, brojRedaka, mutableListOf())
    var b: MutableList<Double> = mutableListOf()
    var c: MutableList<MutableList<Double>> = mutableListOf()
    for (j in 0 until brojStupaca) {
        b.removeAll(b)
        val e: MutableList<Double> = mutableListOf()
        for (and in 0 until brojRedaka) {
//                b.add(retci[and][j])
            e.add(retci[and][j])
//                c[j].add(retci[and][j])
        }
        c.add(e)
        *//*for (k in b) {
            c.add(b)
        }*//*
    }
    var v3: Matrica = Matrica(brojStupaca, brojRedaka, c)
    return v3
}*/

//    fun nulMatrica() {
////        var a: Matrica = Matrica(brojStupaca, brojRedaka, )
//        var b: MutableList<Double> = mutableListOf()
//        for (and in 0 until brojRedaka) {
//            for (j in 0 until brojStupaca) {
//                b.add(0)
//            }
//        }
//    }


/*
class Matrica(var brojRedaka: Int, var brojStupaca: Int, var retci: MutableList<MutableList<Double>>) {
    init {
        var c = brojRedaka * brojStupaca
        var v3: MutableList<Double> = mutableListOf()
        for (and in 0 until brojRedaka) {
            for (j in 0 until brojStupaca) {
                v3.add(retci[and][j])
            }
        }
        */
/*for (and in retci) {
            for (j in and) {
                d.add(j)
            }
        }*//*

        require(retci.size == brojRedaka && d.size == c)
    }*/
