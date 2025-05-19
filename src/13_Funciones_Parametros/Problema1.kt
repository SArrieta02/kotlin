package `13_Funciones_Parametros`

/*Desarrolla un programa en Kotlin que le pide al usuario ingresar una clave dos veces.
El programa debe verificar si ambas entradas son iguales y mostrar un mensaje en consecuencia.

El programa consta de dos partes principales:

Una función llamada verificarClaves que recibe dos textos (las claves) y verifica si son iguales.

Una función principal main que pide al usuario que ingrese dos veces una clave y luego llama a verificarClaves para comprobar si ambas coinciden.
*/
fun verificarClaves(c1 : String, c2 : String){
    if (c1 == c2){
        println("Las claves son iguales")
    }else{
        println("Las claves no coinciden")
    }
}
fun main (){
    println("Ingrese la contraseña:")
    val clave1 = readln().toString()
    println("Ingrese otra vez la contraseña:")
    val clave2 = readln().toString()
    verificarClaves(clave1,clave2)
}