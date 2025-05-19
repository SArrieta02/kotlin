package `12_Concepto_de_funciones`

/*Desarrollar una función que solicite la carga de tres valores y muestre el menor.
Desde la función main del programa llamar 2 veces a dicha función (sin utilizar una estructura repetitiva)
*/
fun menor(){
    print("Digite el primer valor:")
    val num1 = readln().toInt()
    print("Digite el segundo valor:")
    val num2 = readln().toInt()
    print("Digite el tercer valor:")
    val num3 = readln().toInt()
    if ( num1 < num2 && num1 < num3){
        println("El número menor es: $num1")
    }
    if ( num2 < num1 && num2 < num3){
        println("El número menor es: $num2")

    }
    if (num3 < num1 && num3 < num2){
    println("El número menor es: $num3")
    }

}
fun main() {
    menor()
    menor()
}