package `27_POO_Data_class`

/*Un pequeño cine quiere llevar el registro de las butacas que ya fueron vendidas para cada función. Cada butaca solo necesita guardar su número (1…N)
y si está ocupada (true/false)
Tarea para los estudiantes

Declarar un data class llamado Butaca con dos propiedades:
numero: Int
ocupada: Boolean

En main() construir una lista con 5 butacas (números 1..5) inicialmente libres (ocupada = false).
Simular la venta de 2 butacas: elegir al azar dos números distintos y marcarlas como ocupadas (ocupada = true).

Pista: usar random y un simple bucle para buscar el número.

Imprimir la lista completa de butacas usando println() y observar cómo se ve la salida por defecto del data class.

Volver a imprimir, pero ahora recorriendo la lista con un for y desestructurando las propiedades (número, ocupada) para mostrar un mensaje amigable:
“Butaca 3 → libre” o “Butaca 3 → ocupada”.

Hacer una copia de la lista antes de vender y comparar ambas listas con == para verificar que son distintas referencias.

 Sobreescribir toString() para que devuelva “Butaca #X” seguido de “(libre)” o “(ocupada)”.
*/
import kotlin.random.Random

data class cine(var numero: IntArray = intArrayOf(1, 2, 3, 4, 5)) {
    var ocupada = BooleanArray(5)
}

fun main() {
    val cine1 = cine()
    var valor1: Int = 0
    var valor2: Int = 0
    var butacas: IntArray = cine1.numero
    var ocupadas: BooleanArray = cine1.ocupada

    if (butacas == cine1.numero && ocupadas == cine1.ocupada) {
        for (i in 0..4) {
            butacas[i] = cine1.numero[i]
        }
        valor1 = Random.nextInt(1, 6)
        valor2 = Random.nextInt(1, 6)
        while (valor1 == valor2) {
            valor2 = Random.nextInt(1, 6)
        }
        for (i in 0..4) {
            if (butacas[i] == valor1 || butacas[i] == valor2) {
                ocupadas[i] = true
            } else {
                ocupadas[i] = false
            }
        }
        for (i in 0..4) {
            if (ocupadas[i] == true) {
                print("Butaca #")
                print(butacas[i])
                println(" Esta ocupada")
            } else {
                print("Butaca #")
                print(butacas[i])
                println(" Esta libre")
            }
        }
    }
}
