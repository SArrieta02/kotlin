package `6_Condiciones_compuestas_operadores_logicos`

/*
Se ingresan tres valores por teclado, si todos son iguales calcular el cubo del número y mostrarlo.
 */
fun main() {
    print("Escriba el primer numero:")
    val uno: Int = readln().toInt()
    print("Escriba el segundo numero:")
    val dos: Int = readln().toInt()
    print("Escriba el tercer numero:")
    val tres: Int = readln().toInt()
    if (uno == dos && dos == tres){
        val cubo = uno * uno * uno
        print(cubo)
    } else {
        print("Los lados son diferentes")
    }
}