package `2_Entrada_de_datos`

/*Realizar un programa que lea por teclado cuatro valores numéricos enteros e informe su suma y promedio.
*/
fun main () {
    print ("Digite el primer numero:")
    val num1: Int = readln() .toInt()
    print ("Digite el segundo numero:")
    val num2: Int = readln() .toInt()
    print ("Digite el tercer numero:")
    val num3: Int = readln() .toInt()
    print ("Digite el cuarto numero:")
    val num4: Int = readln() .toInt()
    val suma: Int = num1 + num2 + num3 + num4
    println("La suma de los numeros es: $suma")
    val promedio: Int = suma/4
    println("El promedio de los numeros es: $promedio")
}
