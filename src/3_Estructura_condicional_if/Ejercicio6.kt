package `3_Estructura_condicional_if`

fun main () {
    print("Ingrese primer valor:")
    val valor1: Int = readln() .toInt()
    print("Ingrese segundo valor:")
    val valor2: Int = readln() .toInt()
    if (valor1>valor2) {
        print("El mayor valor es $valor1")
    }
    else {
        print("El mayor es $valor2")
    }
}