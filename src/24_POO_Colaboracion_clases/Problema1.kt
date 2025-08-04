package `24_POO_Colaboracion_clases`

/*Problema 1
Objetivo:
Simular el préstamo y devolución de libros en una biblioteca usando dos clases que colaboran entre sí.
🔹 Clase Libro
Atributos:
titulo: String → nombre del libro.
prestado: Boolean → indica si el libro está prestado (true) o disponible (false).

Métodos:
prestar()
Si el libro no está prestado, lo marca como prestado.
Si ya está prestado, imprime un mensaje indicando que no se puede prestar.

devolver()
Si el libro está prestado, lo marca como disponible.
Si ya estaba disponible, imprime que no es necesario devolverlo.

estado()
Imprime el título del libro y si está "prestado" o "disponible".

🔹 Clase Biblioteca
Atributos:
libro1, libro2, libro3: Instancias de la clase Libro.
Métodos:
operar()
Realiza operaciones sobre los libros: presta algunos, devuelve otros.
revisarEstado()
Llama al método estado() de cada libro para mostrar su situación.

🔹 Lógica de colaboración:
La clase Biblioteca no gestiona directamente los estados, sino que invoca métodos de sus objetos Libro para realizar las operaciones. Esta es una relación de colaboración directa entre objetos.
*/

class libro( val titulo: String, var prestado: Boolean) {

    fun prestar() {
        if (prestado == false) {
            println("El libro $titulo esta disponible")
        } else {
            println("El libro $titulo no se puede prestar")
        }
    }

    fun devolver() {
        if (prestado == true) {
            println("El libro $titulo esta disponible")
        } else {
            println("El libro $titulo no es necesario devolverlo")
        }
    }
    fun estado(){
        if (prestado == true){
            println("El libro $titulo esta prestado")
        }else{
            println("El libro $titulo esta disponible")
        }
    }
}
class Biblioteca{
    val Libro1: libro = libro("Harry Poter", true)
    val Libro2: libro = libro("Ana Frank", false)
    val Libro3: libro = libro("El niño en silla de ruedas", true)

    fun operar(){
        Libro1.devolver()
        Libro2.prestar()
        Libro3.devolver()
    }

    fun revisarEstado(){
        Libro1.estado()
        Libro2.estado()
        Libro3.estado()
    }
}

fun main(){
    val biblioteca = Biblioteca()
    biblioteca.operar()
    biblioteca.revisarEstado(

    )
}