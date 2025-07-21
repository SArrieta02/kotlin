package `22_POO_Constructor`

import `21_POO_Conceptos`.Triangulo


class Triangulo(var lado1: Int, var lado2: Int, var lado3: Int = 0){

    constructor():this(0,0,0){
        println("Ingrese el lado 1:")
        lado1 = readln().toInt()
        println("Ingrese el lado 2:")
        lado2 = readln().toInt()
        println("Ingrese el lado 3:")
        lado3 = readln().toInt()
    }
    fun ladoMayor(){
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado1 && lado2 > lado3 -> println(lado2)
            else ->println(lado3)
        }
    }
    fun esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            println("Es un triángulo equilátero")
        else
            println("No es un triángulo equilátero")

    }
}
fun main(){
    val triangulo1 = Triangulo()
    triangulo1.inicializar()
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()

    val triangulo2 = Triangulo(6,5,6)
    triangulo1.inicializar()
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}