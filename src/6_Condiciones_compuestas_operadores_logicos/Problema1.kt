package `6_Condiciones_compuestas_operadores_logicos`

/*
Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.
 */
fun main (){
    print("Ingrese el dia:")
    val dia: Int = readln(). toInt()
    print ("Ingrese el mes:")
    val mes: Int = readln(). toInt()
    if (mes == 12 && dia == 25)
        print("Es navidad")
    else
        print("No es navidad")
}