package `13_Funciones_Parametros`

fun mostrarMensaje(mensaje: String){
    println("***********************")
    println(mensaje)
    println("***********************")
}
fun cargarsuma(){
    println("Ingrese el primer valor:")
    val val1 = readln().toInt()
    println("Ingrese el segundo valor:")
    val val2 = readln().toInt()
    val suma = val1 + val2
    println("La suma de los dos valores es: $suma")
}
fun main(){
    mostrarMensaje("El programa calcula la suma de dos valores ingresados por teclado")
    cargarsuma()
    mostrarMensaje("Gracias por utilizar este programa")
}
