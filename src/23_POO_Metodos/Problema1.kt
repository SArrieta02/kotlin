package `23_POO_Metodos`

/*Problema 1
Crear una clase llamada Notas que almacene un arreglo con las calificaciones (enteros) de 4 estudiantes.
Implementar un método cargarNotas() que solicite las 4 notas desde teclado.


Desde ese mismo método, llamar a:


promedioNotas() → calcula y muestra el promedio.


aprobados() → muestra cuántos estudiantes tienen nota mayor o igual a 70.
*/
class Notas {
    var notas = IntArray (4)
    val i = 0
    var suma: Int = 0
    var Aprobados: Int = 0

    fun cargarNotas(){
        for (i in 0 .. 3){
            print ("Digite la nota del estudiante:")
            notas[i] = readln().toInt()
        }
        promedioNotas()
        aprobados()
    }
    fun promedioNotas(){
        for (i in 0 .. 3){
            suma += notas[i]
        }
        suma = suma / 4
        println("El promedio de las notas es: $suma")
    }
    fun aprobados(){
        for (i in 0 .. 3){
            if (notas[i] >= 70){
                Aprobados ++
            }
        }
        print("La cantidad de estudiantes aprobados es: $Aprobados")
    }
}
fun main(){
    val notas1 = Notas()
    notas1.cargarNotas()
}