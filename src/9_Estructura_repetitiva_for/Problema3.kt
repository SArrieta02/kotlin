package `9_Estructura_repetitiva_for`

/*Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)
*/
fun main() {
    var multiplo = 1
    var operacion = 0
    for (i in 1..10) {
        operacion = 5 * multiplo
        multiplo++
        println(operacion)
    }
}