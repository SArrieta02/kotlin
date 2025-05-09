package `9_Estructura_repetitiva_for`

/*Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
Ejemplo: Si ingresó 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.*/
fun main(){
var multiplo = 1
var operacion = 0
print("Ingrese un valor del 1 al 10:")
val num = readln().toInt()
    for (i in 1..12) {
    operacion = num * multiplo
    multiplo++
    println(operacion)
    }
}