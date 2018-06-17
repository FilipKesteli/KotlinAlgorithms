package matematika.diferencijalne_jednadzbe

fun main(args: Array<String>) {
    println("1D")
    var f: (Double, Double) -> Double = { t, x -> x }
//    println(Math.exp(k * t))
    euler(f, 0.0, 4.0, 1.0, 400)
    println(v)
    v.clear()
    println(v)

    println("2D")
    var fx: (Float, Float, Float) -> Float = { t, x, y -> (2.0f - 1.2f * y) * x }
    var fy: (Float, Float, Float) -> Float = { t, x, y -> (-1.0f + 0.9f * x) * y }
    euler2D(fx, fy, 0.0f, 5.0f, 1.0f, 0.5f, 400)

    println("3D")
    var fx3D: (Float, Float, Float, Float) -> Float = { t, x, y, z -> x + y - z }
    var fy3D: (Float, Float, Float, Float) -> Float = { t, x, y, z -> x + y + y }
    var fz3D: (Float, Float, Float, Float) -> Float = { t, x, y, z -> -x - y - z }
    euler3D(fx3D, fy3D, fz3D, 0.0f, 5.0f, 1.0f, 0.5f, 1.5f, 400)

    println("nD")
    var f1: (MutableList<Double>) -> Double = { mutableList: MutableList<Double> -> 1.0 * mutableList[0] + (-1.2) * mutableList[1] * 0.3 * mutableList[2] }
    var f2: (MutableList<Double>) -> Double = { mutableList: MutableList<Double> -> 0.4 * mutableList[0] + (1.9) * mutableList[1] * 0.3 * mutableList[2] }
    var f3: (MutableList<Double>) -> Double = { mutableList: MutableList<Double> -> 1.3 * mutableList[0] + (-1.1) * mutableList[1] * 0.3 * mutableList[2] }
    var f4: (MutableList<Double>) -> Double = { mutableList: MutableList<Double> -> -0.9 * mutableList[0] + (-1.2) * mutableList[1] * 0.3 * mutableList[2] }
    var x0: MutableList<Double> = mutableListOf(1.0, 2.0, -3.0, 2.3)
    eulerND(0.0, 5.0, x0, 400, f1, f2, f3, f4)
}

var v: MutableList<Double> = mutableListOf()
var vx: MutableList<Float> = mutableListOf()
var vy: MutableList<Float> = mutableListOf()
var vz: MutableList<Float> = mutableListOf()
var w: MutableList<MutableList<Double>> = mutableListOf()

/**
 * Imamo samo pocetni uvjet (dakle, jedan uvjet!)
 * Funkcija vraca trazenu vrijednost u trenutku tn
 */
fun euler(f: (Double, Double) -> Double, t0: Double, tn: Double, x0: Double, n: Int): Double {
    var dt: Double = (tn - t0) / n
    var x = x0
    for (i in 1..n) {
        var t = t0 + i * dt
        var dx = f(t, x) * dt
        x += dx
        v.add(x)
    }
    return x
}

/**
 * 2D rješenje -> mogu iskoristiti u aplikaciji Romeo and Julija
 */
fun euler2D(fx: (Float, Float, Float) -> Float,
            fy: (Float, Float, Float) -> Float,
            t0: Float, tn: Float, x0: Float, y0: Float, n: Int): MutableList<Float> {
    var dt: Float = (tn - t0) / n
    var x = x0
    var y = y0
    for (i in 1..n) {
        var t = t0 + i * dt
        var dx = fx(t, x, y) * dt
        var dy = fy(t, x, y) * dt
        x += dx
        y += dy
        vx.add(x)
        vy.add(y)
    }
    var a: MutableList<Float> = mutableListOf(x, y)
    return a
}

fun euler3D(fx: (Float, Float, Float, Float) -> Float,
            fy: (Float, Float, Float, Float) -> Float,
            fz: (Float, Float, Float, Float) -> Float,
            t0: Float, tn: Float, x0: Float, y0: Float, z0: Float, n: Int): MutableList<Float> {
    var dt: Float = (tn - t0) / n
    var x = x0
    var y = y0
    var z = z0
    for (i in 1..n) {
        var t = t0 + i * dt
        var dx = fx(t, x, y, z) * dt
        var dy = fy(t, x, y, z) * dt
        var dz = fz(t, x, y, z) * dt
        x += dx
        y += dy
        z += dz
        vx.add(x)
        vy.add(y)
        vz.add(z)
    }
    var a: MutableList<Float> = mutableListOf(x, y)
    return a
}

fun eulerND(t0: Double, tn: Double, x0: MutableList<Double>, n: Int, vararg f: (MutableList<Double>) -> Double): MutableList<Double> {
    var dt: Double = (tn - t0) / n
    var dx: MutableList<Double> = mutableListOf()
    dx.add(dt)
    var x: MutableList<Double> = x0
    var F: Array<out (MutableList<Double>) -> Double> = f
    for (i in 1 until x0.size) {
        dx.add(0.0)
    }
    for (i in 1..n) {
        var t = t0 + i * dt
        x[0] = t
        for (j in 1 until x0.size) {
            dx[j] = F[j](x) * dt
            x[j] += dx[j]
        }
        w.add(x)
    }
    println(x)
    return x
}

/**
 * Lukavo rjesenje za android aplikaciju
 * Romeo and Julia dif jedn
 */
fun eulerRomeo2D(a: Float, b: Float, c: Float, d: Float, tn: Float): MutableList<Float> {
    var fx: (Float, Float, Float) -> Float = { t, x, y -> a * x + b * y }
    var fy: (Float, Float, Float) -> Float = { t, x, y -> c * x + d * y }
    return euler2D(fx, fy, 0.0f, tn, 1.0f, 0.5f, 4000)
}

fun eulerRomeo3D(a: Float, b: Float, c: Float, d: Float, tn: Float): MutableList<Float> {
    var fx: (Float, Float, Float, Float) -> Float = { t, x, y, z -> a * x + b * y }
    var fy: (Float, Float, Float, Float) -> Float = { t, x, y, z -> c * x + d * y }
    var fz: (Float, Float, Float, Float) -> Float = { t, x, y, z -> c * x + d * y }
    return euler3D(fx, fy, fz, 0.0f, tn, 1.0f, 0.5f, 1.5f, 4000)
}
