package `19_Arreglos`

/*Realizar un programa que pida la carga de dos arreglos numéricos enteros de 4 elementos.
Obtener la suma de los dos arreglos elemento a elemento, dicho resultado guardarlo en un tercer arreglo del mismo tamaño.
*/
fun main() {
    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val suma = IntArray(4)

    // Cargar el primer arreglo
    println("Ingrese los 4 elementos del primer arreglo:")
    for (i in 0 until 4) {
        print("Ingrese el ${i + 1} elemento: ")
        arreglo1[i] = readLine()!!.toInt()
    }

    // Cargar el segundo arreglo
    println("Ingrese los 4 elementos del segundo arreglo:")
    for (i in 0 until 4) {
        print("Ingrese el ${i + 1} elemento: ")
        arreglo2[i] = readLine()!!.toInt()
    }

    // Sumar los arreglos
    for (i in 0 until 4) {
        suma[i] = arreglo1[i] + arreglo2[i]
    }

    // Mostrar el resultado
    println("Resultado de la suma de los arreglos:")
    for (i in 0 until 4) {
        println("Elemento $i: ${suma[i]}")
    }
}