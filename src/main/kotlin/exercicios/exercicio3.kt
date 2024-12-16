package exercicios


fun ex1(cargo: String, experiencia: Int): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        if (experiencia > 2) {
            bonus = 2000f
        } else {
            bonus = 3000f
        }
    } else if (cargo == "Coordenador") {
        if (experiencia < 1) {
            bonus = 1500f
        } else {
            bonus = 1800f
        }
    } else if (cargo == "Engenheiro de software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }
    return bonus
}


fun bonus(cargo: String): Float {
    return if (cargo == "Gerente") {
        2000f
    } else if (cargo == "Coordenador") {
        1500f
    } else if (cargo == "Engenheiro de software") {
        1000f
    } else if (cargo == "Estagiário") {
        500f
    }else{
        0f
    }
}

fun bonusWhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Eng. de software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f

    }

}

fun main() {

}