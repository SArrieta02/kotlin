package `6_Condiciones_compuestas_operadores_logicos`

/*
Ejercicio 12
Confeccionar un programa que lea por teclado tres numeros y nos muestre el mayor
 */
fun main () {
    print("Ingrese primer valor:")
    val num1: Int = readln(). toInt()
    print("Ingrese segundo valor:")
    val num2: Int = readln(). toInt()
    print("Ingrese tercer valor:")
    val num3: Int = readln(). toInt()
    if (num1 > num2 &&  num1 > num3)
        print (num1)
        else
            if (num2 > num3)
                print (num2)
            else
                print(num3)
}

