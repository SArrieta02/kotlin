package `9_Estructura_repetitiva_for`

/*Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
b) Cantidad de triángulos de cada tipo.
*/
fun main(){
    var num1 = 0
    var num2 = 0
    var num3 = 0
    var equiláteros = 0
    var isósceles = 0
    var escalenos = 0
    print("Cuantos triangulos va a ingresar:")
    val cant = readln().toInt()
    for (i in 1 .. cant){
        println("Ingrese el primer lado:")
        val num1 = readln().toInt()
        println("Ingrese el segundo lado:")
        val num2 = readln().toInt()
        println("Ingrese el tercer lado:")
        val num3 = readln().toInt()
        if (num1 == num2 && num2 == num3){
            println("El triangulo es equilátero")
            equiláteros++
        }else if (num1 == num2 || num2 == num3 || num1 == num3){
            println("El triangulo es isósceles")
            isósceles++
        }else{
            println("El triangulo es escaleno")
            escalenos++
        }
    }
    println("La cantidad de triangulos equiláteros son: $equiláteros")
    println("La cantidad de triangulos isósceles son: $isósceles")
    println("La cantidad de triangulos escalenos son: $escalenos")
}