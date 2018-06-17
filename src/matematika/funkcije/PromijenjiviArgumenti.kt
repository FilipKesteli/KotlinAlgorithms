package matematika.funkcije

fun main(args: Array<String>) {
    promijenjiviBrojArgumenata("v1", "b", "dafa")
    promijenjiviBrojArgumenata2(1, 2, 3, 2323, 2)
    promijenjiviBrojArgumenata3(
            listOf(5, 2, 3, 4, 32, 3),
            listOf(12, 2, 3),
            listOf(2, 2134))
    promijenjiviBrojArgumenata4(
            mutableListOf(5.0, 2.0, 3.0, 4.0, 32.0, 3.0),
            mutableListOf(12.0, 2.0, 3.0),
            mutableListOf(2.0, 2134.0))
}

/**
 * Prilikom instanciranja compiler ne razumije da ce se kasnije
 * parametri zapravo ponasati kao redak
 */
fun promijenjiviBrojArgumenata(vararg string: String) {
    for (i in string) {
        println(i)
    }
}

fun promijenjiviBrojArgumenata2(vararg int: Int) {
    for (i in int) {
        println(i)
    }
}

fun promijenjiviBrojArgumenata3(vararg intLista: List<Int>) {
    for (i in intLista) {
        for (j in i) {
            println(j)
        }
    }
    intLista
            .asSequence()
            .flatMap { it.asSequence() }
            .forEach { println(it) }
    intLista
            .flatMap { it }
            .forEach { println(it) }
    val a: MutableList<List<Int>> = mutableListOf()
    var b: List<Int> = listOf()
    for (i in intLista) {
        b += i
        a.add(i)
    }
    for (i in b) {
        println(i)
    }
    for (i in a) {
        println(i)
    }
    println(b)
}

fun promijenjiviBrojArgumenata4(vararg retci: MutableList<Double>) {
    var a: MutableList<MutableList<Double>> = mutableListOf()
    for (i in retci) {
        a.add(i)
    }
    println(a.size)
}
