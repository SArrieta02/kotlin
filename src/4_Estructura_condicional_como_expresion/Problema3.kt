package `4_Estructura_condicional_como_expresion`

/*Solicita al usuario que ingrese tres valores enteros positivos que representan los lados de un triángulo. Valida primero que puedan formar un triángulo (la suma de dos lados debe ser mayor al tercero).
Si es válido, guarda en una variable el tipo de triángulo usando una expresión if:
"Equilátero" si los tres lados son iguales.
"Isósceles" si dos lados son iguales.
"Escaleno" si todos los lados son distintos.
Imprime el tipo de triángulo o un mensaje de error si no forman uno válido.
 */
fun main() {
    print("Ingrese el primer lado del triangulo:")
    val lado1 = readln().toInt()
    print("Ingrese el segundo lado del triangulo:")
    val lado2 = readln().toInt()
    print("Ingrese el tercer lado del triangulo:")
    val lado3 = readln().toInt()
    if (lado1 + lado2 > lado3) {
        if (lado1 == lado2 && lado2 == lado3)
            print("El triangulo es Equilatero")
        else if (lado1 == lado2 || lado2 == lado3|| lado1==lado3)
            print("El triangulo es Isósceles")
        else
            print("El triangulo es Escaleno")
    }
}
