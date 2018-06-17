package matematika.funkcije.rekurzije

private fun main(args: Array<String>) {
    val alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val elements = alphabet.substring(0, 4)
    perm(elements)
}

// print n! permutation of the elements of array a (not in order)
private fun perm(s: String) {
    val n = s.length
    val a = CharArray(n)
    for (i in 0 until n)
        a[i] = s[i]
    perm(a, n)
}

private fun perm(a: CharArray, n: Int) {
    if (n == 1) {
        println(String(a))
        return
    }
    for (i in 0 until n) {
        swap(a, i, n - 1)
        perm(a, n - 1)
        swap(a, i, n - 1)
    }
}

// swap the characters at indices and and j
private fun swap(a: CharArray, i: Int, j: Int) {
    val c: Char = a[i]
    a[i] = a[j]
    a[j] = c
}