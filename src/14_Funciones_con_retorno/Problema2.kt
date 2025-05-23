package `14_Funciones_con_retorno`

/*Confeccionar una función que calcule la superficie de un rectángulo y la retorna,
la función recibe como parámetros los valores de dos de sus lados:
*/
fun superficie (v1: Double, v2: Double): Double{
    val superficie = (v1 * v2)
    return superficie
}
fun main(){
    print("Digite el primer lado:")
    val lado1 = readln().toDouble()
    print("Digite el segundo lado:")
    val lado2 = readln().toDouble()
    print("La superficie del rectangulo es: ${superficie (lado1,lado2)}")
}