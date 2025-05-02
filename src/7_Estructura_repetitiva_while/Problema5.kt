package `7_Estructura_repetitiva_while`

/*Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.*/
fun main() {
    var numero = 8
    while (numero <= 500) {
        println(numero)
        numero += 8
    }
}