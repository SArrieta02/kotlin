package `8_Estructura_Repetitiva_doWhile`

fun main(){
    do{
        print("Ingrese un valor comprendido entre 0 y 999:")
        val valor: Int = readln().toInt()
        if (valor < 100)
            println("El valor ingresado tiene un digito")
        else
            if (valor < 100)
                println("El valor ingresado tiene dos digitos")
            else
                println("El valor ingresado tiene tres digitos")
    }
}