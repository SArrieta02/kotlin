package `20_Funciones_tipo_arreglo`

/*Desarrollar un programa que permita ingresar un arreglo de n elementos, ingresar n por teclado.
Elaborar dos funciones una donde se lo cree y cargue al arreglo y otra que sume todos sus elementos y retorne dicho valor a la main donde se lo imprima.
*/
fun elementos():IntArray{
    print("Ingrese cuantos elementos va a ingresar:")
    val contador = readln().toInt()
    val elemento = IntArray (contador)
    for (i in elemento.indices) {
        print("Ingrese el $i elemento:")
        elemento[i] = readln().toInt()
    }
    return elemento
}
fun suma (suma:IntArray): Int{
    var s = 0
    for (i in suma.indices){
        s += suma[i]
    }
    return s
}
fun main(){
    val elementos = elementos()
    val suma = suma (elementos)
    println("La suma de los elementos es: $suma")

}