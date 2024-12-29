package controleDeFluxo.doWhile

fun main() {
    do {
        println("Qual é o seu nome ?")
        val value = readLine()
    }while (value == "")
}