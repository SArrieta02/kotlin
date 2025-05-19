package `13_Funciones_Parametros`

/*Confeccionar una función que reciba tres enteros y los muestre ordenados de menor a mayor.
En la función main solicitar la carga de 3 enteros por teclado y proceder a llamar a la función ordenadrMayorMenor.
El algoritmo evalúa distintas combinaciones mediante estructuras condicionales when y if/else,
comparando los valores entre sí. Se trata de un ejemplo práctico para reforzar:
La entrada de datos desde consola.


Conversión de String a Int usando .toInt().


El uso combinado de when y if para resolver condiciones múltiples.


La impresión ordenada de los resultados.
*/
fun ordenarMayorMenor(num1: Int, num2: Int, num3: Int) {
    var menor = 0
    var medio = 0
    var mayor = 0
    if (num1 <= num2 && num1 <= num3) {
        menor = num1
        when {
            num2 <= num3 -> {
                medio = num2
                mayor = num3
            }

            else -> {
                medio = num3
                mayor = num2
            }
        }
    }else if (num2 <= num1 && num2 <= num3){
            menor = num2
            when {
                num1 <= num3 -> {
                    medio = num1
                    mayor = num3
                }

                else -> {
                    medio = num3
                    mayor = num1
                }
            }
        } else {
            menor = num3
            when {
                num1 <= num2 -> {
                    medio = num1
                    mayor = num2
                }

                else -> {
                    medio = num2
                    mayor = num1
                }
            }
        }
        println("El orden de menor a mayor es: $menor,$medio,$mayor")
}
fun main(){
    println("Digite el primer número:")
    val val1 = readln().toInt()
    println("Digite el segundo número:")
    val val2 = readln().toInt()
    println("Digite el tercer número:")
    val val3 = readln().toInt()
    ordenarMayorMenor(val1,val2,val3)
}