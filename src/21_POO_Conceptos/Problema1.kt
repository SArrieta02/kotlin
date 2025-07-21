package `21_POO_Conceptos`

/*
Implimentar una clase llamada Alumno que tenga como propiedades su nombre y su nota.
Definir los métodos para inicializar sus propiedades por teclado, imprimirlos y mostrar un mensaje si esta aprobado (nota mayor 70) o  reprobado (nota menor 70).
Definir dos objetos de clase Alumno*/
class Alumno{
    var nombre: String = ""
    var nota: Int = 0

    fun inicializar(){
        println("Ingrese su nombre:")
        nombre = readln().toString()
        println("Ingrese su nota:")
        nota = readln().toInt()
    }
    fun imprimir(){
        println("La nota de $nombre es: $nota")
    }
    fun AprobadoReprobado(){
        if (nota >= 70){
            println("Esta Aprobado")
        }
        else
            println("Esta Reprobado")
    }
}
fun main(){
    val alumno1 = Alumno()
    alumno1.inicializar()
    alumno1.imprimir()
    alumno1.AprobadoReprobado()

    val alumno2 = Alumno()
    alumno2.inicializar()
    alumno2.imprimir()
    alumno2.AprobadoReprobado()

}