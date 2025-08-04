package `24_POO_Colaboracion_clases`

/*Problema 2
Objetivo:
Simular el control de asistencia de un grupo de estudiantes en una clase.
🔹 Clase Estudiante
Atributos:
nombre: String → nombre del estudiante.
asistencias: Int → cantidad de veces que ha asistido.
Métodos:
registrarAsistencia()
Aumenta en 1 el número de asistencias del estudiante.
imprimir()
Muestra el nombre del estudiante y su número de asistencias.
🔹 Clase Clase
Atributos:
est1, est2, est3: Instancias de la clase Estudiante.


Métodos:
marcarAsistencia()
Llama al método registrarAsistencia() de cada estudiante.
reporte()
Llama al método imprimir() de cada estudiante.


🔹 Lógica de colaboración:
La clase Clase organiza y gestiona múltiples objetos de tipo Estudiante, y actúa como un coordinador de acciones, sin modificar directamente sus atributos.*/

class Estudiante(val estudiante: String){
    var asistencias: Int = 0

    fun registrarAsistencia(){
        val comprobacion: String
        println("El estudiante $estudiante asistio a clase?")
        comprobacion = readln().toString()
        if (comprobacion == "Si" ){
            asistencias ++
        }
    }
    fun imprimir(){
        println("El estudiante $estudiante tiene $asistencias asitencias")
    }
}

class Clase{
    val est1: Estudiante = Estudiante ("Eydan")
    val est2: Estudiante = Estudiante ("Dominick")
    val est3: Estudiante = Estudiante ("Julian")

    fun marcarAsistencia(){
        est1.registrarAsistencia()
        est2.registrarAsistencia()
        est3.registrarAsistencia()
    }

    fun reporte(){
        est1.imprimir()
        est2.imprimir()
        est3.imprimir()
    }
}

fun main(){
    val clase1 = Clase()
    clase1.marcarAsistencia()
    clase1.reporte()
}