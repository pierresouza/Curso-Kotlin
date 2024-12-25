package Controle_de_fluxo

fun main() {
    val ladoA = readLine()!!.toInt()
    val ladoB = readLine()!!.toInt()

    if (ladoA == ladoB) {
        println("Os dois lados são iguais")
    } else {
        println("Os dois lados são diferentes")
    }
}