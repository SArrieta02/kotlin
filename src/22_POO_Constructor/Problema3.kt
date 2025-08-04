package `22_POO_Constructor`

/*Desarrollar una clase Rectangulo con propiedades base y altura (ambas de tipo Int).
Crear el constructor principal con estas propiedades y un bloque init que valide que ningún valor sea menor o igual a 0, y si lo es, se le asigna 1 por defecto.
Agregar los métodos:
area(): que calcule y retorne el área.


esCuadrado(): que retorna un mensaje indicando si es un cuadrado (base y altura iguales) o un rectángulo común.


Objetivo didáctico: Reforzar el uso del constructor principal junto al bloque init y lógica condicional en métodos.
*/
class Rectangulo(var base: Int,var altura: Int){
    init{
        if(base <= 0){
            base = 1
        }
        if(altura <= 0){
            altura = 1
        }
    }
    fun area(){
        val area = base * altura / 2
        println("El area es de $area")
    }
    fun esCuadrado(){
        if (base == altura){
            println("Es un cuadrado")
        }else{
            println("Es un rectángulo")
        }
    }
}
fun main(){
    println("Digite la base:")
    val base: Int = readln().toInt()
    println("Digite la altura:")
    val altura: Int = readln().toInt()
    val rectangulo = Rectangulo(base,altura)
    rectangulo.area()
    rectangulo.esCuadrado()
}