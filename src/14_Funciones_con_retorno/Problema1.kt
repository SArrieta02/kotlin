package `14_Funciones_con_retorno`

/*Elaborar una función que reciba tres enteros y nos retorne el valor promedio de los mismos.
*/
fun promedio(v1: Int, v2: Int, v3: Int): Int{
    val prom = (v1 + v2 + v3) / 3
    return prom
}
fun main(){
    print("Digite el primer valor entero:")
    val valor1 = readln().toInt()
    print("Digite el Segundo valor entero:")
    val valor2 = readln().toInt()
    print("Digite el tercer valor entero:")
    val valor3 = readln().toInt()
    println("El promedio de $valor1, $valor2 y $valor3 es: ${promedio(valor1,valor2,valor3)}")
}