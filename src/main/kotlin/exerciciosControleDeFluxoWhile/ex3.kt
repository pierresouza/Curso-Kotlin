package exerciciosControleDeFluxoWhile

fun ex3(str:String){
    var i = str.length - 1
    while ( i >= 0){
        print(str[i])
        i--
    }
}


fun main() {
    ex3("Meu nome é julius")
}