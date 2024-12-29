package controleDeFluxo.`if`

fun main() {
    val ladoA = readLine()!!.toInt()
    val ladoB = readLine()!!.toInt()

    if (ladoA == ladoB) {
        println("Os dois lados são iguais, então é um quadrado")
    } else {
        println("Os dois lados são diferentes, então não é um quadrado")
    }
}