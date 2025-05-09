package `10_Estructura_Condicional_When`
/*Se ingresa por teclado un valor entero, mostrar una leyenda
por pantalla que indique si el número es
positivo, nulo o negativo.*/
fun main(){
    print("Ingrese un valor entero:")
    val num = readln().toInt()
    when{
        num > 0 -> println("Es positivo")
        num < 0 -> println("Es negativo")
        num == 0 -> println("Es nulo")
    }
}