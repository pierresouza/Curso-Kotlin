package exerciciosControleDeFluxoWhile

fun main() {
    val capCaixa:Int = 2000
    val capBalao:Int = 7
    var numBaloes = 0

    while ((numBaloes * capBalao) + capBalao < capCaixa){
        numBaloes++
    }
    println("Foram necessários $numBaloes balões para preencher a caixa de água")
}