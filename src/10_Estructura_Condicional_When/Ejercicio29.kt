package `10_Estructura_Condicional_When`

fun main(){
    var total = 0
    for (i in 1 .. 10){
        print("Ingrese sueldo del operario:")
        val sueldo= readln().toInt()
        total += when{
            sueldo > 5000 -> {
                println("Sueldo alto")
                sueldo
            }
            sueldo > 2000 -> {
                println("Sueldo medio")
                0
            }
            else -> {
                println("Sueldo bajo")
                0
            }
        }
    }
        println("Gastos totales en sueldos altos: $total")
}