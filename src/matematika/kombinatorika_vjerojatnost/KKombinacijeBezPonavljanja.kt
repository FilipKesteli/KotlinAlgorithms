package matematika.kombinatorika_vjerojatnost

private var v: MutableList<MutableList<Int>> = mutableListOf()
private var w: Int = 0
private var z: MutableList<Int> = mutableListOf()
private var p: MutableList<Int> = mutableListOf()

fun main(args: Array<String>) {
    println(kKombinacijeBezPonavljanja(2, mutableListOf(1, 2, 3, 4, 5)))
    println(kKombinacijeBezPonavljanja(3, mutableListOf(1, 2, 3, 4, 5)))
}

/**
 * Unesi po redu po veličini za početak (kasnije ćemo sortirati)
 * Jedna je varijabla za parametar, jedna za mijenjanje (passed by reference), a jedna za pamćenje (passed by value)
 * Prvi put kad se petlja izvrti, imam spremljen parametar krajevi od korisnika
 * U trenutku zadnjeg rekurzivnog prelaska kroz funkciju, mičemo sve elemente koji se ponavljaju
 * p -> pomocna varijabla -> minimumi
 * a -> glavna pomocna varijabla koja izbacuje van na kraju rekurzije -> bez nje imamo beskonačnu rekurziju
 */
fun kKombinacijeBezPonavljanja(k: Int, krajevi: MutableList<Int>): MutableList<MutableList<Int>> {
    val a: Int = krajevi.sum()
    var b: MutableList<Int> = mutableListOf()
    var c: MutableList<Int> = mutableListOf()

//Prva runda
    if (w == 0) {
        loop1@ for (i in krajevi) {
            z.add(i)
        }
        loop2@ for (i in 0 until k) {
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
            loop3@ for (i in 0 until v.size) {
                if (v[i - j].intersect(v[i - j]).size < p.size) {
                    v.removeAt(i - j)
                    j += 1
                }
            }
            loop4@ for (i in 0 until v.size) {
                if (i < v.size) {
                    var l: Int = 0
                    loop5@ for (k in i + 1 until v.size) {
                        if (v[i].intersect(v[k - l]).size == p.size && i != k) {
                            v.removeAt(k - l)
                            l += 1
                        }
                    }
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
    loop6@ for (i in b.size - 1 downTo 0) {
        if (b[i] == z.min()) {
            b[i] = v[0][i]
            continue@loop6
        }
        if (b[i] > z.min()!!) {
            for (j in z.size - 1 downTo 0) {
                if (b[i] == z[j]) {
                    b[i] = z[j - 1]
                    break@loop6
                }
            }
        }
    }
    return kKombinacijeBezPonavljanja(k, b)
}


