package `3_Estructura_condicional_if`

/*Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un mensaje indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)*/
fun main() {
    print("Ingrese un numero del 1 al 99:")
    val num: Int = readln().toInt()
    if (num >= 1 && num <= 9) {
        print("El numero tiene un digito")
    }
    if (num >= 10 && num <= 99) {
        print("El numero tiene dos digitos")
    }
    if (num < 1 || num > 99){
        print("Tiene mas de dos digitos")
    }
}
