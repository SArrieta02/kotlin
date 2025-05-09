package `9_Estructura_repetitiva_for`

/*Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.*/
fun main() {
    var suma = 0
    var cant = 0
    for (i in 1 .. 10) {
        println("Ingrese un número:")
        val cant = readln().toInt()
        if (i > 5)
            suma += cant
    }
    println("La suma de los ultimos 5 números son: $suma")
}