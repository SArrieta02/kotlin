package `6_Condiciones_compuestas_operadores_logicos`

/*
Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, imprimir en pantalla la leyenda "Todos los números son menores a diez".
 */
fun main() {
    print("Escriba el primer numero:")
    val uno: Int = readln().toInt()
    print("Escriba el segundo numero:")
    val dos: Int = readln().toInt()
    print("Escriba el tercer numero:")
    val tres: Int = readln().toInt()
    if (uno < 10 && dos < 10 && tres < 10)
        print("Todos los numeros son menores a diez")
}