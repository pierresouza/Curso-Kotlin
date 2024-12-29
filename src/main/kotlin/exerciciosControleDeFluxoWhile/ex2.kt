package exerciciosControleDeFluxoWhile

fun main() {
    var valor = 0
    while (valor <= 50) {
    if (valor%3 == 0 && valor%5 == 0) {
        println("FizzBuzz")
    } else if (valor % 3 == 0) {
        println("Buzz")
    }else if (valor%5 == 0){
        println("Fizz")
    }else{
        println(valor)
    }
        valor++
    }
}