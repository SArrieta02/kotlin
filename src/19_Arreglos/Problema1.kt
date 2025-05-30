package `19_Arreglos`

/*Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
El valor acumulado de todos los elementos.
El valor acumulado de los elementos que sean mayores a 36.
Cantidad de valores mayores a 50.
(Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar cada elemento)*/

fun main(){
    var suma = 0
    var mayores = 0
    var sumas50 = 0
    val arreglo = IntArray(8)
    for (i in arreglo.indices){
        println("Ingrese el elemento ${i + 1}:")
        arreglo[i]= readln().toInt()
        suma += arreglo[i]
    }
    for(i in arreglo.indices){
        if (arreglo[i]>= 36){
            mayores += arreglo[i]
        }
        if (arreglo[i]>=50){
            sumas50 ++
        }
    }
    println("El total de los elementos es: $suma")
    println("El total de los elementos mayores a 36 es: $mayores")
    println("La cantidad de elementos mayores a 50 es: $sumas50")
}