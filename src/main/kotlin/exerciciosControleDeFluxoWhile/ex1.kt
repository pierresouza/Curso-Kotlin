package exerciciosControleDeFluxoWhile

fun main() {
    var caixaDeAgua:Int = 0
    val balaoDeAgua:Int = 7
    var resultado = 0

    while (caixaDeAgua < 2000){
        caixaDeAgua += balaoDeAgua
        resultado++
    }
    println("Foram necessários $resultado balões")
}