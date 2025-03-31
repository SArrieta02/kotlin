package `4_Estructura_condicional_como_expresion`
/*Solicita al usuario ingresar dos números enteros (pueden ser negativos). Luego, determina cuál de los dos tiene mayor valor absoluto y muestra ese número en pantalla.
*/
fun main() {
    print("Ingrese un numero entero:")
    val num1 = readln().toInt()
    print("Ingrese otro numero entero:")
    val num2 = readln().toInt()
    val mayor = if (num1 > num2) num1 else num2
    print("Es mayor: $mayor")
}

