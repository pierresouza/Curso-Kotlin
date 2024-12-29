package exerciciosControleDeFluxoFor

fun mostrarValores(n:Int){
    for (i in 1..n){
        for (j in 1..i){
            print("#")
        }
        println()
    }
}

fun main() {
    mostrarValores(3)
}