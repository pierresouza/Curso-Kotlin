/**
 * Type     Bit
 * Double   64
 * Float    32
 * Long     64
 * Int      32
 * Short    16
 * Byte     8
 * Boolean  ?
 * String   ?
 * Char     ?
 */

fun main() {

    var c: Char = 'a'
    var s: String = "sdjnikgfsçldkgnmsdlçfkmdslfknmzaldfkn"
    var b: Boolean = true

    var double: Double = 10.0
    var float: Float = 10f
    var long: Long = 10L
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10

    var idade = 800

    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")
}

fun main2() {
    //Unsigned

    println("ULong MAX ${ULong.MAX_VALUE} - ${ULong.MIN_VALUE}")
    println("UInt MAX ${UInt.MAX_VALUE} - ${UInt.MIN_VALUE}")
    println("UShort MAX ${UShort.MAX_VALUE} - ${UShort.MIN_VALUE}")
    println("UByte MAX ${UByte.MAX_VALUE} - ${UByte.MIN_VALUE}")

    val abc: UInt = 0u

    val short: UShort = 10u
    val byte: UByte = 10u
    val long: ULong = 10u
}

fun main3() {
    //var nome = "Tony"
    //nome = "Stark"

    val nome = "Tony"
    val sobrenome = "Stark"

    println("Olá ${"$nome $sobrenome"}")
    println("Double: ${Double.MAX_VALUE}")
}

fun main1() {
    //operadores aritméticos

    var idade = 30

    idade = idade + 1
    idade = idade - 1
    idade = idade * 1
    idade = idade / 1

//formato simplificado de iteração
    idade += 20
    idade -= 5
    idade *= 2
    idade /= 4


    println(idade)
}