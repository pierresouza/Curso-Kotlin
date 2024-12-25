package Controle_de_fluxo

fun portaria() {
    println("Bem-vindo ao condomínio")
    print("Qual a sua idade: ")
    val idade = readLine()?.toInt()

    // Validação da idade
    if (idade == null || idade < 18) {
        println("Entrada proibida para menores de 18 anos")
        return
    }

    print("Qual o seu tipo de convite (Comum, Premium ou Luxo): ")
    val convite = readLine()

    print("Qual o código do convite (Comum: XT, Premium/Luxo: XL): ")
    val codigoConvite = readLine()

    // Validação do tipo de convite e código
    val entradaPermitida = when (convite) {
        "Comum" -> codigoConvite == "XT"
        "Premium", "Luxo" -> codigoConvite == "XL"
        else -> false
    }

    // Mensagem final
    if (entradaPermitida) {
        println("Entrada permitida")
    } else {
        println("Entrada negada")
    }
}

fun main() {
    portaria()
}
