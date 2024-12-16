fun maiorDeIdade(idade:Int) {
    if (idade > 18) {
        println("Maior de idade")

        if(idade > 60){
            println("Terceira idade")
        }
    } else if(idade < 10){
        println("Criança")
    }else{
        println("Menor de idade")
    }
}

fun saudacao(dia: Boolean):String{
    if (dia){
        return ("Bom dia")
    }else{
        return ("Boa noite")
    }
}

fun main() {
    maiorDeIdade(19)
    maiorDeIdade(15)
}