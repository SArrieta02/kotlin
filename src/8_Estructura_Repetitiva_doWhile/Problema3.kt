package `8_Estructura_Repetitiva_doWhile`

/*Desarrolla un programa en Kotlin que simule una calculadora básica. El programa debe mostrar un menú con las siguientes operaciones:

Sumar dos números


Restar dos números


Multiplicar dos números


Dividir dos números


Salir
*/
fun main(){
    var menu = 0
    var num1 = 0
    var num2 = 0
    var operacion = 0
    do {
        println("Digite 1 para sumar dos números")
        println("Digite 2 para restar dos números")
        println("Digite 3 para Multiplicar dos números")
        println("Digite 4 para Dividir dos números")
        println("Digite 5 para salir")
        menu = readln().toInt()
        if (menu == 1) {
            println("Digite el primer número:")
            val num1 = readln().toInt()
            println("Digite el segundo número")
            val num2 = readln().toInt()
            operacion = num1 + num2
            println("El resultado es: $operacion")
        }
        if (menu == 2) {
            println("Digite el primer número:")
            val num1 = readln().toInt()
            println("Digite el segundo número")
            val num2 = readln().toInt()
            operacion = num1 - num2
            println("El resultado es: $operacion")
        }
        if (menu == 3){
            println("Digite el primer número:")
            val num1 = readln().toInt()
            println("Digite el segundo número")
            val num2 = readln().toInt()
            operacion = num1 * num2
            println("El resultado es: $operacion")
        }
        if (menu == 4){
            println("Digite el primer número:")
            val num1 = readln().toInt()
            println("Digite el segundo número")
            val num2 = readln().toInt()
            operacion = num1 / num2
            println("El resultado es: $operacion")
        }
    } while(menu != 5)
}