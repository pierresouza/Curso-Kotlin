package exercicios

fun converteAnos(anos:Int){
    println("X $anos equivalem a: $anos ")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} minutos")
}

fun caracteres(str: String): Int{
    return str.length
}

fun cubo(n:Int):Int{
    return n*n*n
}

fun milhasKM(milhas:Float):Float{
    return milhas * 1.6f
}

fun ex5(str: String) {
    println(str.replace("a", "x", true).lowercase())
}



fun main() {
    //converteAnos(2)
    println(caracteres("dfgdfgdfgdfgd sdfsdfsdfs"))
    println(cubo(3))
    println(milhasKM(100f))
    ex5("AAaaAAaaaaaaaAAaaaaAaaaAAAaAAAAaa sdfgsdgfsdfgdFGDFGdfgDFGDFG dfGdfG Dfg")
}