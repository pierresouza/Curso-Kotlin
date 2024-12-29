package controleDeFluxo.`if`

fun main() {
    val ladoA = readLine()!!.toInt()
    val ladoB = readLine()!!.toInt()
    val ladoC = readLine()!!.toInt()

    if (ladoA == ladoB && ladoB == ladoC) {
        println("Os três lados são iguais, é um triângulo equilátero")
    } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
        println("Dois lados são iguais e um é diferente, é um triângulo isósceles")
    } else {
        println("Os três lados são diferentes entre si, é um triângulo escaleno")
    }
}