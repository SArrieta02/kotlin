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
data class cine(var ocupada: Boolean = true){
    var numero: Int
}
fun main() {
    var valor: Int = 0
    val butacas: IntArray
    butacas = IntArray(5)
    val cine1 = cine()
    for (i in 0 .. 4){
        
        valor = ((Math.random() * 5) + 1).toInt()
        if ( == valor){
            cine1.ocupada = true
            print(cine1)
        }else{
            cine1.ocupada = false
        }
    }
}