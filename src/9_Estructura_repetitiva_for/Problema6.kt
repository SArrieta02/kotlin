package `9_Estructura_repetitiva_for`

/*Escribir un programa que pida ingresar coordenadas (x,y) que representan puntos en el plano.
Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto cuadrante.
Al comenzar el programa se pide que se ingrese la cantidad de puntos a procesar.*/
fun main(){
    print("Cuantas coordenadas va a procesar:")
    val cant = readln().toInt()
    var primer = 0
    var segundo = 0
    var tercer = 0
    var cuarto = 0
    for (i in 1 .. cant) {
        println("Ingrese la coordenada x:")
        val x = readln().toInt()
        println("Ingrese la coordenada y:")
        val y = readln().toInt()
        when {
            x > 0 && y > 0 -> primer++
            x < 0 && y > 0 -> segundo++
            x < 0 && y < 0 -> tercer++
            x > 0 && y < 0 -> cuarto++
            }
        }
println("Puntos en el primer cuadrante: $primer")
println("Puntos en el segundo cuadrate: $segundo")
println("Puntos en el tercer cuadrante: $tercer")
println("Puntos en el cuarto cuadrante: $cuarto")
}