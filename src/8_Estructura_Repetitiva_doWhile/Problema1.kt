package `8_Estructura_Repetitiva_doWhile`
/*Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999
(no sumar dicho valor,
indica que ha finalizado la carga). Imprimir el valor acumulado e informar
 si dicho valor es cero, mayor a cero
o menor a cero.
*/
fun main(){
    var suma = 0
    var valor = 0
    do{
        print("Digite el valor que desee:")
        val valor = readln().toInt()
        if( valor != 9999) {
            suma += valor
        }
    } while (valor != 9999)
    println("La suma de todos los valores es: $suma")
    if (suma > 0)
        println("El valor es mayor a 0")
    else if (suma < 0)
        println("El valor es menor a 0")
    else
        println("El valor es igual a 0")
}