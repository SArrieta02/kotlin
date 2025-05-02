package `7_Estructura_repetitiva_while`

/*Escribir un programa que solicite la carga de un valor positivo y nor muestre desde 1 hasta el valor ingresado de uno en una.
Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30
 */
fun main() {
    print("Ingrese un valor:")
    val valor = readln(). toInt()
    var x = 1
    while (x <= valor) {
        println(x)
        x = x + 1
    }
}