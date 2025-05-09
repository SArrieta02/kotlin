package `10_Estructura_Condicional_When`

/*Plantear una estructura que se repita 5 veces y dentro de la
misma cargar 3 valores enteros.
Acumular solo el mayor del cada lista de tres valores.*/
fun main(){
    var num1 = 0
    var num2 = 0
    var num3 = 0
    var total = 0
    for (i in 1 .. 5){
        println("Digite el primer valor entero:")
        val num1 = readln().toInt()
        println("Digite el segundo valor entero:")
        val num2 = readln().toInt()
        println("Digite el tercer valor entero:")
        val num3 = readln().toInt()
        when{
            num1 > num2 && num1 > num3 -> {
                total += num1
            }
            num2 > num1 && num2 > num3 -> {
                total += num2

            }
            num3 > num1 && num3 > num2 -> {
                total += num3
            }
            else ->
                println("No hay un número mayor")
        }

    }
    println("La suma de todos los numeros mayores es: $total")
}