package `9_Estructura_repetitiva_for`

/*Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triángulo. El programa deberá informar:

a) De cada triángulo la medida de su base, su altura y su superficie (la superficie se calcula multiplicando la base por la altura y dividiendo por dos).
b) La cantidad de triángulos cuya superficie es mayor a 12.
*/
fun main() {
    var base = 0
    var altura = 0
    var cantsuperficie = 0
    var superficie = 0
    print("Cuantos pares de datos del triangulo quiere ingresar:")
    val cantidad = readln().toInt()
    for (i in 1 .. cantidad) {
        println("Ingrese la base del triangulo:")
        val base = readln().toInt()
        println("Ingrese la altura del triangulo:")
        val altura = readln().toInt()
        val superficie = base * altura / 2
        if (superficie >= 12) {
            cantsuperficie++
        }
        println("La base es : $base")
        println("La altura es: $altura")
        println("La superficie es: $superficie")
    }
   println("Los triangulos que tienen la superficie mayor a 12 son: $cantsuperficie")
}