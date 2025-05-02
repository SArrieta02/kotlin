package `6_Condiciones_compuestas_operadores_logicos`

/*
se carga una fecha (dia,mes y año) por teclado, Mostrar un mensaje si corresponde al primer trimstre del año (Enero, Febrero o marzo)
 */
fun main(){
    print("Ingrese dia:")
    val dia: Int = readln(). toInt()
    print("Ingrese mes:")
    val mes: Int = readln(). toInt()
    print("Ingrese Año:")
    val año: Int = readln(). toInt()
    if (mes == 1 || mes == 2 || mes == 3)
        print("Corresponde al primer trimestre")
}
