package `10_Estructura_Condicional_When`

/*Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles (dos lados iguales), o escaleno (ningún lado igual)
b) Cantidad de triángulos de cada tipo.*/
var num1 = 0
var num2 = 0
var num3 = 0
var equilatero = 0
var isosceles = 0
var escaleno = 0
fun main(){
    print("Cuantos triángulos va a digitar:")
    val t = readln().toInt()
    for (i in 1 .. t){
        println("Digite el primer lado del triángulo:")
        val num1 = readln().toInt()
        println("Digite el segundo lado del triángulo:")
        val num2 = readln().toInt()
        println("Digite el tercer lado del triángulo:")
        val num3 = readln().toInt()
        when{
            num1 == num2 && num2 == num3 -> {
                println("El triángulo es equilátero")
                equilatero ++
            }

            num1 == num2 || num2 == num3 || num1 == num3 ->{
                println("El triángulo es isósceles")
                isosceles ++
            }
            else -> {
                println("El triángulo es escaleno")
                escaleno++
            }
        }
    }
    println("La cantidad de triángulos equiláteros son: $equilatero")
    println("La cantidad de triángulos isósceles son: $isosceles")
    println("La cantidad de triángulos escalenos son: $escaleno")
}