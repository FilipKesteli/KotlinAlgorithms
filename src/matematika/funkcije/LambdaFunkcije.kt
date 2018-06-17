package matematika.funkcije

fun main(args: Array<String>) {
    val x: List<Int> = arrayListOf(1, 2, 3)
    for (i in x) {
        println(i)
    }
    println(x)
    val y1 = sum1(2, 5)
    val y2 = sum2(2, 5, 6, 7)
    val y3 = sum3(2.0)
    println(y1)
    println(y2)
    println(y3)
    val y4 = sum4(2.4, -3.2, 5.6 - 3.2)
    println(y4)

    val fruits: MutableList<String> = mutableListOf("ananas", "naranca", "as")
    fruits
            .filter { it.startsWith("v1") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

    var X: MutableList<Double> = mutableListOf(3.2, 4.6, 1.8)
    X[0] = 2.9
}

// TODO Lambda matematika.funkcije su pogodne za matematika.funkcije u funkcijama

// Funkcija više varijabli
val sum1: (Int, Int) -> Int = { x, y -> x + y }

// Funkcija više varijabli
val sum2: (Int, Int, Int, Int) -> Int = { x, y, z, w -> x + y + z + w }

// Vektorska funckija jedne varijable
val sum3: (Double) -> List<Double> = { x -> listOf(x, Math.pow(x, 2.0), Math.pow(x, 3.0)) }

// Vektorska funckija više varijabli
val sum4: (Double, Double, Double) -> List<Double> = { x, y, z -> listOf(Math.floor(x), Math.floor(y), Math.floor(z)) }



