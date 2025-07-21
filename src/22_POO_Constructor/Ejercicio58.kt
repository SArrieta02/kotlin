package `22_POO_Constructor`

class Triangulo2(var lado1: Int, var lado2: Int, var lado3: Int ){

    fun ladoMayor(){
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado1 && lado2 > lado3 -> println(lado2)
            else ->println(lado3)
        }
    }
    fun esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            print("Es un triángulo equilátero")
        else
            print("No es un triángulo equilátero")

    }
}
fun main(){
    val triangulo1 = Triangulo2(6,9,3)
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}