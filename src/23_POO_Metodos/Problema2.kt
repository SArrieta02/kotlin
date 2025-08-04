package `23_POO_Metodos`

/*Problema 2
Diseñar una clase Temperaturas que contenga un arreglo con las temperaturas registradas durante 7 días.
Implementar un método cargarDatos() que permita ingresar las 7 temperaturas desde teclado.


Desde ese método, llamar a:


mostrarMaxima() → imprime la temperatura más alta.


mostrarMinima() → imprime la más baja.
*/

class Temperaturas {
    val temps = IntArray (7)
    var tempMax: Int = 0
    var tempMin: Int = 100
    var x: Int = 1

    fun cargarDatos(){
        for (i in 0 .. 6){
         print("Digite la temperatura del dia $x:")
         temps[i] = readln().toInt()
         x ++
        }
        mostrarMaxima()
        mostrarMinima()
    }
    fun mostrarMaxima(){
        for (i in 0 .. 6){
            if (temps[i] > tempMax){
                tempMax = temps[i]
            }
        }
        println("La temperatura más alta fue de $tempMax")
    }
    fun mostrarMinima(){
        for (i in 0 .. 6) {
            if (temps[i] < tempMin) {
                tempMin = temps[i]
            }
        }
        println("La temperatura más baja fue de $tempMin")
    }
}
fun main(){
    val temperaturas = Temperaturas()
    temperaturas.cargarDatos()
}