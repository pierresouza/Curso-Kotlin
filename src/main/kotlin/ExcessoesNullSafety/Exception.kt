package ExcessoesNullSafety

fun main() {

    try {
        val s: String? = null
        println(s!!.length)
    } catch (e: NullPointerException) {
        println("Variavel nula")
    } catch (e: ArithmeticException) {
        println("Impossível dividir por 0")
    } catch (e: Exception) {
        println("Generica")
    }
    println("Fim")
}