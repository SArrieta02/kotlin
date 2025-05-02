package `6_Condiciones_compuestas_operadores_logicos`

/*
Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10, imprimir en pantalla la leyenda "Alguno de los números es menor a diez".
 */
fun main(){
    print("Escriba el primer numero:")
    val uno: Int = readln().toInt()
    print("Escriba el segundo numero:")
    val dos: Int = readln().toInt()
    print("Escriba el tercer numero:")
    val tres: Int = readln().toInt()
    if (uno < 10 || dos < 10 || tres < 10)
        print("Alguno de los números es menor a diez")
}