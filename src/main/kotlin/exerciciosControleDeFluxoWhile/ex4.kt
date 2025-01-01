package exerciciosControleDeFluxoWhile

fun ex4(str: String): Boolean {
    val strLower = str.lowercase()

    var countX = 0
    var countO = 0

    var i = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }
    return ((countX == countO) && (countX != 0))
}

fun main() {
    println(ex4("xxooox")) // true
    println(ex4("xxxxo")) // false
    println(ex4("bdefghjij")) // false
    println(ex4("ooooxzzzzz")) // false
}