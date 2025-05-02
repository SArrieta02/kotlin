package `7_Estructura_repetitiva_while`

/*Realizar un programa que imprima 25 términos de la serie
11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado)*/
fun main() {
    var numero = 0
    var x = 0
    while (x <= 25) {
        numero = numero + 11
        x = x + 1
        println(numero)
    }
}