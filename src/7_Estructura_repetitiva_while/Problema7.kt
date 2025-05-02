package `7_Estructura_repetitiva_while`

/*Desarrollar un programa que permita cargar n números enteros y luego nos informe cuántos valores fueron pares y cuántos impares.
Emplear el operador "%" en la condición de la estructura condicional:*/
fun main() {
    print("Escriba cuantos números va a ingresar:")
    val n = readln().toInt()
    var par = 0
    var impar = 0
    var x = 1
    while (x <= n) {
        print("Escriba el número que desee:")
        val numero = readln(). toInt()
        if ( numero % 2 == 0){
            par = par + 1
        }else{
            impar = impar + 1
        }
        x = x + 1
    }
        println("Los números pares son: $par")
        println("Los números impares son: $impar")


}