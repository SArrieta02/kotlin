package `7_Estructura_repetitiva_while`

/*Desarrolla un programa que permita cargar dos listas de 5 valores numéricos cada una.
Primero, solicita al usuario que ingrese los 5 valores de la primera lista y acumule la suma de esos valores.

Luego, solicita al usuario que ingrese los 5 valores de la segunda lista y acumule también su suma.

Al finalizar la carga de ambas listas, compara las sumas obtenidas:

Si la suma de la primera lista es mayor, muestra el mensaje "Lista 1 mayor."
Si la suma de la segunda lista es mayor, muestra el mensaje "Lista 2 mayor."
Si ambas sumas son iguales, muestra el mensaje "Listas iguales."
Recuerda que para resolver este problema deberás utilizar dos estructuras repetitivas (una para cada lista).*/
fun main() {
    var x = 1
    var sumaLista1 = 0
    var sumaLista2 = 0

    println("Ingrese los 5 valores de la Lista 1:")
    while (x <= 5) {
        print("Valor $x: ")
        val valor = readln().toInt()
        sumaLista1 += valor
        x += 1
    }

    x = 1
    println("Ingrese los 5 valores de la Lista 2:")
    while (x <= 5) {
        print("Valor $x: ")
        val valor = readln().toInt()
        sumaLista2 += valor
        x += 1
    }

    if (sumaLista1 > sumaLista2) {
        println("Lista 1 mayor.")
    } else if (sumaLista2 > sumaLista1) {
        println("Lista 2 mayor.")
    } else {
        println("Listas iguales.")
    }
}