package `9_Estructura_repetitiva_for`

fun main() {
    var mult3 = 0
    var mult5 = 0
    var mult9 = 0
    for (i in 1..10000) {
        if (i % 3 == 0)
            mult3++
        if (i % 5 == 0)
            mult5++
        if (i % 9 == 0)
            mult9++
    }
    println("Cantidad de multiplos de 3: $mult3")
    println("Cantidad de multiplos de 5: $mult5")
    println("Cantidad de multiplos de 9: $mult9")
}