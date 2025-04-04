package `5_Estructura_condicionales_anidadas`

/*Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.
*/
fun main() {
    print("Ingrese un numero positivo que no sea mayor a tres cifras: ")
    val num = readln().toInt()
    if (num > 0) {
        if (num >= 1 && num <= 9)
            print("Tiene una cifra")
            else if (num >= 10 && num <= 99)
                print("Tiene dos cifras")
                else if (num >= 100 && num <= 999)
                    print("Tiene tres cifras")
                    else if (num > 1 || num < 1000)
                         print(" Error tiene mas de tres cifras")
    }

}