package exerciciosControleDeFluxoFor

fun main() {
    var soma = 0
    for (i in 1..500){
        soma += i
    }
    println("A soma dos valores de 1 até 500 é: $soma")
}