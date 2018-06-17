 package matematika.kombinatorika_vjerojatnost.proba

private var v: MutableList<MutableList<Int>> = mutableListOf()
private var w: Int = 0
private var z: MutableList<Int> = mutableListOf()
private var p: MutableList<Int> = mutableListOf()

fun main(args: Array<String>) {
    permutacijeSPonavljanjem(3, mutableListOf(1, 3, 7))
    println(v.size)
    v.clear()
}

/**
 * Unesi po redu po veličini za početak (kasnije ćemo sortirati)
 * Jedna je varijabla za parametar, jedna za mijenjanje (passed by reference), a jedna za pamćenje (passed by value)
 * Prvi put kad se petlja izvrti, imam spremljen parametar krajevi od korisnika
 */
fun permutacijeSPonavljanjem(k: Int, krajevi: MutableList<Int>) {
    val a: Int = krajevi.sum()
    var b: MutableList<Int> = mutableListOf()
    var c: MutableList<Int> = mutableListOf()

//Prva runda
    if (w == 0) {
        for (i in krajevi) {
            z.add(i)
        }
        for (i in 0 until k) {
            b.add(krajevi.max()!!)
            c.add(krajevi.max()!!)
            p.add(krajevi.min()!!)
        }
        v.add(c)
    } else { //Druga runda
        b = krajevi.toMutableList()
        c = b.toMutableList()
        v.add(c)
        println(v)
        if (a == p.sum()) {
            return
        }
    }
    w += 1
    loop1@ for (i in b.size - 1 downTo 0) {
        if (b[i] == z.min()) {
            b[i] = v[0][i]
            continue@loop1
        }
        if (b[i] > z.min()!!) {
            for (j in z.size - 1 downTo 0) {
                if (b[i] == z[j]) {
                    b[i] = z[j - 1]
                    break@loop1
                }
            }
        }
    }
    permutacijeSPonavljanjem(k, b)
}




