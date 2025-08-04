package `22_POO_Constructor`

/*Diseñar una clase llamada Libro que reciba en el constructor principal el título, el autor y la cantidad de páginas.
Implementar un segundo constructor (secundario) que permita ingresar estos datos desde teclado (readln()).
Agregar un método leer(paginasLeidas: Int) que indique cuántas páginas quedan por leer.
Agregar un método infoLibro() que muestre toda la información del libro.
Objetivo didáctico: Utilizar múltiples constructores en una misma clase y aplicar lógica básica con métodos personalizados.
*/
class Libro(var título : String,var autor: String,var cantidad_de_páginas: Int){

    constructor():this(" "," ",0){
        println("Digite el título del libro:")
        título = readln().toString()
        println("Digite el autor del libro:")
        autor = readln().toString()
        println("Digite la cantidad de páginas del libro:")
        cantidad_de_páginas = readln().toInt()
        println("****************")
    }

    fun leer(paginasLeidas:Int){
        val páginas_por_leer = cantidad_de_páginas - paginasLeidas
        println("Quedan $páginas_por_leer páginas por leer")
        println("****************")
    }
    fun infoLibro(){
        println("El título del libro es $título")
        println("El autor del libro es $autor")
        println("Cantidad de pagínas del libro son $cantidad_de_páginas")
    }
}
fun main(){
    val libro = Libro()
    libro.infoLibro()
    println("Cuantas páginas ah leído?")
    val páginas = readln().toInt()
    //*****************************************
    libro.leer(páginas)
}