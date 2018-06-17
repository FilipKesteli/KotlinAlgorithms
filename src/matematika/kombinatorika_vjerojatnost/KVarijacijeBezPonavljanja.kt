package matematika.kombinatorika_vjerojatnost

private var v: MutableList<MutableList<Int>> = mutableListOf()
private var w: Int = 0
private var z: MutableList<Int> = mutableListOf()
private var p: MutableList<Int> = mutableListOf()

fun main(args: Array<String>) {
    println(kVarijacijeBezPonavljanja(3, mutableListOf(1, 2, 3, 4)))
    println(kVarijacijeBezPonavljanja(3, mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).size)
}

/**
 * Unesi po redu po veličini za početak (kasnije ćemo sortirati)
 * Jedna je varijabla za parametar, jedna za mijenjanje (passed by reference), a jedna za pamćenje (passed by value)
 * Prvi put kad se petlja izvrti, imam spremljen parametar krajevi od korisnika
 * U trenutku zadnjeg rekurzivnog prelaska kroz funkciju, mičemo sve elemente koji se ponavljaju
 * p -> pomocna varijabla -> minimumi
 * a -> glavna pomocna varijabla koja izbacuje van na kraju rekurzije -> bez nje imamo beskonačnu rekurziju
 */
fun kVarijacijeBezPonavljanja(k: Int, krajevi: MutableList<Int>): MutableList<MutableList<Int>> {
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
//        println(v)
        if (a == p.sum()) {
            var j: Int = 0
            for (i in 0 until v.size) {
                if (v[i - j].intersect(v[i - j]).size < p.size) {
                    v.removeAt(i - j)
                    j += 1
                }
            }
            var d: MutableList<MutableList<Int>> = v.toMutableList()
            v.clear()
            w = 0
            z.clear()
            p.clear()
            return d
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
    return kVarijacijeBezPonavljanja(k, b)
}




