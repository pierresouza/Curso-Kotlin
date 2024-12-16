package exercicios

fun main() {
    val a = false
    val b = false
    val c = true
    val d = true

    println(a && b && c && d)
    println(!a && !b && (c && d))
    println(a && ((b || c) || d))
    println(a || ((!b && c) || !d))
}

fun ex2(cargo: String, experiencia: Int): Float {
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

fun ex1(cargo: String): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro de software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }
    return bonus
}