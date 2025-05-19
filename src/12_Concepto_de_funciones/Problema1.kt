package `12_Concepto_de_funciones`

/*Desarrollar un programa con dos funciones. La primera solicite el ingreso de un entero y muestre el cuadrado de dicho valor.
La segunda que solicite la carga de dos valores y muestre el producto de los mismos. Llamar desde la main a ambas funciones.
*/
fun cuadrado(){
    print("Ingrese un valor entero:")
    val num = readln().toInt()
    val resul = num * 2
    println("El cuadrado de ese número es: $resul")
}
fun producto (){
    print("Ingrese el primer valor entero:")
    val num1 = readln().toInt()
    print("Ingrese el segundo valor entero:")
    val num2 = readln().toInt()
    val produc = num1 * num2
    println("El producto de los números es: $produc")
}
fun main (){
    cuadrado()
    producto()
}