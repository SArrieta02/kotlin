package `9_Estructura_repetitiva_for`

fun main() {
    var cant = 0
    print("Cuantos valores ingresará para analizar:")
    val cantidad = readln().toInt()
    for (i in 1 .. cantidad){
        print("Ingrese valor:")
        val valor = readln().toInt()
        if (valor % 2 == 0)
            cant++
    }
println("La cantidad de pares son: $cant")
}