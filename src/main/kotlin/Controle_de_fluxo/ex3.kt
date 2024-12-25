package Controle_de_fluxo

fun qualASaida(num:Int){
    if(num >= 0){
        if(num ==0)
            println("Primeira String")
        else println("Segunda String")
    }
    println("Terceira String")
}

fun main() {
    qualASaida(4)
}