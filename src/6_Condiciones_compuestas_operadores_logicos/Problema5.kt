package `6_Condiciones_compuestas_operadores_logicos`

/*
Escribir un programa en el cual: dada una lista de tres valores enteros ingresados por teclado se guarde en otras dos variables el
 menor y el mayor de esa lista. Utilizar el if como expresión para obtener el mayor y el menor.
 */
fun main (){
    print("Escriba el primer numero:")
    val uno: Int = readln().toInt()
    print("Escriba el segundo numero:")
    val dos: Int = readln().toInt()
    print("Escriba el tercer numero:")
    val tres: Int = readln().toInt()
    val mayor = if (uno>= dos && uno>= dos){
        uno
    } else if (dos>= uno && dos>= tres) {
        dos
    } else {
        tres
    }
    val menor = if (uno<= dos && uno<= tres) {
        uno
    } else if (dos<= uno && dos<= tres) {
        dos
    } else {
        tres
    }

    println("El numero mayor es $mayor")
    println("El numero menor es $menor")
}

